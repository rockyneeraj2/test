package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndOR {
    public static void main(String[] args) {

        // AND and OR expresssion can also be used in slenium xpath expression
        // very helpful if you want to use more then two attribute to find element on webpage
        // syntax: //tagname[@attribute='value' and @attribute='value']

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.findElement(By.xpath("//input[@id='input-firstname' and@name='firstname']")).sendKeys("Neeraj");
        driver.findElement(By.xpath("//input[@name='telephone' or @id='input-telephone']")).sendKeys("98889889889898");
    }
}
