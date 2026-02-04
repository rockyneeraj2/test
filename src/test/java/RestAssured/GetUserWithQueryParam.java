package RestAssured;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class GetUserWithQueryParam {

    @Test
    public void getUserTestWithQueryParam() {

        baseURI = "https://gorest.co.in";

        given().log().all()
                .header("Authorization","Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .queryParam("name","Prasad Pilla")
                .queryParam("status","inactive")
                .when()
                .get("/public/v2/users")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON);

    }

    @Test
    public void getUserTestWithQueryParamUsingHashMap() {

        baseURI = "https://gorest.co.in";

        Map<String,String> map = new HashMap<String,String>();
        map.put("name","Prasad Pilla");
        map.put("status","inactive");
        map.put("gender","male");



        given().log().all()
                .header("Authorization","Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .queryParams(map)
                .when()
                .get("/public/v2/users")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON);

    }
}
