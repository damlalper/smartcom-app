package com.smartcommerce.feature.checkout

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.smartcommerce.domain.repository.CartRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed class CheckoutUiState {
    data object Idle : CheckoutUiState()
    data object Processing : CheckoutUiState()
    data object Success : CheckoutUiState()
    data class Error(val message: String) : CheckoutUiState()
}

@HiltViewModel
class CheckoutViewModel @Inject constructor(
    private val cartRepository: CartRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<CheckoutUiState>(CheckoutUiState.Idle)
    val uiState: StateFlow<CheckoutUiState> = _uiState.asStateFlow()

    private val _totalAmount = MutableStateFlow(0.0)
    val totalAmount: StateFlow<Double> = _totalAmount.asStateFlow()

    init {
        viewModelScope.launch {
            val items = cartRepository.cartItems.first()
            _totalAmount.value = items.sumOf { it.product.price * it.quantity }
        }
    }

    fun processPayment() {
        viewModelScope.launch {
            _uiState.value = CheckoutUiState.Processing
            delay(2000) // Simulate payment processing delay
            
            // Simulate success
            cartRepository.clearCart()
            _uiState.value = CheckoutUiState.Success
        }
    }
}
