# Spring Boot User Management Demo

## Overview
A simple Spring Boot project demonstrating basic architecture, annotations, and dependency injection. This project implements a user management system with in-memory storage using a layered architecture approach.

## Technologies
- Java 21
- Spring Boot 3.1.0
- JUnit 5
- Mockito

## Project Structure
- **Model**: `User.java` - Contains user entity data
- **Repository**: `FakeRepoInterface.java` and `FakeRepo.java` - In-memory storage
- **Service**: `UserService.java` and `UserServiceImpl.java` - Business logic
- **Tests**: `UserServiceTests.java` - Unit tests for service methods

## Features
- Create users with name and surname
- Retrieve users by ID
- Remove users from the system
- In-memory storage (simulated database)
- Comprehensive unit tests

## How to Run
1. Clone the repository
2. Run using Gradle:
   ```
   ./gradlew bootRun
   ```
3. The application will start and print "Spring Boot User Management Demo is running!" in the console

## How to Test
Run the tests using Gradle:
```
./gradlew test
```

## Key Concepts Demonstrated
- **Dependency Injection**: Using constructor injection with `@Autowired`
- **Spring Boot Annotations**: `@SpringBootApplication`, `@Service`, `@Repository`
- **Layered Architecture**: Separation of concerns with Model, Repository, and Service layers
- **Interface-based Design**: Programming to interfaces rather than implementations
- **Unit Testing**: Testing service methods with mocked dependencies

## Project File Details
- `build.gradle` - Project dependencies and configuration
- `DemoApplication.java` - Spring Boot application entry point
- `User.java` - User model class
- `FakeRepoInterface.java` - Repository interface
- `FakeRepo.java` - Repository implementation with in-memory storage
- `UserService.java` - Service interface
- `UserServiceImpl.java` - Service implementation with business logic
- `UserServiceTests.java` - Unit tests for service methods
