package com.example.tests;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import io.restassured.RestAssured;

public class ApiBaseTest {
    protected static RequestSpecification requestSpec;

    @BeforeAll
    public static void setup() {
        String baseUri = System.getProperty("base.uri", "https://jsonplaceholder.typicode.com");
        RestAssured.baseURI = baseUri;

        requestSpec = new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        
        // Make sure RestAssured is using our spec
        RestAssured.requestSpecification = requestSpec;
    }
}