package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator {
    public static void main(String[] args) {

        //above
        //below
        //toLeftOf
        //toRightOf
        //near
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        //driver.findElement(RelativeLocator.with(By.ByTagName("input").a
    }
}
