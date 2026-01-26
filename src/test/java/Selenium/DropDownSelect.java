package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://web.sugarcrm.com/register");

        WebElement dropdown = driver.findElement(By.id("job_level"));
        Select sel = new Select(dropdown);
        sel.selectByValue("cLevel");
        sel.selectByVisibleText("Manager-level");
        sel.selectByIndex(5);

    }
}
