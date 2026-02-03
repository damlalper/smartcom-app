package com.smartcommerce.feature.auth.navigation

import androidx.navigation.NavController
import androidx.navigation.GraphBuilder
import androidx.navigation.compose.composable
import com.smartcommerce.feature.auth.login.LoginScreen

const val LOGIN_ROUTE = "login_route"

fun NavController.navigateToLogin() {
    this.navigate(LOGIN_ROUTE)
}

fun GraphBuilder.loginScreen(onNavigateToHome: () -> Unit) {
    composable(route = LOGIN_ROUTE) {
        LoginScreen(onNavigateToHome = onNavigateToHome)
    }
}
