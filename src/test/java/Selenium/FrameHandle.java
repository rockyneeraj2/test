package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameHandle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
       WebElement frame = driver.findElement(By.xpath("//iframe[@title='W3Schools Free Online Web Tutorials']"));

       driver.switchTo().frame(frame);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
       driver.findElement(By.xpath("//div[@id='tnb-login-btn']")).click();
       driver.switchTo().parentFrame();

    }
}
