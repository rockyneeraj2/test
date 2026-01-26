package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains {
    public static void main(String[] args) {

        // contains function is used for finding dynamic web element
        // you can provide any partial attribute value to find the webelement
        //format: xpath : //tagname[contains(@attribute,'value')]

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("test");
    }
}
