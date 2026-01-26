package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {

        // xpath stands for xml path language
        // xpath is used to find location of any element on webpageusing htlm DOM
        //it was define by World wide web

        //syntax: //tagname[@attribute='value']
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Neeraj");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("kumar");
    }
}
