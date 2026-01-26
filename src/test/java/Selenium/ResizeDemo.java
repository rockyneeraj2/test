package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ResizeDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");

        WebElement resize = driver.findElement(By.xpath("//h3[text()='Resizable']//following-sibling::div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));

        driver.switchTo().frame("//iframe[@class='demo-frame']");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        Actions act = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        act.dragAndDropBy(resize,10,200).perform();
    }
}
