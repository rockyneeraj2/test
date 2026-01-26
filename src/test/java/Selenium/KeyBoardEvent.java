package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardEvent {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://extendsclass.com/text-compare.html");
        WebElement textArea1 = driver.findElement(By.xpath("//div[@id='dropZone']//child::span"));


        Actions act = new Actions(driver);
        act.keyDown(textArea1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

        WebElement rightside = driver.findElement(By.xpath("//div[@id='dropZone2']//child::div[@class='CodeMirror-sizer']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        act.keyDown(rightside,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }
}
