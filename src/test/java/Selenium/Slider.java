package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Slider {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");

        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);

        WebElement greenSlider = driver.findElement(By.xpath("//div[@id='green']//child::div"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        Actions act = new Actions(driver);
        act.dragAndDropBy(greenSlider, 100, 125).perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    }
}
