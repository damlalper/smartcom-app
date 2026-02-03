package com.smartcommerce.domain.usecase

import com.smartcommerce.domain.model.Product
import com.smartcommerce.domain.repository.ProductRepository
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(): List<Product> {
        return productRepository.getProducts()
    }
}
