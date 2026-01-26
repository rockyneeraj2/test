package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes_descendent {
    public static void main(String[] args) {

        //Xpath Axes methods:
        //descendant , descendant-or-self
        //descendant : it select all of the descendant (children, grandchildren, etc) of context (current) node
        // syntax: //tagname[@attribute='value']//descendant::tagname

        //descendant-or-self: it selects context (current) node and all of its descendant like (children or grandchildren) if
        // tagname for descendant and self are same
        //syntax: //tagname[@attribute='value]//descendant-or-self::tahname
        // insted of tagname we can add * also for all

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        driver.findElement(By.xpath("//div[@class='pvl _52lp']//descendant::div"));

        driver.findElement(By.xpath("//div[@class='pvl _52lp']//descendant-or-self::div"));
    }
}
