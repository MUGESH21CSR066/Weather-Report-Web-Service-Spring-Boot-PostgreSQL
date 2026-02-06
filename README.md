# Weather Report Web Service – Spring Boot REST API

A Spring Boot RESTful web service to manage and retrieve weather data.  
This project demonstrates CRUD operations, database integration, and clean API design using JPA and Hibernate.

## 🚀 Features

- Add Weather Report
- View All Weather Reports
- Update Weather Data
- Delete Weather Record
- RESTful API Design
- PostgreSQL Integration
- Layered Architecture

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL
- Postman

## 📂 Project Structure

controller → API endpoints
service → Business logic
repository → Database layer
entity → Weather model


## 📌 API Endpoints

| Method | Endpoint              | Description                 |
|-------|------------------------|-----------------------------|
| POST  | /weather               | Add weather data           |
| GET   | /weather               | Get all weather reports    |
| PUT   | /weather/{id}         | Update weather report      |
| DELETE| /weather/{id}         | Delete weather report      |

## ⚙️ Run Locally

1. Clone the repository
2. Configure database in `application.properties`
3. Run the project
4. Test APIs using Postman

## ✅ Highlights

- Proper CRUD implementation
- REST standards followed
- Clean layered architecture
