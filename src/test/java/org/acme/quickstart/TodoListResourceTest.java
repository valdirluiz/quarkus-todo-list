package org.acme.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class TodoListResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/todo-list")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}