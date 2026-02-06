package Selenium;

public class SeleniumException {

    public static void main(String[] args) {

        /*

        Perfect 👍 — **Selenium exceptions** are **high-frequency interview questions**.
Interviewers usually ask **what it is, why it occurs, and how you handle it**.

Below is a **clean, interview-ready list** with **cause + fix**.

---

## 🔹 Most Common Selenium Exceptions

---

### 1️⃣ NoSuchElementException

**Cause**

* Element not present in DOM
* Wrong locator
* Page not loaded yet

**Solution**

* Use explicit wait
* Verify locator

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
```

---

### 2️⃣ StaleElementReferenceException

**Cause**

* DOM refreshed
* Element re-rendered

**Solution**

* Re-locate element
* Avoid storing WebElements

```java
driver.findElement(By.id("submit")).click();
```

---

### 3️⃣ TimeoutException

**Cause**

* Wait condition not met within time

**Solution**

* Increase wait time
* Fix locator or condition

```java
wait.until(ExpectedConditions.elementToBeClickable(By.id("save")));
```

---

### 4️⃣ ElementNotInteractableException

**Cause**

* Element hidden or disabled

**Solution**

* Wait for visibility
* Scroll into view

```java
((JavascriptExecutor)driver)
.executeScript("arguments[0].scrollIntoView(true);", element);
```

---

### 5️⃣ ElementClickInterceptedException

**Cause**

* Another element overlaps (popup, loader)

**Solution**

* Wait for overlay to disappear
* Click via JS if needed

```java
wait.until(ExpectedConditions.invisibilityOf(overlay));
```

---

### 6️⃣ InvalidSelectorException

**Cause**

* Wrong XPath / CSS syntax

**Solution**

* Validate selector in browser dev tools

---

### 7️⃣ SessionNotCreatedException

**Cause**

* Browser and driver version mismatch

**Solution**

* Update browser or driver

---

### 8️⃣ NoSuchWindowException

**Cause**

* Switching to closed window

**Solution**

* Validate window handles before switching

---

### 9️⃣ NoSuchFrameException

**Cause**

* Frame not available

**Solution**

* Wait for frame

```java
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame1"));
```

---

### 🔟 UnhandledAlertException

**Cause**

* Alert present but not handled

**Solution**

* Handle alert before any action

```java
driver.switchTo().alert().accept();
```

---

## 🔹 Interview-Favorite Question

**Q:** Difference between NoSuchElementException and TimeoutException?

| NoSuchElement     | Timeout           |
| ----------------- | ----------------- |
| Element not found | Condition not met |
| Immediate         | After wait time   |

---

## 🔹 Best Interview Line (Say This)

> **“Most Selenium exceptions occur due to synchronization issues, so I handle them using explicit waits and stable locators.”**



         */
    }
}
