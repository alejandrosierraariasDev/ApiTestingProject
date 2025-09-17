package com.example.tests;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;



public class SimpleApiTest {
    @Test
    public void testGetSingleUser() {
        // Define la URL base de la API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Realiza una petición GET al endpoint /todos/1
        given()
            .header("Content-Type", "application/json")
            .header("Accept", "application/json")
        .when()
            .get("/todos/1")
        .then()
            .statusCode(200) // Valida que el código de estado sea 200 (OK)
            .body("id", equalTo(1)) // Valida que el ID del todo sea 1
            .body("title", equalTo("delectus aut autem")); // Valida el título del todo
    }
}
