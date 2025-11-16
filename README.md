# 📦 Bodega Delivery App

**Bodega Delivery App** es una aplicación Android que simula la gestión básica de una tienda o bodega, permitiendo administrar clientes, productos, categorías, pedidos y el detalle de los mismos.

Desarrollada como parte de un proyecto académico, la app implementa una base de datos relacional usando **Room** (Jetpack) y una interfaz moderna usando **Jetpack Compose**.
---

## 👥 Integrantes del Equipo

- **Delgado Allpan, Andree David**
- **Gordillo Mendoza, Jose Alonzo**
- **Escobedo Ocaña, Jorge Luis**
- **Hilacondo Begazo, Andre Jimmy**
- **Roque Quispe, William Isaias**


---

## 🎯 Objetivo del Proyecto

El objetivo del proyecto es aplicar conceptos de:
- Normalización de bases de datos
- Relaciones de distintos tipos (1:N, N:M)
- Persistencia local en Android
- Uso de Jetpack Compose para interfaz moderna
- Aplicación de arquitectura MVVM

---

## 🛠️ Tecnologías Utilizadas

- **Kotlin**: Lenguaje principal
- **Jetpack Compose**: UI declarativa
- **Room Database**: Persistencia local
- **Coroutines y Flow**: Manejo de estados reactivos
- **Material Design 3**: Interfaz de usuario

---

## 🗄️ Estructura de la Base de Datos

La app usa una base de datos relacional con las siguientes tablas:

| Tabla         | Campos                                           | Descripción                          |
|---------------|--------------------------------------------------|--------------------------------------|
| `Customer`    | `customerId (PK)`, `name`, `address`, `phone`    | Clientes registrados                 |
| `Category`    | `categoryId (PK)`, `name`                        | Categorías de productos              |
| `Product`     | `productId (PK)`, `name`, `price`, `stock`, `categoryId (FK)` | Productos con su categoría       |
| `Orders`      | `orderId (PK)`, `customerId (FK)`, `orderDate`   | Pedidos realizados                   |
| `OrderDetail` | `orderId (FK)`, `productId (FK)`, `quantity`     | Relación N:M entre Pedido y Producto |

### 🔗 Relaciones principales

- **Customer → Orders**: 1 a N  
- **Category → Product**: 1 a N  
- **Order ↔ Product (OrderDetail)**: N a M  

---

## 📱 Funcionalidades

### CRUD completo para:

✔️ Clientes  
✔️ Categorías  
✔️ Productos  
✔️ Pedidos  
✔️ Detalle de Pedido

---

## 🖥️ Capturas de Pantalla

*(Aquí puedes agregar imágenes de la app en funcionamiento)*

---

## 🧠 Breve explicación del funcionamiento

- Se puede registrar clientes, categorías y productos.
- Los productos se vinculan a categorías.
- Los pedidos se crean seleccionando un cliente.
- Cada pedido puede tener uno o más productos con cantidades específicas.
- El detalle muestra los productos vinculados usando la tabla relacional `OrderDetail`.

---

## 🚀 Instalación

1. Clona y abre el proyecto en **Android Studio**.
2. Verifica que estás usando el JDK 17+.
3. Asegúrate de tener configurado Kotlin y Compose.
4. Ejecuta la app en un dispositivo o emulador compatible con Android 8.0+.

```bash
git clone https://github.com/usuario/bodega-delivery-app.git
cd bodega-delivery-app
