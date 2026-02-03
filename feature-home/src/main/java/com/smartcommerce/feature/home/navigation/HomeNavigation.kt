package com.smartcommerce.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.GraphBuilder
import androidx.navigation.compose.composable
import com.smartcommerce.feature.home.HomeScreen

const val HOME_ROUTE = "home_route"

fun NavController.navigateToHome() {
    this.navigate(HOME_ROUTE)
}

fun GraphBuilder.homeScreen(onProductClick: (String) -> Unit) {
    composable(route = HOME_ROUTE) {
        HomeScreen(onProductClick = onProductClick)
    }
}
