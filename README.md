# 🚀 MIDAS Core Banking System (J.P. Morgan Software Engineering Simulation)

> 💼 Built as part of the J.P. Morgan Software Engineering Virtual Experience Program  
> ⚡ Simulates a real-world event-driven banking backend system

---

## 📌 Overview

This project demonstrates the development of a scalable backend system for handling financial transactions in a banking environment.

It is designed using a microservice-inspired architecture and integrates event-driven processing using Apache Kafka to ensure high performance and reliability.

---

## 🧠 Key Features

- RESTful APIs for transaction processing  
- Event-driven architecture using Kafka  
- Real-time transaction handling  
- In-memory database using H2  
- Scalable backend with Spring Boot  
- Layered architecture (Controller → Service → Repository)  
- Unit & integration testing support  

---

## 🛠️ Tech Stack

- Backend: Java 17, Spring Boot  
- Database: H2 (In-memory database)  
- Messaging System: Apache Kafka  
- ORM: Spring Data JPA  
- Build Tool: Maven  
- Testing: JUnit, Testcontainers  

---

Project Structure
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 └── config/

 ---

## 🏗️ System Architecture

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|------------|
| POST   | /transactions | Process a new transaction |
| GET    | /balance/{userId} | Fetch user balance |

---

## 🔄 Kafka Workflow

- Producer sends transaction events to Kafka topic  
- Consumer listens and processes transactions  
- Ensures asynchronous and scalable processing  

---

## 🧪 Testing

- Unit Testing using JUnit  
- Kafka Testing using Testcontainers  

---

## 🚀 Future Improvements

- Add authentication & authorization  
- Deploy using Docker  
- Integrate with PostgreSQL/MySQL  
- Add frontend dashboard  

---

## 👨‍💻 Author

**Md Saad Alam**  
B.Tech CSE | Aspiring Software Engineer  

---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub!
