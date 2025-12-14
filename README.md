🚀 Coaching Portal – Spring Boot + MongoDB CRUD API

A lightweight Spring Boot REST API project to manage coaching batches.
Supports full CRUD operations with MongoDB as the backend.

🧰 Tech Stack

Java 17+

Spring Boot

Spring Web

Spring Data MongoDB

Lombok

Maven

⭐ Features

➕ Add new batch

📄 Get all batches

🔍 Get batch by ID

✏️ Update batch

🗑️ Delete batch

✔ JSON-based REST API

✔ Layered architecture (Controller → Service → Repository)

🗂️ API Endpoints
Method	Endpoint	Description
GET	/batches	Get all batches
POST	/batches	Create batch
GET	/batches/id/{id}	Get batch by ID
PUT	/batches/id/{id}	Update batch
DELETE	/batches/id/{id}	Delete batch
📌 Sample JSON
{
  "name": "Java Backend Batch",
  "fess": 12000
}

🧱 MongoDB Config (application.properties)
server.port=1090
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=CoachingPortalFullStack

📦 Core Dependencies
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
