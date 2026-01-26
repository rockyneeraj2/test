package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownMultiSelect {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.mobiscroll.com/select/multiple-select");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        WebElement multiSelect = driver.findElement(By.xpath("//input[@id='multiple-select-input']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        Select sel = new Select(multiSelect);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        sel.selectByValue("1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        sel.selectByIndex(5);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        sel.selectByVisibleText("Sports & Outdoors");

        List<WebElement> allselectlist =sel.getAllSelectedOptions();
        System.out.println(allselectlist);
        System.out.println(allselectlist.size());

        sel.deselectAll();
        sel.selectByValue("1");
        sel.selectByIndex(5);
        sel.deselectByIndex(5);

        List<WebElement> allselectlist1 =sel.getAllSelectedOptions();
        System.out.println(allselectlist1.size());

        WebElement firstSelect = sel.getFirstSelectedOption();
    }
}
