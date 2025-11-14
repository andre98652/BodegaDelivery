package com.example.bodegadelivery.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

// Tabla de clientes
@Entity(tableName = "Customer")
data class Customer(
    @PrimaryKey(autoGenerate = true)
    val customerId: Int = 0,     // PK
    val firstName: String,       // Nombre
    val lastName: String,        // Apellido
    val email: String            // Correo
)
