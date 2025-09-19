import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SimpleApiTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = System.getProperty("base.uri", "https://jsonplaceholder.typicode.com");
    }

    @Test
    public void testGetTodo() {
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/todos/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("delectus aut autem"));
    }
}