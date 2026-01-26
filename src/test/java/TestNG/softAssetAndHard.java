package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssetAndHard {
    @Test
    public void TitleTest() {

        SoftAssert ast = new SoftAssert();

        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedText= "Search";
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        ast.assertEquals(actualTitle, expectedTitle);
        ast.assertAll();

        Assert.assertEquals(expectedText, "Search");
        driver.close();

        /*
        difference between softassert and hardassert
        Hard Assert:
        1. In Hard Assert, if an assertion fails, the test method is immediately terminated, and subsequent lines of code within that method are not executed.
        2. It is used when the failure of a particular condition should stop the execution of the test.
        3. Example:
           Assert.assertEquals(actual, expected);
           // If the above assertion fails, the following lines will not be executed.
           System.out.println("This line will not be executed if the assertion fails.");

        Soft Assert:
        1. In Soft Assert, if an assertion fails, the test method continues to execute, and all assertions are evaluated. The failures are collected and reported at the end of the test method.
        2. It is used when you want to perform multiple assertions in a test method and report all failures at once.
        3. Example:
           SoftAssert softAssert = new SoftAssert();
           softAssert.assertEquals(actual, expected);
           // Even if the above assertion fails, the following lines will still be executed.
           System.out.println("This line will be executed even if the assertion fails.");
           softAssert.assertAll(); // This will report all assertion failures.
         */

    }
}
