package com.example.tests.Api;
import com.example.tests.ApiBaseTest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Api extends ApiBaseTest {

    public Response get(int id) {
        return given()
                .spec(requestSpec)
                .when()
                .get("/todos/" + id);
    }

    public Response deleteTodo(int id) {
        return given()
                .spec(requestSpec)
                .when()
                .delete("/todos/" + id);
    }
}