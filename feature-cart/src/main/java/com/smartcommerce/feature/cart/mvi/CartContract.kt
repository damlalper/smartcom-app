package com.smartcommerce.feature.cart.mvi

import com.smartcommerce.domain.model.CartItem

data class CartState(
    val cartItems: List<CartItem> = emptyList(),
    val totalAmount: Double = 0.0,
    val isLoading: Boolean = false,
    val error: String? = null
)

sealed class CartIntent {
    data class RemoveFromCart(val productId: String) : CartIntent()
    data object ClearCart : CartIntent()
    data object CheckoutClicked : CartIntent()
}

sealed class CartEffect {
    data object NavigateToCheckout : CartEffect()
    data class ShowError(val message: String) : CartEffect()
}
