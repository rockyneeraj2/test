package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_text {
    public static void main(String[] args) {

        // text() -- method is used to find element with exact text match
        // syntax: // tagname[text()='ActualText']

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
    }
}
