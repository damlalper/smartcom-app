package com.smartcommerce.domain.model

data class Product(
    val id: String,
    val title: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val category: String,
    val rating: Double
)
