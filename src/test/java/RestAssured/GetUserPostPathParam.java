package RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserPostPathParam {

    @DataProvider
    public Object[] getUserData(){
        return new Object[][]{
            {8349235,"Vobis volo curtus eos valens est adinventitias."},
            {8349234,"Deprecator quis sol xiphias solium aegre."}

        };
    }

    @Test(dataProvider = "getUserData")
    public void getUserPostWIthPathParamTest(int userId,String title){

        baseURI = "https://gorest.co.in";

        given().log().all()
                .header("Authorization","Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .pathParam("userid",userId)
                .when()
                .get("/public/v2/users/{userid}/posts")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .body("title",hasItem(title));

    }

    @Test(dataProvider = "getUserData")
    public void getUserPostWIthPathParamHashMapTest(int userId,String title){

        baseURI = "https://gorest.co.in";

        Map<String,String > pathParam = new HashMap<>();
        pathParam.put("firstpath","userid");
        pathParam.put("secondpath","userid");

        given().log().all()
                .header("Authorization","Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .pathParams(pathParam)
                .when()
                .get("/public/v2/users/{userid}/posts")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .body("title",hasItem(title));

    }

}
