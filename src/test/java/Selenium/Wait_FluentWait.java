package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait_FluentWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement elec = driver.findElement(By.xpath("//a[text()='Electronics']//parent::li[@class='vl-flyout-nav__js-tab']"));

        Actions act = new Actions(driver);
        act.moveToElement(elec).perform();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("RCA custome message")
                .ignoring(NoSuchElementException.class);
        WebElement appleClick = driver.findElement(By.xpath("//a[text()='Apple']"));
        appleClick.click();
    }
}
