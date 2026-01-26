package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        JavaScriptExecutor js =(JavaScriptExecutor) driver;

        String script ="return document.title";
      //  String title = (String)js.executeScript(script);
       // System.out.println("Page title is: " + title);

        Alert alt = driver.switchTo().alert();
        String alertText = alt.getText();
        System.out.println("Alert text is: " + alertText);
        alt.accept();
        alt.dismiss();

    }
}
