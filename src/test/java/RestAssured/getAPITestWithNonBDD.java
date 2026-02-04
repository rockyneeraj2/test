package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.List;

public class getAPITestWithNonBDD {

    @Test
    public void getCOntactTests(){

        RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";

        RequestSpecification request = RestAssured.given();

        request.header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2OTdiNWVmNzhhNDllOTAwMTUyNTU5MGYiLCJpYXQiOjE3Njk2OTI5NTV9.cJkyG3RnYRwgyQF3dD9H3J-FJiROJuQgIu33kA7JK28");
               Response response =request.get("/contacts");

        System.out.println(response.statusLine());
        System.out.println(response.statusLine());

        response.prettyPrint();
        String contentType =response.header("content-type");
         System.out.println(contentType);

         Headers header =response.headers();
         System.out.println(header);

         List<Header> headerList = header.asList();
        System.out.println(header.size());

        for(Header e : headerList){
            String name = e.getName();
            String value = e.getValue();
            System.out.println(name +" "+value);
        }

    }
}
