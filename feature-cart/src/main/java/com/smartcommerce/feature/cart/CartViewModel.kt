package com.smartcommerce.feature.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.smartcommerce.domain.repository.CartRepository
import com.smartcommerce.feature.cart.mvi.CartEffect
import com.smartcommerce.feature.cart.mvi.CartIntent
import com.smartcommerce.feature.cart.mvi.CartState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CartViewModel @Inject constructor(
    private val cartRepository: CartRepository
) : ViewModel() {

    private val _state = MutableStateFlow(CartState())
    val state: StateFlow<CartState> = _state.asStateFlow()

    private val _effect = Channel<CartEffect>()
    val effect = _effect.receiveAsFlow()

    init {
        viewModelScope.launch {
            cartRepository.cartItems.collectLatest { items ->
                val total = items.sumOf { it.product.price * it.quantity }
                _state.update { it.copy(cartItems = items, totalAmount = total) }
            }
        }
    }

    fun handleIntent(intent: CartIntent) {
        viewModelScope.launch {
            when (intent) {
                is CartIntent.RemoveFromCart -> {
                    cartRepository.removeFromCart(intent.productId)
                }
                CartIntent.ClearCart -> {
                    cartRepository.clearCart()
                }
                CartIntent.CheckoutClicked -> {
                     if (_state.value.cartItems.isNotEmpty()) {
                         _effect.send(CartEffect.NavigateToCheckout)
                     } else {
                         _effect.send(CartEffect.ShowError("Cart is empty"))
                     }
                }
            }
        }
    }
}
