package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes_following {
    public static void main(String[] args) {

        //following: it selects all the nodes that appear after the context (current) node
        // syntax: //tagname[@attribute='value']//following::tagname

        //following-sibling: it selects all the nodes that have same parent as context (current)node appear the current node
        //syntax://tagname[@attribute='value']//following-sibling::tagname

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        driver.findElement(By.xpath("//input[@id='password_step_input']//following::input"));


    }
}
