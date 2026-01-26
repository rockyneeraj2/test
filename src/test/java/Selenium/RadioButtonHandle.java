package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        WebElement radio1 =driver.findElement(By.xpath("//input[@id='sex']//parent::label[text()='Female']"));
        radio1.click();
        System.out.println(radio1.isSelected());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        WebElement radio2 =driver.findElement(By.xpath("//input[@id='sex']//parent::label[text()='Male']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        radio2.click();
        System.out.println(radio2.isSelected());
    }
}
