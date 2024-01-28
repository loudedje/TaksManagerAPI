# TaskManagerAPI

TaskManagerAPI is a simple and efficient RESTful API built with Spring Boot for task management.

## Features

- CRUD operations for tasks: Create, Retrieve, Update, Delete
- Developed using Spring Boot and Spring Data JPA
- Easily integrate task management features into your applications

## Getting Started

### Prerequisites

- Java 17
- Maven 
- Your favorite IDE (IntelliJ IDEA, Eclipse, etc.)

### Installation

1. Clone the repository: `git clone https://github.com/loudedje/TaksManagerAPI`
2. Navigate to the project folder: `cd TaskManagerAPI`
3. Build the project: `mvn clean install` or `./gradlew build`
4. Run the application: `java -jar target/TaskManagerAPI.jar` or `./gradlew bootRun`

## Usage

- API base URL: `http://localhost:8080/api/tasks`

### Endpoints

- GET `/api/tasks`: Retrieve all tasks
- GET `/api/tasks/{id}`: Retrieve a specific task by ID
- POST `/api/tasks`: Create a new task
- PUT `/api/tasks/{id}`: Update an existing task
- DELETE `/api/tasks/{id}`: Delete a task

