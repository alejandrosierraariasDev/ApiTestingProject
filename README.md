# 🚀 API Testing Framework

<div align="center">
  
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![JUnit5](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![REST Assured](https://img.shields.io/badge/REST%20Assured-0078D4?style=for-the-badge&logo=rest-assured&logoColor=white)
![Allure Report](https://img.shields.io/badge/Allure%20Report-FF4E00?style=for-the-badge&logo=allure&logoColor=white)
![IntelliJ](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

</div>

## 📋 Table of contents
- [Features](#-features)
- [Project structure](#-project-structure)
- [Implemented tests](#-implemented-tests)
- [Configuration](#️-configuration)
- [Running the tests](#-running-the-tests)
- [Dependencies](#-dependencies)

## 🎯 Features

- Automated REST API tests
- RestAssured for HTTP requests
- Test data managed through JSON files
- Centralized request specification
- Interactive reports with **Allure Report**
- Support for multiple environments
- JUnit 5 integration
- Reports generated automatically after the tests

## 📁 Project structure

```
ApiTestingProject/
├── src/
│   ├── main/
│   │   └── java/org/example/
│   │       └── Main.java
│   └── test/
│       ├── java/com/example/
│       │   ├── tests/
│       │   │   ├── SimpleApiTest.java
│       │   │   └── ApiBaseTest.java
│       │   ├── Api.java
│       │   └── utils/
│       │       └── ApiUtils.java
│       └── resources/
│           └── data/
│               ├── newTodo.json
│               └── update.json
├── target/
├── pom.xml
└── README.md
```

## 🧪 Implemented tests

### `SimpleApiTest`
- `testGetAll()`: retrieves all resources
- `testGetById()`: retrieves one resource by ID
- `testPostFromFile()`: creates a resource from a JSON file
- `testUpdateo()`: updates an existing resource
- `testDeleteAndVerifyById()`: deletes a resource and verifies it is gone

### `Api` (utility class)
- `get(int id)`: sends GET requests
- `deleteTodo(int id)`: sends DELETE requests

## ⚙️ Configuration

1. **Prerequisites**:
   - Java 17 or later
   - Maven 3.6.3 or later
   - IntelliJ IDEA (recommended)

2. **Environment variables**:
   - `base.uri`: API base URL (default: `https://jsonplaceholder.typicode.com`)

## 🚀 Running the tests

### Basic commands

#### Run all tests and generate the Allure report
```
mvn clean test
```

#### Run a specific test class
```
mvn test -Dtest=SimpleApiTest
```

### Reports

#### Open the Allure report in the browser
```
mvn allure:serve
```
> **Note:** this starts a local web server with the report and opens it in your default browser.

#### Generate a static Allure report
```
mvn allure:report
```
> **Report location:** `target/site/allure-maven-plugin/index.html`

#### Clean generated reports
```
mvn clean
```

## 📊 Allure reports

This project uses **Allure Report** for interactive, detailed test reports, including:

- An overview of the executed tests
- Charts and detailed statistics
- Steps of each test, with screenshots when available
- Execution logs
- Detailed HTTP request and response information

### File locations

- **Raw test results:** `target/allure-results/`
- **Generated report:** `target/allure-report/` or `target/site/allure-maven-plugin/`
- **Static HTML report:** `target/site/allure-maven-plugin/index.html`

### Customizing the report

You can enrich the Allure report with annotations on your tests, for example:

```java
@Epic("API Testing")
@Feature("TODO management")
@Story("Get TODOs")
@Description("Verifies that TODOs can be retrieved")
@Step("Step 1: Send GET request to /todos")
```

## 📦 Dependencies

- **JUnit 5**: test framework
- **REST Assured**: HTTP client for API testing
- **Maven Surefire**: test execution
- **Lombok**: less boilerplate code
