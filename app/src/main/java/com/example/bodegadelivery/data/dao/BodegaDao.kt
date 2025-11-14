package com.example.bodegadelivery.data.dao

import androidx.room.*
import com.example.bodegadelivery.data.entity.Category
import com.example.bodegadelivery.data.entity.Customer
import com.example.bodegadelivery.data.entity.Order
import com.example.bodegadelivery.data.entity.OrderDetail
import com.example.bodegadelivery.data.entity.Product
import kotlinx.coroutines.flow.Flow

@Dao
interface BodegaDao {

    // ---------- CUSTOMER CRUD ----------

    @Insert
    suspend fun insertCustomer(customer: Customer): Long

    @Update
    suspend fun updateCustomer(customer: Customer)

    @Delete
    suspend fun deleteCustomer(customer: Customer)

    @Query("SELECT * FROM Customer")
    fun getAllCustomers(): Flow<List<Customer>>



    // ---------- CATEGORY CRUD ----------

    @Insert
    suspend fun insertCategory(category: Category): Long

    @Update
    suspend fun updateCategory(category: Category)

    @Delete
    suspend fun deleteCategory(category: Category)

    @Query("SELECT * FROM Category")
    fun getAllCategories(): Flow<List<Category>>



    // ---------- PRODUCT CRUD ----------

    @Insert
    suspend fun insertProduct(product: Product): Long

    @Update
    suspend fun updateProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Query("SELECT * FROM Product")
    fun getAllProducts(): Flow<List<Product>>



    // ---------- ORDER CRUD ----------

    @Insert
    suspend fun insertOrder(order: Order): Long

    @Update
    suspend fun updateOrder(order: Order)

    @Delete
    suspend fun deleteOrder(order: Order)

    @Query("SELECT * FROM Orders")
    fun getAllOrders(): Flow<List<Order>>



    // ---------- ORDER DETAIL CRUD ----------

    @Insert
    suspend fun insertOrderDetail(detail: OrderDetail)

    @Update
    suspend fun updateOrderDetail(detail: OrderDetail)

    @Delete
    suspend fun deleteOrderDetail(detail: OrderDetail)

    @Query("SELECT * FROM OrderDetail WHERE orderId = :orderId")
    fun getOrderDetailsByOrder(orderId: Int): Flow<List<OrderDetail>>
}
