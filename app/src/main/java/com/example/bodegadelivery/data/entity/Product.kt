package com.example.bodegadelivery.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

// Tabla de productos
@Entity(
    tableName = "Product",
    foreignKeys = [
        ForeignKey(
            entity = Category::class,          // Tabla padre
            parentColumns = ["categoryId"],    // PK de Category
            childColumns = ["categoryId"],     // Columna en esta tabla
            onDelete = ForeignKey.CASCADE      // Si se borra la categoría, se borran sus productos
        )
    ],
    indices = [Index("categoryId")]            // Índice para mejorar las consultas por categoría
)
data class Product(
    @PrimaryKey(autoGenerate = true)
    val productId: Int = 0,      // PK

    val productName: String,     // Nombre del producto
    val price: Double,           // Precio
    val categoryId: Int          // FK -> Category.categoryId
)
