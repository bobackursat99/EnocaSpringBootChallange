# EnocaSpringBootChallange

# Project Name: Enoca Spring Boot Challange

# Introduction:
This project is an E-commerce platform developed using Java Spring Boot framework. It includes entities for Product, Customer, Cart, and Order, with a Base Entity for inheritance. The project aims to demonstrate the management of products, customers, carts, and orders in an online shopping scenario, including the association between a customer, their cart, and multiple orders. Additionally, it incorporates features such as real-time calculation and updating of total prices in the cart, tracking historical prices of products, and managing product stock.

# Entities:

# Base Entity: A base entity for common attributes like ID, creation timestamp, and modification timestamp.

# Product: Represents a product with attributes such as name, description, price, and stock quantity.

# Customer: Represents a customer with attributes like name, email, and address.

# Cart: Represents a cart associated with a customer, containing a list of products and their quantities.

# Order: Represents an order placed by a customer, containing details such as order code, order date, and total price.

# Relationships:

A Customer can have one Cart.
A Customer can have multiple Orders.
An Order can have multiple Products.

# Services:

# AddCustomer: 
Service to add a new customer to the system.

# GetProduct:
Service to retrieve details of a specific product by ID.

# CreateProduct:
Service to add a new product to the system.

# UpdateProduct:
Service to update the details of an existing product.

# DeleteProduct:
Service to delete a product from the system.

# GetCart:
Service to retrieve the current cart of a customer.

# UpdateCart:
Service to update the contents of a customer's cart (e.g., add, remove, update product quantities).

# EmptyCart:
Service to clear all products from a customer's cart.

# PlaceOrder:
Service to place an order for the products in the customer's cart.

# GetOrderForCode:
Service to retrieve details of a specific order by order code.

# GetAllOrdersForCustomer:
Service to retrieve all orders placed by a specific customer.

# AddProductToCart:
Service to add a product to the customer's cart.

# RemoveProductFromCart:
Service to remove a product from the customer's cart.

# Additional Features:

Real-time calculation of total prices in the cart.
Stock management to prevent ordering products with insufficient stock.
