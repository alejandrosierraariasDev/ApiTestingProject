package com.example.tests;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import com.example.utils.ApiUtils;

public class SimpleApiTest extends ApiBaseTest {
    @Test
    public void testGetTodo() {
        given()
                .spec(requestSpec)
                .when()
                .get("/todos/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("delectus aut autem"));
    }
    @Test
    public void testPostTodoFromFile() {
        String body = ApiUtils.readFile("src/test/resources/data/newTodo.json");

        given()
                .spec(requestSpec)
                .body(body) // El cuerpo se carga desde el archivo
                .when()
                .post("/todos")
                .then()
                .statusCode(201)
                .body("title", equalTo("Aprender a usar clases de utilidades"));
    }

}
