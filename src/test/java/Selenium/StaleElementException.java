package Selenium;

public class StaleElementException {

    public static void main(String[] args) {

        /*


## 🔹 What is StaleElementReferenceException?

`StaleElementReferenceException` occurs when:

* The **DOM is refreshed or updated**
* The **previously located WebElement is no longer attached** to the current DOM

👉 Selenium still holds the **old reference**, which becomes invalid.

---

## 🔹 Common Causes (Say These in Interview)

✔ Page refresh or navigation
✔ AJAX / dynamic content update
✔ Element re-rendered
✔ DOM change after click / submit
✔ Switching frames or windows

---

## 🔹 How Do You Handle StaleElementReferenceException?

### ✅ 1. Re-locate the Element (Most Common)

```java
driver.findElement(By.id("submit")).click();
```

✔ Never reuse old WebElement after page change

---

### ✅ 2. Use Explicit Wait (Best Practice)

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement btn = wait.until(
    ExpectedConditions.elementToBeClickable(By.id("submit")));
btn.click();
```

✔ Waits for fresh element reference

---

### ✅ 3. Retry Using Try-Catch (Interview Favorite)

```java
int attempts = 0;
while (attempts < 2) {
    try {
        driver.findElement(By.id("submit")).click();
        break;
    } catch (StaleElementReferenceException e) {
        attempts++;
    }
}
```

✔ Useful for highly dynamic pages

---

### ✅ 4. Avoid Storing WebElements in Variables

❌ Bad practice:

```java
WebElement btn = driver.findElement(By.id("submit"));
// DOM refresh
btn.click(); // stale
```

✔ Always locate **just before action**

---

### ✅ 5. Use ExpectedConditions.refreshed() (Advanced)

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement element = wait.until(
    ExpectedConditions.refreshed(
        ExpectedConditions.elementToBeClickable(By.id("submit"))
    )
);
element.click();
```

---

## 🔹 Best Interview Line (Say This Confidently)

> **“Stale element occurs due to DOM refresh. I handle it by re-locating the element and using explicit waits
 instead of storing WebElements.”**



         */
    }
}
