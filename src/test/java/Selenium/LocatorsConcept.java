package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("user-name")).sendKeys("testing");
        driver.findElement(By.className("form_group"));
        driver.findElement(By.cssSelector("#user-name")).sendKeys("Neeraj");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Test");
        driver.findElement(By.tagName("input")).sendKeys("Test");
        driver.findElement(By.linkText("Sign up for Facebook")).click();
        driver.findElement(By.partialLinkText("Sign up for")).click();

    }
}
