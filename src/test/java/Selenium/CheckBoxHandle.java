package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxHandle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://web.sugarcrm.com/register");

        //select checkbox
        driver.findElement(By.xpath("//input[@id='terms']")).click();
        driver.findElement(By.xpath("//input[@id='terms']")).isSelected();

        //deselect checkbox
        driver.findElement(By.xpath("//input[@id='terms']")).click();

       List<WebElement> ll= driver.findElements(By.xpath("//input[@type='checkbox']"));
       System.out.println(ll.size());

       for(int i=0;i<ll.size();i++){
           System.out.println(ll.get(i));
       }
    }
}
