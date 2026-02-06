package Selenium;

public class SeleniumChallenges {

    public static void main(String[] args) {

        /*

        1️⃣ Dynamic Elements

Problem:
IDs / XPaths change on every page load.

Solution:

Use contains(), starts-with() in XPath

Use stable attributes

Use relative XPath / CSS

//button[contains(text(),'Login')]


👉 Interview line:

“I handle dynamic elements using relative locators and dynamic XPath strategies.”

2️⃣ Synchronization Issues

Problem:
Element not visible / clickable → flaky tests.

Solution:

Explicit wait (WebDriverWait)

Avoid Thread.sleep()

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(element));


👉 Interview line:

“I rely on explicit waits instead of hard waits.”

3️⃣ Stale Element Reference Exception

Problem:
DOM refreshes after element is located.

Solution:

Re-locate the element

Use retry mechanism

driver.findElement(By.id("submit")).click();


👉 Interview line:

“I re-locate elements after DOM updates.”

4️⃣ Handling Frames & iFrames

Problem:
Element not found even though XPath is correct.

Solution:

Switch to frame first

driver.switchTo().frame("frameName");


👉 Interview line:

“I always verify and switch to the correct frame.”

5️⃣ Multiple Windows / Tabs

Problem:
Control lost after new window opens.

Solution:

Use getWindowHandles()

for(String win : driver.getWindowHandles()){
    driver.switchTo().window(win);
}

6️⃣ File Upload & Download

Problem:
OS-level dialogs not supported.

Solution:

Upload → sendKeys()

Download → browser preferences

fileInput.sendKeys("C:\\file.pdf");


👉 Interview line:

“Selenium handles uploads directly but downloads via browser config.”

7️⃣ Handling Alerts

Problem:
Unexpected alerts break execution.

Solution:

Switch to alert

Alert alert = driver.switchTo().alert();
alert.accept();

8️⃣ Flaky Tests

Problem:
Tests fail intermittently in CI.

Causes:

Sync issues

Dynamic data

Environment instability

Solution:

Smart waits

Retry analyzer

Stable test data

👉 Interview line:

         */

    }
}
