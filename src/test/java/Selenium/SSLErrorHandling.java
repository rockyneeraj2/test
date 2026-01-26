package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLErrorHandling {
    public static void main(String[] args) {
        // This is a placeholder for the SSLErrorHandling test case.
        // Actual implementation would involve setting up Selenium WebDriver
        // to handle SSL certificate errors during web navigation.

        WebDriver driver = new ChromeDriver();
        driver.get("https://expired.badssl.com/");

        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setAcceptInsecureCerts(true);
        ds.setCapability("acceptInsecureCerts", true);
        ds.setCapability(ChromeOptions.CAPABILITY, new ChromeOptions());

        ChromeOptions ch = new ChromeOptions();
        ch.merge(ds);
        ds.setCapability("acceptInsecureCerts", true);
    }
}
