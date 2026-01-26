package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConcept {

    public static String browser ="edge";
    public static WebDriver driver;
    public static void main(String[] args) {

        if(browser.equals("chrome")){
            WebDriver driver = new ChromeDriver();
        } else if (browser.equals("firefix")) {
            WebDriver driver = new FirefoxDriver();
        }
        else if(browser.equals("edge")){
            WebDriver driver = new EdgeDriver();
        }

    }
}
