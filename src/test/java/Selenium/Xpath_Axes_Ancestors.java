package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes_Ancestors {
    public static void main(String[] args) {

        // Xpath Axes Methods:(ancestor, ancestor-or-self)
        //ancestor: it select all of the ancestors (parent,grandparent) of context (current node)
        // syntax: //tagname[@attribute='value']//ancestor::tagname

        //ancestor-or-self: it selects context (current)node and all of its ancestors like (parent or grandparent)
        //if tagname for ancestor and self are same
        //syntax: //tahname[@attribut='value]//ancestor-or-self//tagname

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@name='reg_email__']//ancestor::div"));
        driver.findElement(By.xpath("//input[@name='reg_passwd__']//ancestor-or-self::div"));
    }
}
