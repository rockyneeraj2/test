package RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Validate_the_json {

    public static void main(String[] args) {




                RestAssured.baseURI = "https://reqres.in";

                given()
                        .when()
                        .get("/api/users/2")
                        .then()
                        .assertThat()
                        .statusCode(200);
                      //  .body(matchesJsonSchemaInClasspath("schema/userSchema.json"));
            }
        }



