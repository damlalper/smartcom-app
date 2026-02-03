package com.smartcommerce.data.repository

import com.smartcommerce.domain.model.CartItem
import com.smartcommerce.domain.model.Product
import com.smartcommerce.domain.repository.CartRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CartRepositoryImpl @Inject constructor() : CartRepository {

    private val _cartItems = MutableStateFlow<List<CartItem>>(emptyList())
    override val cartItems: Flow<List<CartItem>> = _cartItems.asStateFlow()

    override suspend fun addToCart(product: Product) {
        _cartItems.update { currentItems ->
            val existingItem = currentItems.find { it.product.id == product.id }
            if (existingItem != null) {
                currentItems.map {
                    if (it.product.id == product.id) {
                        it.copy(quantity = it.quantity + 1)
                    } else {
                        it
                    }
                }
            } else {
                currentItems + CartItem(product, 1)
            }
        }
    }

    override suspend fun removeFromCart(productId: String) {
        _cartItems.update { currentItems ->
            val existingItem = currentItems.find { it.product.id == productId }
            if (existingItem != null) {
                if (existingItem.quantity > 1) {
                    currentItems.map {
                         if (it.product.id == productId) {
                            it.copy(quantity = it.quantity - 1)
                        } else {
                            it
                        }
                    }
                } else {
                    currentItems.filter { it.product.id != productId }
                }
            } else {
                currentItems
            }
        }
    }

    override suspend fun clearCart() {
        _cartItems.value = emptyList()
    }
}
