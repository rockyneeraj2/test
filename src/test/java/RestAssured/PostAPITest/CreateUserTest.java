package RestAssured.PostAPITest;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class CreateUserTest {

    // 1. post create post call-- userId
    //2. get- get user --userId

    public String getRandomEmailId(){
        return "apiautomation" +System.currentTimeMillis()+"@opencart.com";
    }

    @Test
    public void createUserWithJSonsFileStringReplacementTest() throws IOException {


        String emailId = getRandomEmailId();

        //convert json file to String:
        String rawJson = new String(Files.readAllBytes(Paths.get("./src/test/resources/Json/user.json")));
        String updatedJson = rawJson.replace("{{email}}",emailId);


        baseURI="https://gorest.co.in";

        //1 . create the user
        int userId =given().log().all()
                .header("Authorization", "Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .contentType(ContentType.JSON)
                .body(updatedJson)

                .when()
                .post("/public/v2/users")
                .then().log().all()
                .assertThat()
                .statusCode(201)
                .extract()
                .path("id");

        System.out.println(userId);
        System.out.println("==========================");

        // 2.get the users: GET call:
    }
}
