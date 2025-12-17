package tests.api;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class UserApiTest {

    @Test
    public void getUsers() {
        given()
            .baseUri("https://reqres.in")
        .when()
            .get("/api/users?page=2")
        .then()
            .statusCode(200);
    }
}
