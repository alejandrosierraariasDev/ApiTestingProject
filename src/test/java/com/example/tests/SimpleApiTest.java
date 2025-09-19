package com.example.tests;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import com.example.utils.ApiUtils;
import static org.hamcrest.Matchers.*;

public class SimpleApiTest extends ApiBaseTest {

    @Test
    public void testGetAll() {
        given()
                .spec(requestSpec)
                .when()
                .get("/todos")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(199))
                .body("id", hasItems(1, 100, 200));
    }
    @Test
    public void testGetById() {
        given()
                .spec(requestSpec)
                .when()
                .get("/todos/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("delectus aut autem"))
                .body("completed", is(false));
    }
    @Test
    public void testPostFromFile() {
        String body = ApiUtils.readFile("src/test/resources/data/new.json");

        given()
                .spec(requestSpec)
                .body(body) // El cuerpo se carga desde el archivo
                .when()
                .post("/todos")
                .then()
                .statusCode(201)
                .body("title", equalTo("Aprender a usar clases de utilidades"))
                .body("userId", equalTo(1))
                .body("id", is(notNullValue()));
    }
    @Test
    public void testUpdateo() {
        String body = ApiUtils.readFile("src/test/resources/data/update.json");

        given()
                .spec(requestSpec)
                .body(body)
                .when()
                .put("/todos/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("titulo actualizado"))
                .body("completed", is(true));
    }
    @Test
    public void testDelete() {
        given()
                .spec(requestSpec)
                .when()
                .delete("/todos/1")
                .then()
                .statusCode(200);
    }

}
