package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.equalTo;

public class UserSteps {
    private Response response;

    @Given("la API de usuarios está disponible")
    public void laApiDeUsuariosEstaDisponible() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    @When("hago una petición GET al endpoint {string}")
    public void hagoUnaPeticionGETAlEndpoint(String endpoint) {
        response = RestAssured.given().when().get(endpoint);
    }

    @Then("el código de estado de la respuesta debe ser {int}")
    public void elCodigoDeEstadoDeLaRespuestaDebeSer(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @Then("el {string} del usuario debe ser {string}")
    public void elDelUsuarioDebeSer(String field, String expectedValue) {
        response.then().body("data." + field, equalTo(expectedValue));
    }
}