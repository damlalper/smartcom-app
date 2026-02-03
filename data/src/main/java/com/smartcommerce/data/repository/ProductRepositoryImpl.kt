package com.smartcommerce.data.repository

import com.smartcommerce.domain.model.Product
import com.smartcommerce.domain.repository.ProductRepository
import kotlinx.coroutines.delay
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor() : ProductRepository {
    
    private val mockProducts = listOf(
        Product(
            id = "1",
            title = "Wireless Headphones",
            description = "High quality noise cancelling headphones.",
            price = 199.99,
            imageUrl = "https://example.com/headphones.jpg",
            category = "Electronics",
            rating = 4.5
        ),
        Product(
            id = "2",
            title = "Smart Watch",
            description = "Track your fitness and notifications.",
            price = 149.50,
            imageUrl = "https://example.com/watch.jpg",
            category = "Wearables",
            rating = 4.2
        ),
        Product(
            id = "3",
            title = "Gaming Laptop",
            description = "Powerful laptop for gaming and work.",
            price = 1299.00,
            imageUrl = "https://example.com/laptop.jpg",
            category = "Computers",
            rating = 4.8
        ),
        Product(
            id = "4",
            title = "Running Shoes",
            description = "Comfortable shoes for long distance running.",
            price = 89.99,
            imageUrl = "https://example.com/shoes.jpg",
            category = "Fashion",
            rating = 4.0
        )
    )

    override suspend fun getProducts(): List<Product> {
        delay(1000) // Mock latency
        return mockProducts
    }

    override suspend fun getProductById(id: String): Product? {
        delay(500)
        return mockProducts.find { it.id == id }
    }
}
