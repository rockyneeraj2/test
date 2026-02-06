package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLink {

    public static void main(String[] args) {




        class BrokenLinksTest {

            public static void main(String[] args) {

                WebDriver driver = new ChromeDriver();
                driver.get("https://example.com");

                // Step 1: Get all links
                List<WebElement> links = driver.findElements(By.tagName("a"));

                System.out.println("Total links: " + links.size());

                // Step 2: Loop through links
                for (WebElement link : links) {

                    String linkText = link.getText();
                    String url = link.getAttribute("href");

                    // Step 3: Validate URL
                    if (url == null || url.isEmpty()) {
                        continue;
                    }

                    try {
                        HttpURLConnection connection =
                                (HttpURLConnection) new URL(url).openConnection();
                        connection.setRequestMethod("HEAD");
                        connection.connect();

                        int responseCode = connection.getResponseCode();

                        // Step 4: Identify broken links
                        if (responseCode >= 400) {
                            System.out.println(
                                    "Broken Link -> Text: " + linkText +
                                            " | URL: " + url +
                                            " | Status Code: " + responseCode
                            );
                        }

                    } catch (Exception e) {
                        System.out.println(
                                "Exception Link -> Text: " + linkText +
                                        " | URL: " + url
                        );
                    }
                }

                driver.quit();
            }
        }

    }
}
