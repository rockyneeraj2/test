package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PrintAllOptionsDropDown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

       List<WebElement> dd = driver.findElements(By.tagName("option"));
       System.out.println(dd.size());

       for (int i=0;i<dd.size();i++){
           System.out.println(dd.get(i).getDomAttribute("value"));
       }

       driver.close();

    }
}
