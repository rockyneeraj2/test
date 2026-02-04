package RestAssured.PostAPITest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUserAPITest {

    public String getRandomEmailId(){
        return "apiautomation" +System.currentTimeMillis()+"@opencart.com";
    }

    @Test
    public void createUserWithJSonsStringTest(){

        String emailId = getRandomEmailId();

        baseURI="https://gorest.co.in";

        given().log().all()
                .header("Authorization", "Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"name\": \"Annapurna neeraj III\",\n" +
                        "  \"email\": \""+emailId+"\",\n" +
                        "  \"gender\": \"male\",\n" +
                        "  \"status\": \"active\"\n" +
                        "}")

                .when()
                .post("/public/v2/users")
                .then().log().all()
                .assertThat()
                .statusCode(201);
    }

    @Test
    public void createUserWithJSonsFileTest(){

        baseURI="https://gorest.co.in";

        given().log().all()
                .header("Authorization", "Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .contentType(ContentType.JSON)
                .body(new File("./src/test/resources/Json/user.json"))

                .when()
                .post("/public/v2/users")
                .then().log().all()
                .assertThat()
                .statusCode(201);
    }


    @Test
    public void createUserWithJSonsFileStringReplacementTest() throws IOException {

        String emailId = getRandomEmailId();

        //convert json file to String:
        String rawJson = new String(Files.readAllBytes(Paths.get("./src/test/resources/Json/user.json")));
        String updatedJson = rawJson.replace("{{email}}",emailId);


        baseURI="https://gorest.co.in";

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
    }

    //4 we can use pojo class:
}
