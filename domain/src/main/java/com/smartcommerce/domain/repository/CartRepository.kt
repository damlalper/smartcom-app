package com.smartcommerce.domain.repository

import com.smartcommerce.domain.model.CartItem
import com.smartcommerce.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface CartRepository {
    val cartItems: Flow<List<CartItem>>
    suspend fun addToCart(product: Product)
    suspend fun removeFromCart(productId: String)
    suspend fun clearCart()
}
