package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHover {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        WebElement ele = driver.findElement(By.xpath("//a[text()='Electronics']//parent::li[@class='vl-flyout-nav__js-tab']"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
    }
}
