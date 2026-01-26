package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wait_ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement elec = driver.findElement(By.xpath("//a[text()='Electronics']//parent::li[@class='vl-flyout-nav__js-tab']"));

        Actions act = new Actions(driver);
        act.moveToElement(elec).perform();

        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        WebElement appleClick = driver.findElement(By.xpath("//a[text()='Apple']"));
        appleClick.click();



    }
}
