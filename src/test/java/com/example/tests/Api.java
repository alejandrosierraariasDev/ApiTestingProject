package com.example.tests;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Api extends ApiBaseTest {
    
    public Api() {
        // Ensure the request spec is initialized
        if (requestSpec == null) {
            setup();
        }
    }

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