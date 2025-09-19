# 🚀 API Testing Framework

<div align="center">
  
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![JUnit5](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![REST Assured](https://img.shields.io/badge/REST%20Assured-0078D4?style=for-the-badge&logo=rest-assured&logoColor=white)
![Allure Report](https://img.shields.io/badge/Allure%20Report-FF4E00?style=for-the-badge&logo=allure&logoColor=white)
![IntelliJ](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

</div>

## 📋 Tabla de Contenidos
- [Características](#-características)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Pruebas Implementadas](#-pruebas-implementadas)
- [Ejecución de Pruebas](#-ejecución-de-pruebas)
- [Configuración](#-configuración)
- [Dependencias](#-dependencias)

## 🎯 Características

- Pruebas automatizadas para API REST
- Uso de RestAssured para peticiones HTTP
- Gestión de datos de prueba a través de archivos JSON
- Configuración centralizada de la especificación de peticiones
- Reportes interactivos con **Allure Report**
- Soporte para múltiples entornos
- Integración con JUnit 5
- Generación automática de informes después de las pruebas

## 📁 Estructura del Proyecto

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

## 🧪 Pruebas Implementadas

### `SimpleApiTest`
- `testGetAll()`: Verifica la obtención de todos los recursos
- `testGetById()`: Obtiene un recurso específico por ID
- `testPostFromFile()`: Crea un nuevo recurso desde un archivo JSON
- `testUpdateo()`: Actualiza un recurso existente
- `testDeleteAndVerifyById()`: Elimina un recurso y verifica su eliminación

### `Api` (Clase de utilidad)
- `get(int id)`: Realiza peticiones GET
- `deleteTodo(int id)`: Realiza peticiones DELETE

## ⚙️ Configuración

1. **Requisitos previos**:
   - Java 17 o superior
   - Maven 3.6.3 o superior
   - IntelliJ IDEA (recomendado)

2. **Variables de entorno**:
   - `base.uri`: URL base de la API (por defecto: `https://jsonplaceholder.typicode.com`)

## 🚀 Ejecución de Pruebas

### Comandos Básicos

#### Ejecutar todas las pruebas y generar informe Allure
```
mvn clean test
```

#### Ejecutar una clase de prueba específica
```
mvn test -Dtest=SimpleApiTest
```


### Generación de Informes

#### Ver el informe Allure en el navegador
```
mvn allure:serve
```
> **Nota:** Este comando inicia un servidor web local con el informe y lo abre automáticamente en tu navegador predeterminado.

#### Generar informe Allure estático
```
mvn allure:report
```
> **Ubicación del informe:** `target/site/allure-maven-plugin/index.html`

#### Limpiar informes generados
```
mvn clean
```

## 📊 Reportes con Allure

Este proyecto utiliza **Allure Report** para generar informes interactivos y detallados de las pruebas. Los informes incluyen:

- Resumen general de las pruebas ejecutadas
- Gráficos y estadísticas detalladas
- Pasos de cada prueba con capturas de pantalla (si están disponibles)
- Logs de ejecución
- Información detallada de las peticiones y respuestas HTTP

### Ubicación de los archivos

- **Resultados de las pruebas (raw):** `target/allure-results/`
- **Informe generado:** `target/allure-report/` o `target/site/allure-maven-plugin/`
- **Informe en formato estático HTML:** `target/site/allure-maven-plugin/index.html`

### Personalización del informe

Puedes personalizar el informe Allure añadiendo anotaciones a tus pruebas. Algunos ejemplos útiles:

```java
@Epic("API Testing")
@Feature("Gestión de TODOs")
@Story("Obtener TODOs")
@Description("Prueba para verificar la obtención de TODOs")
@Step("Paso 1: Enviar petición GET a /todos")
```

## 📦 Dependencias

- **JUnit 5**: Framework de pruebas
- **REST Assured**: Cliente HTTP para pruebas de API
- **Maven Surefire**: Ejecución de pruebas
- **Lombok**: Reducción de código boilerplate

