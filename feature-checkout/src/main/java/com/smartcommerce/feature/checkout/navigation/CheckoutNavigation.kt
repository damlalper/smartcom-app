package com.smartcommerce.feature.checkout.navigation

import androidx.navigation.NavController
import androidx.navigation.GraphBuilder
import androidx.navigation.compose.composable
import com.smartcommerce.feature.checkout.CheckoutScreen

const val CHECKOUT_ROUTE = "checkout_route"

fun NavController.navigateToCheckout() {
    this.navigate(CHECKOUT_ROUTE)
}

fun GraphBuilder.checkoutScreen(onNavigateHome: () -> Unit) {
    composable(route = CHECKOUT_ROUTE) {
        CheckoutScreen(onNavigateHome = onNavigateHome)
    }
}
