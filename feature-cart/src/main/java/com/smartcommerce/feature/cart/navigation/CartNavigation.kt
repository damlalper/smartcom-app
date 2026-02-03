package com.smartcommerce.feature.cart.navigation

import androidx.navigation.NavController
import androidx.navigation.GraphBuilder
import androidx.navigation.compose.composable
import com.smartcommerce.feature.cart.CartScreen

const val CART_ROUTE = "cart_route"

fun NavController.navigateToCart() {
    this.navigate(CART_ROUTE)
}

fun GraphBuilder.cartScreen(onNavigateToCheckout: () -> Unit) {
    composable(route = CART_ROUTE) {
        CartScreen(onNavigateToCheckout = onNavigateToCheckout)
    }
}
