package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropDownAutoSuggestion {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        //click on Close:
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        // click on mini x
        driver.findElement(By.xpath("//img[@alt='minimize']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        //click on From
        driver.findElement(By.xpath("//span[text()='From']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        //Click from and pass send key:
        WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
        from.sendKeys("BLR");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);

    }
}
