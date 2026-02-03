package com.smartcommerce.domain.repository

import com.smartcommerce.domain.model.Product

interface ProductRepository {
    suspend fun getProducts(): List<Product>
    suspend fun getProductById(id: String): Product?
}
