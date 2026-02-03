package com.smartcommerce.data.repository

import com.smartcommerce.core.security.TokenManager
import com.smartcommerce.domain.model.AuthResult
import com.smartcommerce.domain.repository.AuthRepository
import kotlinx.coroutines.delay
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val tokenManager: TokenManager
) : AuthRepository {
    override suspend fun login(email: String, password: String): AuthResult {
        // Mocking network delay
        delay(1500)
        
        // Mock logic
        return if (email == "test@smartcom.com" && password == "123456") {
            val token = "mock_token_xyz_123"
            tokenManager.saveToken(token)
            AuthResult.Success(token)
        } else {
            AuthResult.Error("Invalid credentials")
        }
    }
}
