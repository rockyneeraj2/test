package Selenium;

public class SeleniumChallenegs {

    public static void main(String[] args) {

        /*
        1️⃣ Dynamic Elements (changing IDs / XPaths)
        Challenge
        IDs, names, or XPaths change on every load
        Tests fail even though UI works

        Example:
        <input id="username_12345">

        Solution
        Use relative XPath
        Use contains(), starts-with()
        Prefer CSS selectors

        2️⃣ Synchronization Issues (Wait Problems)
        Challenge
        Elements not ready when test tries to interact
        Tests fail intermittently
        Solution
        Use Explicit Waits (WebDriverWait)
        Wait for specific conditions (element to be clickable, visible, etc.)

        3️⃣ Pop-ups and Alerts
        Challenge
        Unexpected pop-ups or alerts interrupt tests
        Tests fail or hang
        Solution
        Use Alert interface to handle alerts
        Switch to pop-up windows and handle them appropriately

        4️⃣ Cross-Browser Compatibility
        Challenge
        Tests pass in one browser but fail in another
        Different browsers render elements differently
        Solution
        Use WebDriver for multiple browsers (ChromeDriver, FirefoxDriver, etc.)
        Test on all target browsers regularly

        5️⃣ Handling iFrames
        Challenge
        Elements inside iFrames are not accessible directly
        Tests fail to locate elements within iFrames
        Solution
        Switch to iFrame using driver.switchTo().frame()
        Switch back to main content with driver.switchTo().defaultContent()

        6️⃣ File Uploads and Downloads
        Challenge
        Automating file uploads/downloads can be tricky
        Tests fail to interact with file dialogs
        Solution
        Use sendKeys() to input file path for uploads
        Configure browser settings for downloads

        7️⃣ Captchas
        Challenge
        Captchas are designed to prevent automation
        Tests cannot bypass captchas
        Solution
        Avoid captchas in test environments
        Use test accounts without captchas

        */
    }
}
