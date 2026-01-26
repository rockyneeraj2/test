package RestAssured;

public class Important_Termilogy {

    public static void main(String[] args) {

        /*
        RestAssured(C):
        - main entry point for using RestAssured
        -provides methods to set global configuration such as base URI, base path, authentication, etc.


        RequestSpecification(I):
        - Interface that represents spefification of an HTTP request
        - it will allow you to set request headers, query parameters, path parameters, body, cookies, authentication, etc.
        - given(). param("keys","value").header("key","value")...

        Response(I):
        - Interface that represents the response after making the request
        - conatains details like status code, headers, body, cookies, etc.
        - response.getStatusCode(), response.getBody().asString()...
        - provide methods to extract and validate differents parts of the response

        Filter(I):
        - Interface used for specifying filters that can be modify the request and response
        - is is used for logging errorhandling, authentication, etc.
        - you can create custom filters by implementing this interface

        JSONPath(C):
        - class for parsing the JSON response
        - it allow easy extraction of data from the response JSON using path expressions
        - jsonPath.getString("key"), jsonPath.getInt("key")...

        XmlPath(C):
        - class for parsing XML response
        - it allows easy extraction of data from the response XML using path expressions
        - xmlPath.getString("key"), xmlPath.getInt("key")...

            ValidatableResponse(I):
        - Interface that represents a response that can be validated
        - it provides methods to perform assertions on the response such as status code, headers, body content, etc.
        - response.then().statusCode(200).body("key", equalTo("value"))...

            ResponseSpecification(I):
        - Interface that represents a specification for validating responses
        - it allows you to define common validation rules that can be reused across multiple tests
        - you can create a ResponseSpecification and use it with multiple requests


        Request/Response Logging:
        - logging the detailed of the request and response in the crucial for debugging
        - log.all(), log().ifError(), log().ifValidationFails()...


        Authentication:
        - classes and methods for handling the authentication
        - basic(), oauth(), 0auth2(), etc

        Assertions:
        - methods for validating the response
        - statusCode(), body(), header(), etc.

        Matchers:
        - classes that provides various static methods for perforing assertions on the response
        - used for status code, body content, headers, assertThat()
        - equalTo(), hasItem(), containsString(), etc.

         Query Parameters:
         - Adding query param to request URL
         - param("key","value"), queryParam("key","value")


        Path Parameters:
            - Adding path param to request URL
            - pathParam("key","value")

        0Authentication:
        - methods for handling 0Authentication
        - oauth1(), oauth2(), etc.

        Headers:
        - methods for setting for request
        - header("key","value"), headers(Map<String, String>)

       Cookies:
        - methods for setting cookies for request
        - cookie("key","value"), cookies(Map<String, String>)

        URI Building:
        -building the complete URI for the request
        - baseUri(), basePath(), port(), etc.
        -base URL + endpoint path + query parameters + path parameters

        Methods:
        -given(): to specify the request specification
        -when(): to specify the HTTP method and endpoint
        -then(): to specify the response validation
        -get(), post(), put(), delete(), patch(), head(), options(): to specify the HTTP method
        -body(): sets or retrieves the body of the request or response
        -header(): sets or retrieves headers for the request or response
        -statusCode(): retrieves or validates the status code of the response
        -stsatusLine(): retrieves or validates the status line of the response
        -assertThat(): used for making assertions on the response





         */
    }
}
