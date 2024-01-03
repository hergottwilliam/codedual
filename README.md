# Spring Security JWT Authentication

This repository contains a sample Spring Boot application demonstrating how to implement JSON Web Token (JWT) authentication with Spring Security.

## Introduction

This project demonstrates how to integrate JSON Web Token (JWT) authentication into a Spring Boot application using Spring Security. JWT is a compact, URL-safe means of representing claims to be transferred between two parties. It's commonly used for authentication and information exchange between systems.

## Features

- **JWT Authentication:** Secure your Spring Boot application with JSON Web Token authentication.
- **Role-Based Access Control:** Demonstrate role-based access control using Spring Security.
- **Custom User Details:** Implement a custom `UserDetailsService` to load user details from a database.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or later
- Apache Maven
- Git

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/your-username/spring-security-jwt-auth.git
cd spring-security-jwt-auth
```

### Build and Run

Use Maven to build and run the application:

```bash
mvn clean install
mvn spring-boot:run
```

The application will be accessible at http://localhost:8080.

## Usage

### Register User (/auth/register - POST)

To register a new user, send a POST request to `/auth/register` with the following JSON payload:

```json
{
  "username": "{username}",
  "password": "{password}"
}
```
Replace {username} and {password} with the desired values. After a successful request, the user will be registered.

### User Login (/auth/login - POST)
To authenticate and receive a JWT (JSON Web Token), send a POST request to /auth/login with the following JSON payload:

```json
{
  "username": "{username}",
  "password": "{password}"
}
```
Replace {username} and {password} with the user's credentials. Upon successful authentication, the response will include a JWT.

### Access User or Admin Endpoints (/user/ - GET or /admin/ - GET)
To access user or admin-specific endpoints, include the JWT obtained from the login process in the Authorization header of your GET requests to /user/ or /admin/.

Example using cURL:

```bash

# Access User Endpoint
curl -X GET \
  http://your-api-url/user/ \
  -H 'Authorization: Bearer {your-jwt-token}'

# Access Admin Endpoint
curl -X GET \
  http://your-api-url/admin/ \
  -H 'Authorization: Bearer {your-jwt-token}'
```
Replace {your-jwt-token} with the actual JWT obtained from the login response.

Note: Ensure that the provided JWT corresponds to a user with the appropriate role to access the /user/ or /admin/ endpoint.

## Configuration
Modify the application.properties file to configure database connections, security settings, and other application properties.

```properties

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password

# JWT Configuration
jwt.secret=your-secret-key
jwt.expirationMs=3600000
Adjust these properties based on your specific setup. Replace placeholders like your-username, your-password, your-database, your-secret-key, etc., with your actual values.
```
