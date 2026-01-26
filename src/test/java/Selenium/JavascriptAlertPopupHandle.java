package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptAlertPopupHandle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        WebElement alt =driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
//        alt.click();
//        Alert alert= driver.switchTo().alert();
//        alert.accept();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        //WebElement confirmAlert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
       // confirmAlert.click();

       // Alert alt1= driver.switchTo().alert();
       // alt1.accept();
       // alt1.dismiss();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        WebElement prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        prompt.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        Alert al2= driver.switchTo().alert();
        al2.sendKeys("hello");
        al2.accept();



    }
}
