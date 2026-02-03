package com.smartcommerce.domain.usecase

import com.smartcommerce.domain.model.AuthResult
import com.smartcommerce.domain.repository.AuthRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class LoginUseCaseTest {

    private val authRepository = mockk<AuthRepository>()
    private val loginUseCase = LoginUseCase(authRepository)

    @Test
    fun `invoke returns error when email is blank`() = runBlocking {
        val result = loginUseCase("", "password")
        assertTrue(result is AuthResult.Error)
        assertEquals("Email and password cannot be empty", (result as AuthResult.Error).message)
    }

    @Test
    fun `invoke returns error when password is blank`() = runBlocking {
        val result = loginUseCase("email", "")
        assertTrue(result is AuthResult.Error)
    }

    @Test
    fun `invoke calls repository when inputs are valid`() = runBlocking {
        val email = "test@example.com"
        val password = "password"
        val expectedToken = "token"
        
        coEvery { authRepository.login(email, password) } returns AuthResult.Success(expectedToken)

        val result = loginUseCase(email, password)
        
        assertTrue(result is AuthResult.Success)
        assertEquals(expectedToken, (result as AuthResult.Success).token)
    }
}
