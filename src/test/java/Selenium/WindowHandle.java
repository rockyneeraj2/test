package Selenium;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        WebElement ele = driver.findElement(By.xpath("//a[text()='Click Here']"));
        ele.click();

        // WebElement ele1 = driver.findElement(By.xpath("//h3[text()='New Window']"));

        Set<String> window = driver.getWindowHandles();
        System.out.println(window);
        Iterator<String> itr = window.iterator();
        String ParentWindow = itr.next();
        System.out.println(ParentWindow);
        String childWindow = itr.next();
        System.out.println(childWindow);

        driver.switchTo().window(childWindow);
        System.out.println(driver.getTitle());

        driver.switchTo().window(ParentWindow);
        System.out.println(driver.getTitle());
    }
}
