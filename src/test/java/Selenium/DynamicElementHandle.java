package Selenium;

public class DynamicElementHandle {

    public static void main(String[] args) {

        /*

        🔹 How Do You Handle Dynamic Elements in Selenium?
✅ 1. Use Dynamic XPath / CSS (Most Common)

XPath with contains()

//input[contains(@id,'user_')]


XPath with starts-with()

//div[starts-with(@id,'order_')]


XPath with text

//button[text()='Submit']


✅ 2. Use Explicit Waits (Must Mention)
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement element = wait.until(
    ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
element.click();


✅ 4. Use Parent–Child or Sibling Relationships
//label[text()='Email']/following-sibling::input


✅ 5. Use findElements() Instead of findElement()
List<WebElement> rows = driver.findElements(By.cssSelector(".row"));
if (!rows.isEmpty()) {
    rows.get(0).click();
}

✅ 7. Use JavaScript Executor (Last Option)
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();",
    driver.findElement(By.id("submit")));
         */
    }
}
