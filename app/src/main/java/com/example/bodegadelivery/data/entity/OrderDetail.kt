package com.example.bodegadelivery.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

// Tabla de detalles de pedido (relación n-m entre Orders y Product)
@Entity(
    tableName = "OrderDetail",
    primaryKeys = ["orderId", "productId"], // PK compuesta
    foreignKeys = [
        ForeignKey(
            entity = Order::class,
            parentColumns = ["orderId"],
            childColumns = ["orderId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Product::class,
            parentColumns = ["productId"],
            childColumns = ["productId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index("orderId"),
        Index("productId")
    ]
)
data class OrderDetail(
    val orderId: Int,        // FK -> Orders.orderId
    val productId: Int,      // FK -> Product.productId
    val quantity: Int        // Cantidad de ese producto en ese pedido
)
