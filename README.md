# 🚀 API Testing Project

<div align="center">
  
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![JUnit](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![REST Assured](https://img.shields.io/badge/REST%20Assured-0078D4?style=for-the-badge&logo=rest-assured&logoColor=white)
![IntelliJ](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

</div>

## 📋 Tabla de Contenidos

- [Descripción](#-descripción)
- [Tecnologías](#-tecnologías)
- [Requisitos](#-requisitos-previos)
- [Instalación](#-instalación)
- [Ejecución de Pruebas](#-ejecutando-las-pruebas)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Licencia](#-licencia)
- [Contribución](#-contribución)

## 🎯 Descripción

Este proyecto es un ejemplo de pruebas de API utilizando Java, Maven, JUnit 5 y REST Assured. Incluye pruebas automatizadas para verificar el funcionamiento de APIs RESTful.

## 🛠️ Tecnologías

| Tecnología | Uso |
|------------|-----|
| Java 17 | Lenguaje de programación principal |
| Maven | Gestor de dependencias |
| JUnit 5 | Framework de pruebas |
| REST Assured | Pruebas de API REST |
| IntelliJ IDEA | Entorno de desarrollo |

## 📋 Requisitos Previos

- Java 17 o superior
- Maven 3.6.3 o superior
- Git (opcional)

## ⚙️ Instalación

1. Clona el repositorio (si es necesario):
   ```
   git clone [URL_DEL_REPOSITORIO]
   ```

2. Navega al directorio del proyecto:
   ```
   cd ApiTestingProject
   ```

3. Compila el proyecto:
   ```
   mvn clean install
   ```

## 🧪 Ejecutando las Pruebas

### Ejecutar pruebas sin limpiar:
```
mvn test
```

### Limpiar y ejecutar pruebas:
```
mvn clean test
```

## 📁 Estructura del Proyecto

```
ApiTestingProject/
├── src/
│   ├── main/
│   │   └── java/org/example/
│   │       └── Main.java
│   └── test/
│       └── java/com/example/tests/
│           └── SimpleApiTest.java
├── target/
├── pom.xml
└── README.md
```

---

