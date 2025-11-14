package com.example.bodegadelivery.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

// Tabla de categorías de productos (Bebidas, Snacks, etc.)
@Entity(tableName = "Category")
data class Category(
    @PrimaryKey(autoGenerate = true)
    val categoryId: Int = 0,   // PK
    val name: String           // Nombre de la categoría
)
