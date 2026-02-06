package RestAssured.CreateUserWithPojo;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class CreateUserTestWithPOJO {

    public String getRandomEmailId(){
        return "apiautomation" +System.currentTimeMillis()+"@opencart.com";
    }

    @Test
    public void addUserTest(){

        baseURI="https://gorest.co.in";

        User user = new User("tom",getRandomEmailId(),"male","active");

        given().log().all()
                .contentType(ContentType.JSON)
                .body(user)
                .header("Authorization", "Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .when()
                .post("/public/v2/users")
                .then().log().all()
                .statusCode(201);

    }
}
