package com.smartcommerce.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.smartcommerce.feature.auth.navigation.LOGIN_ROUTE
import com.smartcommerce.feature.auth.navigation.loginScreen
import com.smartcommerce.feature.cart.navigation.cartScreen
import com.smartcommerce.feature.cart.navigation.navigateToCart
import com.smartcommerce.feature.checkout.navigation.checkoutScreen
import com.smartcommerce.feature.checkout.navigation.navigateToCheckout
import com.smartcommerce.feature.home.navigation.HOME_ROUTE
import com.smartcommerce.feature.home.navigation.homeScreen
import com.smartcommerce.feature.home.navigation.navigateToHome

@Composable
fun SmartCommerceNavHost(
    navController: NavHostController,
    startDestination: String = LOGIN_ROUTE
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        loginScreen(
            onNavigateToHome = {
                navController.navigateToHome()
            }
        )
        homeScreen(
            onProductClick = { productId ->
                // For now, simplify product detail navigation or add quick cart add
                // Ideally navigation to detail, but for this phase let's go to cart as a demo flow
                // or just stay on home.
                // PRD mentions Product Detail, let's assume we might add it later or reuse Home for now.
                // Let's navigate to Cart for demonstration if we treat "Click" as "Buy" or simply have a FAB.
                // To keep it clean, let's say clicking product adds to cart (logic in VM) or navigates to Cart.
                // For this milestone, let's navigate to Cart to show flow.
                navController.navigateToCart()
            }
        )
        cartScreen(
            onNavigateToCheckout = {
                navController.navigateToCheckout()
            }
        )
        checkoutScreen(
            onNavigateHome = {
                navController.popBackStack(HOME_ROUTE, inclusive = false)
            }
        )
    }
}
