package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_AxesMethods {
    public static void main(String[] args) {

        //Xpath Axes methods (self,parent,child)
        // it is represents a relationship to the context node
        //it is used in locating nodes relative to that node in the tree
        // parent: selects the parent of the context (current) node
        // parent syntax: // tagname[@attribute='value]//parent::tagname

        //child:select all the child of current node
        //syntax://tagname[@attribute='value]//child::tagname

        //self:select the current node
        // syntax: //tagname[@attribute='value]//self::tagname

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        //using Parent:
        driver.findElement(By.xpath("//input[@name='password']//parent::div")).sendKeys("Test");

        //usinf child:
        driver.findElement(By.xpath("//div[@class='col-sm-10']//child::input[@id='input-confirm']")).sendKeys("Test new");

        // using self:
        driver.findElement(By.xpath("//input[@id='input-email']//self::input")).sendKeys("test again");

    }
}
