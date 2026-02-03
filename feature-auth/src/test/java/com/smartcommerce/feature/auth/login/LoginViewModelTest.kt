package com.smartcommerce.feature.auth.login

import app.cash.turbine.test
import com.smartcommerce.domain.model.AuthResult
import com.smartcommerce.domain.usecase.LoginUseCase
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class LoginViewModelTest {

    private val loginUseCase = mockk<LoginUseCase>()
    private lateinit var viewModel: LoginViewModel
    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
        viewModel = LoginViewModel(loginUseCase)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `initial state is valid`() = runTest {
        viewModel.state.test {
            val state = awaitItem()
            assertEquals("", state.email)
            assertEquals("", state.password)
            assertFalse(state.isLoading)
            ensureAllEventsConsumed()
        }
    }

    @Test
    fun `email changed updates state`() = runTest {
        viewModel.state.test {
            awaitItem() // Initial state
            viewModel.onEvent(LoginEvent.EmailChanged("test"))
            val state = awaitItem()
            assertEquals("test", state.email)
        }
    }

    @Test
    fun `login success updates state`() = runTest {
        val email = "test@example.com"
        val password = "password123"
        coEvery { loginUseCase(email, password) } returns AuthResult.Success("token")

        viewModel.onEvent(LoginEvent.EmailChanged(email))
        viewModel.onEvent(LoginEvent.PasswordChanged(password))
        
        viewModel.state.test {
             // Skip initial emission and intermediate updates from text changes if needed, 
             // but turbine captures all. 
             // Current state in flow is already updated with email/pass due to previous calls if we collected, 
             // but here we start collection new. stateflow replays 1.
             
             // Let's just consume the current state first
             val currentState = awaitItem()
             assertEquals(email, currentState.email)
             
             viewModel.onEvent(LoginEvent.LoginClicked)
             
             // Expect loading
             val loadingState = awaitItem()
             assertTrue(loadingState.isLoading)
             
             // Expect success
             // Since we use StandardTestDispatcher, we might need to advance time or runCurrent if there are delays.
             // But ViewModel uses viewModelScope which defaults to Main.Main.
             // We set Main to StandardTestDispatcher.
             testDispatcher.scheduler.advanceUntilIdle() // Ensure coroutines run
             
             val successState = awaitItem()
             assertFalse(successState.isLoading)
             assertTrue(successState.isSuccess)
        }
    }

    @Test
    fun `login failure updates error`() = runTest {
         val email = "test@example.com"
        val password = "wrong"
        val errorMessage = "Invalid credentials"
        coEvery { loginUseCase(email, password) } returns AuthResult.Error(errorMessage)

        viewModel.onEvent(LoginEvent.EmailChanged(email))
        viewModel.onEvent(LoginEvent.PasswordChanged(password))

        viewModel.state.test {
            awaitItem() // current
            viewModel.onEvent(LoginEvent.LoginClicked)
            awaitItem() // loading
            
            testDispatcher.scheduler.advanceUntilIdle()
            
            val errorState = awaitItem()
            assertFalse(errorState.isLoading)
            assertEquals(errorMessage, errorState.error)
        }
    }
}
