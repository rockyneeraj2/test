package Selenium;

public class POMExplain {

    public static void main(String[] args) {

        /*

        --->>Page Object Model (POM) is a design pattern in Selenium where each web page of the application
        is represented by a separate Java class.

        Page class contains locators + methods
        Test class contains only test logic
        Improves readability, reusability, and maintainability

        src/main/java
 └── pages
     ├── LoginPage.java
     ├── HomePage.java

src/test/java
 └── tests
     ├── LoginTest.java



     public class LoginPage {

    WebDriver driver;

    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.id("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}




  public class LoginTest {

    WebDriver driver;

    @Test
    public void loginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("admin", "admin123");
    }
}


         */
    }
}
