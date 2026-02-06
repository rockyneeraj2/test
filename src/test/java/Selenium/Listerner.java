package Selenium;

public class Listerner {

    public static void main(String[] args) {

        /*

        Nice one 👍 — **Listeners** are a *very common* Selenium interview topic.

---

## 🔹 What are Listeners in Selenium?

**Listeners** are special classes in **TestNG** (used with Selenium) that **listen to test execution events** and allow us to perform actions **automatically** when those events occur.

📌 Example events:

* Test started
* Test passed
* Test failed
* Test skipped

---

## 🔹 Why Do We Use Listeners?

In real projects, listeners are used to:

* 📸 Take **screenshots on test failure**
* 📊 Generate **custom reports** (Extent / Allure)
* 🧾 Log test execution status
* 🔁 Retry failed tests
* 🔔 Send email / Slack notifications

👉 **They reduce duplicate code** inside test methods.

---

## 🔹 Commonly Used TestNG Listeners in Selenium

### 1️⃣ `ITestListener` (MOST IMPORTANT)

Used to track **test-level events**.

### Important methods:

```java
onTestStart()
onTestSuccess()
onTestFailure()
onTestSkipped()
onFinish()
```

### Example:

```java
public class TestListener implements ITestListener {

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        // takeScreenshot();
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }
}
```

---

### 2️⃣ `ISuiteListener`

Listens to **suite-level execution**.

Methods:

```java
onStart(ISuite suite)
onFinish(ISuite suite)
```

📌 Used for:

* Initializing reports
* Closing resources after suite execution

---

### 3️⃣ `IRetryAnalyzer`

Used to **retry failed test cases**.

Example:

```java
public class RetryAnalyzer implements IRetryAnalyzer {

    int count = 0;
    int maxRetry = 2;

    public boolean retry(ITestResult result) {
        if (count < maxRetry) {
            count++;
            return true;
        }
        return false;
    }
}
```

---

### 4️⃣ `IInvokedMethodListener`

Listens **before and after every test method**.

Used for:

* Logging
* Dynamic setup/teardown

---

## 🔹 How to Register a Listener?

### Option 1: Using `@Listeners` annotation

```java
@Listeners(TestListener.class)
public class LoginTest {
}
```

### Option 2: Using `testng.xml`

```xml
<listeners>
    <listener class-name="listeners.TestListener"/>
</listeners>
```

👉 **testng.xml is preferred in real projects**

---

## 🔹 Real-Time Project Example (Interview Gold 🥇)

> “In my project, I implemented **ITestListener** to capture screenshots on failure and attach them to **Extent Reports**. I also used **IRetryAnalyzer** to retry flaky tests caused by network or environment issues.”

---

## 🔹 Difference Between Listener and Hook

| Listener                   | TestNG Annotation       |
| -------------------------- | ----------------------- |
| Global                     | Local                   |
| Runs automatically         | Runs inside test class  |
| Used for reporting & retry | Used for setup/teardown |

---



         */
    }
}
