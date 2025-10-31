🛍️ ClickNBuy – E-Commerce Backend
🔧 Tech Stack

Spring Boot | Hibernate | MySQL | JWT | Swagger | Lombok | Docker | Postman

📘 Overview

ClickNBuy is a complete E-Commerce backend application built with Spring Boot.
It provides secure user authentication, role-based access, product and order management, payment processing, and email verification features.
The project demonstrates a production-style backend with modular architecture, Swagger documentation, and Docker support for deployment.

🚀 Features

🔐 JWT Authentication & Role-Based Access for Admin, Seller, and User.

🧾 RESTful APIs for Product, Category, Cart, Order, and User Management.

✉️ Email OTP Verification for user registration and password reset.

💳 Payment Module with checkout and transaction confirmation.

📘 Swagger UI for interactive API documentation and testing.

⚙️ Global Exception Handling for clean and consistent API responses.

🐳 Dockerized Deployment for easy setup and portability.

🧩 Project Architecture

Layered Design:
Controller → Service → DAO → Repository → Entity

Controller Layer: Handles HTTP requests and routes them to appropriate services.

Service Layer: Contains business logic for authentication, products, and orders.

DAO/Repository Layer: Handles database operations using Hibernate ORM.

Entity Layer: Defines JPA entities such as User, Product, Category, Cart, and Order.

⚙️ Setup & Installation
1️⃣ Clone the Repository
git clone https://github.com/Padmavati1630/clickNBuy.git
cd clickNBuy

2️⃣ Configure Database

Create a MySQL database (e.g. clicknbuy_db)

Update your database credentials in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/clicknbuy_db
spring.datasource.username=your_username
spring.datasource.password=your_password

3️⃣ Run the Application

If using Maven:

mvn spring-boot:run


Or run directly from your IDE (Eclipse/IntelliJ).

🌐 API Documentation

Once the application is running, open your browser and go to:
👉 http://localhost:8080/swagger-ui/index.html

Here you can explore and test all available endpoints interactively.

💳 Payment Module

Includes a simple payment workflow for checkout and transaction confirmation using a sample payment.html page.

🧠 Future Enhancements

Add real payment gateway (Razorpay/Stripe)

Include product search and filter functionality

Build frontend with React/Angular

📂 Tools Used

Postman – API testing

Swagger – API documentation

MySQL – Database

Hibernate/JPA – ORM

Docker – Containerization

👩‍💻 Author

Padmavati M Shivanagutti
📧 padmashivanagutti90@gmail.com
