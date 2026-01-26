package RestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GoRestAPTest {

    @Test
    public void getSingleUserTest(){

        baseURI="https://gorest.co.in";

       Response response = given()
                .header("Authorization","Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .when()
                .get("/public/v2/users/8340371");

       System.out.println("status code " +response.getStatusCode());
        System.out.println("status code " +response.getStatusLine());

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.statusLine().contains("200 OK"));

        response.prettyPrint();

        //fetch the Json body:
        JsonPath js =response.jsonPath();
        int id =js.getInt("id");
        System.out.println("id is: " +id);
        Assert.assertEquals(id,8340371);

        String name = js.getString("name");
        System.out.println("name is: " +name);
        Assert.assertEquals(name,"Devangana Butt");

        String email = js.getString("email");
        System.out.println("email is: " +email);
        Assert.assertEquals(email,"devangana_butt@hamill.example");

    }

    @Test
    public void getAllUserTest(){

        baseURI="https://gorest.co.in";

        Response response = given()
                .header("Authorization","Bearer bb18855fc1dc5a53d2672f7aeedb0e186e2b6c6e8abddc5940b452fd05469c58")
                .when()
                .get("/public/v2/users");

        System.out.println("status code " +response.getStatusCode());
        System.out.println("status code " +response.getStatusLine());

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.statusLine().contains("200 OK"));

        response.prettyPrint();

        //fetch the Json body:
        JsonPath js = response.jsonPath();

        System.out.println("=======list of ids=================");

        List<Integer> idList = js.getList("id");
        System.out.println(idList);

        System.out.println("=======list of name=================");

        List<String> nameList =js.getList("name");
        System.out.println(nameList);


    }


}
