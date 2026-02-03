package com.smartcommerce.domain.usecase

import com.smartcommerce.domain.model.AuthResult
import com.smartcommerce.domain.repository.AuthRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String): AuthResult {
        // Basic validation can be added here
        if (email.isBlank() || password.isBlank()) {
            return AuthResult.Error("Email and password cannot be empty")
        }
        return authRepository.login(email, password)
    }
}
