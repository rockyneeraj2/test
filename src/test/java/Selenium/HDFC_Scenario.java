package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class HDFC_Scenario {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 1️⃣ Open HDFC Website
        driver.get("https://www.hdfcbank.com");

        // 2️⃣ Mouse Hover on Login Button
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(loginBtn).perform();

        // 3️⃣ Click Login
        loginBtn.click();

        // 4️⃣ Click Know More
        WebElement knowMore = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
        knowMore.click();

        // 5️⃣ Handle Window Switch
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }

        // 6️⃣ Capture All Language Text
        List<WebElement> languages = driver.findElements(
                By.xpath("//div[contains(@class,'language')]//a")
        );

        System.out.println("Available Languages:");

        for (WebElement lang : languages) {
            System.out.println(lang.getText());
        }

        driver.quit();
    }
    }

