package RestAssured;


import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetAPIWIthBDD {

    @BeforeMethod
    public void setup() {
        baseURI = "https://gorest.co.in";
    }

    @Test(priority = 1)
    public void getContactsAPITest() {

        given().log().all()
                .header("Authorization", "Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .when()
                .header("Content-Type", "application/json")
                .get("/public/v2/posts")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON);

    }


    @Test(priority = 2)
    public void getContactsAPIAuthErrorTest() {

        given().log().all()
                .header("Authorization", "Bearer neeraj")
                .when()
                .header("Content-Type", "application/json")
                .get("/public/v2/posts")
                .then().log().all()
                .assertThat()
                .statusCode(401);

    }

    @Test(priority = 3)
    public void getContactsAPIInvalidTokenTest() {

        String errorMessage = given().log().all()
                .header("Authorization", "Bearer neeraj12")
                .when()
                .header("Content-Type", "application/json")
                .get("/public/v2/posts")
                .then().log().all()
                .extract()
                .path("message");
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage,"Invalid token");


    }
}
