package com.smartcommerce.domain.repository

import com.smartcommerce.domain.model.AuthResult

interface AuthRepository {
    suspend fun login(email: String, password: String): AuthResult
}
