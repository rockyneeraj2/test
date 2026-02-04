package RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import java.util.List;

import static io.restassured.RestAssured.*;

public class ProductAPITest {

    @Test
    public void getProducttest() {

        baseURI = "https://fakestoreapi.com";

        Response response = given().when().get("/products");

        System.out.println(response.statusCode());
        System.out.println(response.statusLine());

        response.prettyPrint();
        JsonPath js = response.jsonPath();

        //print the ids:
        List<Integer> ids = js.getList("id");
        System.out.println("print all ids" + ids);

        //print thr pricr:
        List<Float> price = js.getList("price");
        System.out.println("print the prices" + price);

        //print the rate:
        List<Double> rate = js.getList("rating.rate");
        System.out.println("print rate: " + rate);

        //print the count:
        List<Integer> count = js.getList("rating.count");
        System.out.println("coutn " + count);

        //print all the ids:
        for (int i = 0; i < ids.size(); i++) {
            int id = ids.get(i);
            Object prices = price.get(i);
            Object rates = rate.get(i);
            int counts = count.get(i);

            System.out.println("ids " +id+ " price " +prices+ " rate " +rates+ " counts" +counts);
        }


    }

    @Test
    public void getProductCountTest(){

        baseURI = "https://fakestoreapi.com";

        given()
                .when()
                .get("/products")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("$.size()",equalTo(20));




    }
}
