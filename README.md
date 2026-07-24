
# Day 1 - CareerConnect Backend 🚀

CareerConnect Backend is a Job Portal REST API built using Spring Boot.

This project is being developed step-by-step to understand and implement backend development concepts using Java and Spring Boot.

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Maven
- Git & GitHub

---

## 📂 Day 1 Progress

✅ Created Spring Boot project  
✅ Configured Maven dependencies  
✅ Connected MySQL database  
✅ Created initial package structure

src/main/java/com/lakshmanna/careerconnect
├── controller
├── service
├── repository
└── entity

---

## 🚧 Development Progress

### Day 1: Project Setup
- Spring Boot project initialization
- Database configuration
- Basic project architecture setup

### Upcoming
- Entity creation
- Repository layer implementation
- Service layer development
- REST API development
- Exception handling
- Authentication & Authorization

---

## 👨‍💻 Author

**Lakshmanna K**

GitHub:
https://github.com/KURUVALAKSHMANNA
Email:
kuruvalakshmanna4154@gmail.com

-----


# Day 2 - 🚀 CareerConnect Backend

A modern **Job Portal Backend REST API** built with **Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL** following industry-standard layered architecture and best backend development practices.

> 🚧 **Project Status:** Under Active Development

---

# 📌 Project Overview

CareerConnect is a full-stack Job Portal application. This repository contains the backend REST APIs that enable users to register, authenticate, browse jobs, and apply for jobs, while recruiters can post and manage job listings.

The project is being built incrementally to demonstrate real-world backend development practices.

---

# 🛠 Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven
- REST APIs
- Postman
- Git & GitHub

---

# 🏗 Project Architecture

```
                 Client (Postman / React)

                        │
                        ▼

                 REST Controller Layer

                        │
                        ▼

                  Service Layer

                        │
                        ▼

               Repository Layer (JPA)

                        │
                        ▼

                  MySQL Database
```

---

# 📂 Project Structure

```
careerconnect-backend
│
├── src
│   └── main
│       └── java
│           └── com
│               └── lakshmanna
│                   └── careerconnect
│
│                       ├── controller
│                       │      └── UserController.java
│                       │
│                       ├── dto
│                       │      ├── UserRequest.java
│                       │      └── UserResponse.java
│                       │
│                       ├── entity
│                       │      └── User.java
│                       │
│                       ├── repository
│                       │      └── UserRepository.java
│                       │
│                       ├── service
│                       │      └── UserService.java
│                       │
│                       └── CareerconnectBackendApplication.java
│
└── pom.xml
```

---

# ✅ Features Implemented

## User Registration Module

- ✔ User Registration REST API
- ✔ Layered Architecture
- ✔ DTO Pattern
- ✔ Spring Data JPA Repository
- ✔ MySQL Database Integration
- ✔ Automatic Primary Key Generation
- ✔ User Role Assignment
- ✔ Registration Timestamp
- ✔ Duplicate Email Validation
- ✔ Duplicate Phone Number Validation (In Progress)

---

# 🌐 REST API

## Register User

**Endpoint**

```
POST /api/users/register
```

### Request Body

```json
{
  "firstName": "Lakshmanna",
  "lastName": "Kuruva",
  "email": "lakshmanna@gmail.com",
  "password": "123456",
  "phoneNumber": "9876543210"
}
```

### Success Response

```json
{
  "message": "User Registered Successfully"
}
```

---

# 🗄 Database

### Table : users

| Column | Description |
|---------|-------------|
| id | User ID |
| first_name | First Name |
| last_name | Last Name |
| email | Email Address |
| password | Password |
| phone_number | Mobile Number |
| role | User Role |
| created_at | Registration Time |

---

# 🧪 API Testing

The REST APIs are tested using **Postman**.

Current APIs:

- ✅ User Registration API

---

# 📐 Design Patterns & Concepts

- Layered Architecture
- DTO Pattern
- Repository Pattern
- Dependency Injection
- RESTful API Design
- Object-Oriented Programming (OOP)

---

# 📅 Development Progress

## ✅ Day 1

- Spring Boot Project Setup
- Maven Configuration
- MySQL Database Configuration
- Project Structure

## ✅ Day 2

- User Entity
- Repository Layer
- Service Layer
- Controller Layer
- DTO Implementation
- User Registration API
- Duplicate Email Validation
- Duplicate Phone Number Validation (In Progress)

---

# 🚀 Upcoming Features

- Request Validation
- Global Exception Handling
- Password Encryption (BCrypt)
- Login API
- Spring Security
- JWT Authentication
- Recruiter Module
- Job Module
- Job Application Module
- User Profile Management
- Admin Module
- Role-Based Authorization

---

# ▶️ Getting Started

## Clone the Repository

```bash
git clone https://github.com/KURUVALAKSHMANNA/careerconnect-backend.git
```

## Navigate to the Project

```bash
cd careerconnect-backend
```

## Run the Application

```bash
mvn spring-boot:run
```

---

# 🎯 Learning Objectives

This project is being developed to gain practical experience with:

- Spring Boot
- REST API Development
- Spring Data JPA
- Hibernate
- MySQL
- Spring Security
- JWT Authentication
- Backend Development Best Practices

---

# 👨‍💻 Author

## Lakshmanna K

Software / Java Developer

- GitHub: https://github.com/KURUVALAKSHMANNA
- Email: kuruvalakshmanna4154@gmail.com

---

⭐ **Every commit is a step toward becoming a better software engineer.!**

----

# Day 3 - 🚀 CareerConnect Backend

CareerConnect Backend is a RESTful Job Portal application built using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL**. It provides APIs for user registration and demonstrates a clean layered architecture for Java backend development.

## 🛠 Tech Stack

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- Git & GitHub

## ✨ Features

- User Registration API
- Input Validation
- RESTful APIs
- Exception Handling
- Layered Architecture
- MySQL Database Integration

## ▶️ Getting Started

```bash
git clone https://github.com/KURUVALAKSHMANNA/careerconnect-backend.git
cd careerconnect-backend
mvn spring-boot:run
```

The application runs at:

```
http://localhost:8080
```

## 📌 API

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/users/register` | Register a new user |

## 🚀 Future Enhancements

- JWT Authentication
- Spring Security
- Job Management
- Resume Upload
- Swagger Documentation
- Docker Deployment

## 👨‍💻 Author

**Lakshmanna K**

GitHub: https://github.com/KURUVALAKSHMANNA
Email: kuruvalakshmanna4154@gmail.com

⭐ If you found this project useful, please give it a star!

---

# Day 4 - User Authentication with Spring Security & BCrypt

## 📌 Overview
On Day 4 of building my **CareerConnect - Job Portal Application**, I implemented **User Authentication** using **Spring Security** and **BCrypt Password Encoding**. User passwords are now securely encrypted before storing them in the database, making the application more secure.

## 🚀 Features Implemented
- ✅ User Registration API
- ✅ User Login API
- ✅ Spring Security Integration
- ✅ BCrypt Password Encryption
- ✅ Password Verification using BCrypt
- ✅ PasswordEncoder Configuration
- ✅ API Testing using Postman

## 🛠️ Tech Stack
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## 📮 API Endpoints
- **POST** `/api/users/register`
- **POST** `/api/users/login`

## 📚 What I Learned
- Spring Security Basics
- BCrypt Password Encoding
- PasswordEncoder
- Secure User Authentication
- Password Verification
- REST API Testing with Postman

## 🚀 Next Steps
- Configure SecurityFilterChain
- JWT Authentication
- Role-Based Authorization
- Secure Protected APIs

## 📬 Contact
- **Name:** Lakshmanna K
- **Email:** kuruvalakshmanna4154@gmail.com
- **GitHub:** https://github.com/KURUVALAKSHMANNA/careerconnect-backend
- **LinkedIn:** https://www.linkedin.com/in/lakshmanna-kuruva-749250334/

---

⭐ **CareerConnect** is a full-stack Job Portal application built with **Java, Spring Boot, React, and MySQL**.
