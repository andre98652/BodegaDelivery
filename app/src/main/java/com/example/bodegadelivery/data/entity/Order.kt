package com.example.bodegadelivery.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

// Tabla de pedidos
@Entity(
    tableName = "Orders",
    foreignKeys = [
        ForeignKey(
            entity = Customer::class,       // Tabla padre
            parentColumns = ["customerId"], // PK de Customer
            childColumns = ["customerId"],  // Columna en Orders
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index("customerId")]
)
data class Order(
    @PrimaryKey(autoGenerate = true)
    val orderId: Int = 0,        // PK

    val customerId: Int,         // FK -> Customer.customerId
    val orderDate: Long          // Fecha en milisegundos (timestamp)
)
