package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PrintAllLinkonWebpage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());

        for(int i=0;i<allLinks.size();i++){
            System.out.println("Links on page are " +allLinks.get(i).getDomAttribute("href"));
            System.out.println("Links on page are " +allLinks.get(i).getText());
        }
    }
}
