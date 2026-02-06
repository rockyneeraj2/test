import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

Basic_AuthenticationHandle {

    public static String username = "admin";
    public static String password = "admin";

    psvm


        WebDriver driver = new ChromeDriver();
       // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

    }
}
