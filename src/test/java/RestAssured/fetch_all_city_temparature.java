package RestAssured;

public class fetch_all_city_temparature {

    public static void main(String[] args) {

        /*

        Good scenario 👍 — this tests:

* POST request creation
* Sending JSON body
* Parsing JSON response
* Filtering data using conditions
* Handling arrays in API automation

I’ll show a **real-world RestAssured + Java example**.

---

# ✅ Scenario Assumption

Suppose API accepts a POST request like:

### 🔷 Request JSON

```json
{
  "country": "India"
}
```

### 🔷 Response JSON

```json
{
  "cities": [
    {
      "name": "Delhi",
      "temperature": 45
    },
    {
      "name": "Mumbai",
      "temperature": 35
    },
    {
      "name": "Jaipur",
      "temperature": 42
    }
  ]
}
```

Goal:
👉 Fetch all cities where temperature > 40°C

Expected Output:

```
Delhi
Jaipur
```

---

# ✅ Maven Dependency

```xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>5.4.0</version>
</dependency>
```

---

# ✅ RestAssured Code (Professional Way)

```java
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TemperatureFilterTest {

    @Test
    public void getCitiesAbove40() {

        RestAssured.baseURI = "https://api.weather.com"; // example

        String requestBody = "{ \"country\": \"India\" }";

        // 🔹 Send POST Request
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/getCitiesWeather")
                .then()
                .statusCode(200)
                .extract()
                .response();

        // 🔹 Parse JSON response
        List<Map<String, Object>> cities = response.jsonPath().getList("cities");

        System.out.println("Cities with temperature > 40°C:");

        for (Map<String, Object> city : cities) {

            int temperature = (int) city.get("temperature");

            if (temperature > 40) {
                System.out.println(city.get("name"));
            }
        }
    }
}
```

---

# 🔥 Cleaner Version Using JsonPath Filtering

RestAssured supports filtering:

```java
List<String> hotCities = response.jsonPath()
        .getList("cities.findAll { it.temperature > 40 }.name");

System.out.println("Cities above 40°C: " + hotCities);
```

This is more professional and concise.

---

# 🔥 What Interviewer Is Testing

| Skill               | Why                      |
| ------------------- | ------------------------ |
| POST request        | Request body handling    |
| JSON parsing        | Working with nested JSON |
| Filtering logic     | Business validation      |
| JsonPath            | API automation maturity  |
| Collection handling | Java knowledge           |

---

# 🔥 Interview-Ready Answer (2-Min Version)

You can say:

> I send a POST request using RestAssured with the required JSON body. After receiving the response, I extract the cities array using JsonPath and filter the list where temperature is greater than 40°C. I either loop through the list or use JsonPath's findAll() method for cleaner filtering.

---

# 🔥 Senior-Level Enhancement

You can add:

* Use POJO class mapping instead of Map
* Add assertion to validate city count
* Use stream API

Example with Stream:

```java
cities.stream()
      .filter(c -> (int)c.get("temperature") > 40)
      .forEach(c -> System.out.println(c.get("name")));
```



         */
    }
}
