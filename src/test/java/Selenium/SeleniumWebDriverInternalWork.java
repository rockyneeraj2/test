package Selenium;

public class SeleniumWebDriverInternalWork {

    public static void main(String[] args) {

        /*

        Test Script (Java)
        ↓
      Selenium WebDriver API
        ↓
     Browser Driver (ChromeDriver / GeckoDriver)
        ↓
     Real Browser (Chrome / Firefox)

     1️⃣ Test Script Execution
     driver.findElement(By.id("login")).click();

     2️⃣ Selenium WebDriver API
     WebDriver converts your Java command into a W3C-compliant HTTP request
     POST /session/{sessionId}/element/{elementId}/click

     3️⃣ Browser Driver (Bridge)
     Chrome → ChromeDriver
     Firefox → GeckoDriver
     Edge → EdgeDriver
     Receives HTTP request
     Translates it into browser-specific native commands

    4️⃣ Browser Execution
    Browser executes the action (click, type, navigate)
    Browser sends the response back to the driver

     5️⃣ Response Back to Test Script
     Driver returns response (success / failure)
     WebDriver continues execution

         */
    }
}
