package Selenium;

public class How_would_you_wait_in_Selenium_until_the_number_of_browser_abs_equals_4 {

    public static void main(String[] args) {

        /*

        Excellent 👍 This is a **very good synchronization question** (mid–senior Selenium interview level).

They are testing:

* Explicit waits
* Custom ExpectedConditions
* Understanding of window handles
* Dynamic waiting logic

---

# ✅ Scenario

Wait until the number of browser tabs/windows becomes **4**.

---

# 🔥 Best Practice: Use Explicit Wait (WebDriverWait)

Never use:

```java
Thread.sleep(5000);
```

Instead, wait dynamically until condition is met.

---

# ✅ ✅ Recommended Solution (Selenium 4)

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForTabsExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until number of tabs = 4
        wait.until(driverInstance -> driverInstance.getWindowHandles().size() == 4);

        System.out.println("4 tabs are opened successfully!");
    }
}
```

---

# 🔥 How It Works

```java
driverInstance.getWindowHandles().size() == 4
```

* `getWindowHandles()` → returns Set<String>
* `.size()` → number of tabs
* Wait continues until condition becomes true

---

# ✅ Alternative (Using ExpectedConditions)

Selenium provides built-in condition:

```java
wait.until(ExpectedConditions.numberOfWindowsToBe(4));
```

Full Example:

```java
import org.openqa.selenium.support.ui.ExpectedConditions;

wait.until(ExpectedConditions.numberOfWindowsToBe(4));
```

✔ Cleaner
✔ More readable
✔ Recommended in interviews

---

# 🔥 Real Framework-Level Implementation

In Driver Utility class:

```java
public static void waitForNumberOfTabs(WebDriver driver, int numberOfTabs) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfTabs));
}
```

Usage:

```java
waitForNumberOfTabs(driver, 4);
```

---

# 🔥 Interview-Ready Answer (Strong Version)

You can say:

> I would use WebDriverWait with ExpectedConditions.numberOfWindowsToBe(4) to dynamically wait until four tabs are opened. This avoids hardcoded waits and ensures stable execution.

---

# 🔥 Senior-Level Add-On

You can mention:

* Useful when clicking links opening multiple tabs
* Important in parallel execution
* After wait, always switch to required tab

Example:

```java
for (String handle : driver.getWindowHandles()) {
    driver.switchTo().window(handle);
}
```




         */
    }
}
