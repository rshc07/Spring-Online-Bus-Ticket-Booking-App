# Online Bus Ticket Booking System

The Online Bus Ticket Booking System is a web-based application that allows users to search for buses, book tickets, manage bookings, and update their personal information.

## Table of Contents
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Features](#features)
- [Project Setup](#project-setup)
- [Configuration](#configuration)
- [API Documentation](#api-documentation)

## Technologies Used

- **Java**: Programming language.
- **Spring Boot**: Framework for building Java applications.
- **Spring Data JPA**: For database access and ORM.
- **Thymeleaf**: Template engine for rendering web pages.
- **Swagger (OpenAPI)**: For API documentation.
- **Maven**: Build automation tool.
- **MySQL**: Database.
- **HTML**: Markup language for creating web pages.
- **CSS**: Style sheet language for designing web pages.

## Prerequisites

- Java 8 or higher
- Maven
- Git (optional)

## Features

- **Bus Search**: Users can search for available buses based on their departure and arrival locations, date, and time preferences.
- **User Registration and Login**: Users can register for an account to book tickets and log in with their credentials.
- **Ticket Booking**: Registered users can book bus tickets based on the availability of seats.
- **Booking Management**: Users can view their booked tickets, cancel bookings, and check the status of their reservations.
- **Profile Management**: Users can update their personal information, including password changes and contact details.

## Project Setup

1. **Clone the repository**:
    ```sh
    git clone https://github.com/your-repo/online-bus-ticket-booking.git
    cd online-bus-ticket-booking
    ```

2. **Install dependencies**:
    ```sh
    mvn clean install
    ```

3. **Set up the database**:
    - Create a MySQL database named `bookingmanagement_db`.
    - Update the `application.properties` file with your database credentials.

4. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

5. **Access the application**:
    - Open your browser and navigate to `http://localhost:8080`.

## Configuration

### Application Properties

Update the `src/main/resources/application.properties` file with your database configuration:

```properties
spring.application.name=BusBookingSystem
spring.datasource.url=jdbc:mysql://localhost:3306/bookingmanagement_db
spring.datasource.username=root
spring.datasource.password=Msdhoni1997*
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
## API Documentation

### Endpoints

#### User Registration

- **URL**: ```/registration```
- **Method**: ```POST```
- **Request Body**:
- ```{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "password": "password123"
     }```
