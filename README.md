# 🍔 Food Delivery RESTful APIs with Microservices Architecture

This repository contains a **Food Delivery Backend Application** built using **Spring Boot Microservices Architecture** and **MySQL**.  
It is designed to simulate a real-world food delivery platform with independent, scalable services for managing restaurants, orders, deliveries, and users.

---

## 🚀 Project Overview

The **Food Delivery Microservices System** demonstrates how to design, build, and connect multiple backend services using **Spring Cloud** components.  
It includes key features such as **API Gateway**, **Service Discovery**, and **Centralized Configuration**, providing a production-ready microservices foundation.

---

## 🧩 Microservices Included

| Service Name | Description |
|---------------|-------------|
| **Restaurant Service** 🍴 | Manages restaurant profiles, menus, and availability. |
| **Order Service** 🛒 | Handles order placement, tracking, and coordination with restaurants and deliveries. |
| **Delivery Service** 🚚 | Manages delivery assignments and status updates. |
| **User Management Service (Planned)** 👤 | Placeholder for future user registration, authentication, and authorization features. |

---

## ⚙️ Core Spring Cloud Components

| Component | Role |
|------------|------|
| **API Gateway** | Acts as the single entry point for all incoming client requests and routes them to the respective microservices. |
| **Eureka Server (Service Discovery)** | Enables dynamic registration and discovery of microservices for communication. |
| **Config Server** | Centralized configuration management for all services. |
| **MySQL Database** | Used by each service for persistent storage (database-per-service pattern). |

---

## 🧰 Tech Stack

- **Backend:** Java 17+, Spring Boot, Spring Cloud (Eureka, Gateway, Config Server)
- **Database:** MySQL
- **Build Tool:** Maven
- **Testing:** Postman, JUnit 5
- **Version Control:** Git & GitHub
- **IDE:** Eclipse / IntelliJ IDEA

---

## 🏗️ Architecture Diagram

```text
               +------------------+
               |   API Gateway    |
               +--------+---------+
                        |
        ---------------------------------------
        |                  |                   |
+---------------+  +----------------+  +----------------+
| Restaurant    |  | Order Service  |  | Delivery       |
| Service       |  | (Order Mgmt)   |  | Service        |
+-------+-------+  +--------+-------+  +--------+-------+
        |                  |                   |
        -------->  Eureka Server  <-------------
                        |
               +-------------------+
               |   Config Server   |
               +-------------------+
````

---

## ⚡ How to Run the Project

1. **Clone the repository**

   ```bash
   git clone https://github.com/Ajay050103/FoodDeliveryRestfull-API-s-With-Microservices.git
   ```

2. **Import into your IDE**

   * Open as a **Maven Project** in IntelliJ or Eclipse.

3. **Start the Spring Cloud components**

   * Run the **Config Server**.
   * Run the **Eureka Server**.
   * Run the **API Gateway**.

4. **Start individual microservices**

   * Run **Restaurant Service**, **Order Service**, **Delivery Service**, and (optionally) **User Service**.

5. **Test APIs using Postman**

   * Each service exposes its own REST endpoints.
   * Access via Gateway using:

     ```
     http://localhost:8080/{service-endpoint}
     ```

---

## ✅ Features Implemented

* RESTful APIs for all microservices
* Dynamic service registration via **Eureka Server**
* Routing and filtering through **API Gateway**
* Centralized configuration via **Spring Cloud Config Server**
* Database persistence using **MySQL**
* Independent service deployment and testing

---

## 🧠 Future Enhancements

* Implement **User Management Service** for authentication and authorization
* Add **Payment Service** with transaction simulation
* Integrate **Docker** for containerized deployment
* Include **Swagger UI** for API documentation
* Add **Resilience4j** Circuit Breaker for fault tolerance

---

## 🤝 Contribution

Contributions are welcome!
If you’d like to improve or extend this project:

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Submit a Pull Request

---

## 📜 License

This project is open-source and available under the [MIT License](LICENSE).

---

## 👨‍💻 Author

**Ajay Sajja**
🎓 MCA Graduate | 💻 Java & Spring Boot Developer
🔗 [LinkedIn Profile](https://www.linkedin.com/in/ajay050103/)
📧 Contact: *ajaysajja5022@gmail.com*

