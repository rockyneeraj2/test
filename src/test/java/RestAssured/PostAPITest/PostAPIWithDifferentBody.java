package RestAssured.PostAPITest;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostAPIWithDifferentBody {

    @Test
    public void bodyWithTextTest(){

        baseURI="https://postman-echo.com";

        String payload = "hi this is neeraj here";

        given().log().all()
                .contentType(ContentType.TEXT)
                .body(payload)
                .when()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(201);

    }

    @Test
    public void bodyWithJavaScriptTest(){

        baseURI="https://postman-echo.com";

        String payload = "<script>\n" +
                "document.getElementById(\"demo\").innerHTML = 10.50;\n" +
                "</script>";

        given().log().all()
                .contentType("application/javascript")
                .body(payload)
                .when()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200);

    }

    @Test
    public void bodyWithHTMLTest(){

        baseURI="https://postman-echo.com";

        String payload = "<html>\n" +
                "<body>\n" +
                "<h1>JavaScript Numbers</h1>\n" +
                "<h3>Number can be written with or without decimals.</h3>\n" +
                "</body>\n" +
                "</html>";

        given().log().all()
                .contentType(ContentType.HTML)
                .body(payload)
                .when()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200);

    }

    @Test
    public void bodyWithXMLTest(){

        baseURI="https://postman-echo.com";

        String payload = "<properties>\n" +
                "        <maven.compiler.source>17</maven.compiler.source>\n" +
                "        <maven.compiler.target>17</maven.compiler.target>\n" +
                "        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\n" +
                "    </properties>";

        given().log().all()
                .contentType(ContentType.XML)
                .body(payload)
                .when()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200);

    }

    @Test
    public void bodyWithMultiPartTest(){

        baseURI="https://postman-echo.com";


        given().log().all()
                .contentType(ContentType.MULTIPART)
                .multiPart("resume",new File("C:\\Users\\neera\\Downloads\\NeerajKumarResume-4.docx"))
                .multiPart("name","naveen")
                .when()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void bodyWithPDFTest(){

        baseURI="https://postman-echo.com";

        given().log().all()
                .contentType("application/json")
                .body(new File("C:\\Users\\neera\\Downloads\\March2025.pdf"))
                .when()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void bodyWithImageTest(){

        baseURI="https://postman-echo.com";

        given().log().all()
                .contentType("image/jpeg")
                .body(new File("C:\\Users\\neera\\Downloads\\download.jpg"))
                .when()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }
}
