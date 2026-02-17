package TestNG;

public class Listerner {

    public static void main(String[] args) {

        /*

        This is a **very important TestNG interview question** (especially for automation framework roles).

---

# ✅ What Are Listeners in TestNG?

**Listeners in TestNG** are interfaces that allow you to **listen to test execution events** and perform custom actions when those events occur.

In simple terms:

> Listeners help you perform actions like logging, taking screenshots, generating reports, or sending emails when a test passes, fails, or starts.

---

# 🔷 Why Are Listeners Used?

They are mainly used for:

* Taking screenshots on failure
* Custom logging
* Generating reports (Extent Reports)
* Retrying failed test cases
* Sending email notifications
* Updating external systems (Jira, TestRail)

---

# 🔥 Types of Important TestNG Listeners

| Listener Interface       | Purpose                         |
| ------------------------ | ------------------------------- |
| `ITestListener`          | Listen to test execution events |
| `ISuiteListener`         | Listen to suite-level execution |
| `IInvokedMethodListener` | Before/After method execution   |
| `IRetryAnalyzer`         | Retry failed tests              |
| `IAnnotationTransformer` | Modify annotations at runtime   |

Most commonly used: **ITestListener**

---

# 🔷 Test Execution Flow (Where Listeners Work)

![Image](https://cms-cdn.katalon.com/test_execution_out_of_the_stages_in_software_testing_life_cycle_150c6ae3eb.png)

![Image](https://miro.medium.com/v2/resize%3Afit%3A1358/format%3Awebp/1%2A8RFy0soYI9UO5-YaYHYhrw.png)

![Image](https://media.licdn.com/dms/image/v2/D5622AQG0BRXQhzphtw/feedshare-shrink_800/B56ZlV0wgSJwAk-/0/1758081518095?e=2147483647\&t=LVK_HruI0OPlxSamt00DMe32rItSzHAa1_usbJhTIpI\&v=beta)

![Image](https://miro.medium.com/0%2A7MgNKgJRyS7Ne10I.png)

Listeners hook into events like:

* onStart()
* onTestStart()
* onTestSuccess()
* onTestFailure()
* onFinish()

---

# ✅ How to Implement Listeners in TestNG

---

## 🔷 Step 1: Create Listener Class

Implement `ITestListener`

```java
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }
}
```

---

## 🔷 Step 2: Register Listener

### Option 1: Using testng.xml (Recommended)

```xml
<listeners>
    <listener class-name="com.framework.listeners.MyListener"/>
</listeners>
```

---

### Option 2: Using Annotation

```java
@Listeners(MyListener.class)
public class TestClass {
}
```

---

# 🔥 Real-Time Framework Example: Screenshot on Failure

Inside `onTestFailure()`:

```java
@Override
public void onTestFailure(ITestResult result) {

    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(source, new File("screenshots/" + result.getName() + ".png"));
}
```

This is very common in Selenium frameworks.

---

# 🔥 Retry Failed Tests (IRetryAnalyzer)

Example:

```java
public class RetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    int maxRetry = 2;

    @Override
    public boolean retry(ITestResult result) {
        if (counter < maxRetry) {
            counter++;
            return true;
        }
        return false;
    }
}
```

Use in test:

```java
@Test(retryAnalyzer = RetryAnalyzer.class)
```

---

# 🔥 Interview-Ready Answer (2-Minute Version)

You can say:

> Listeners in TestNG are interfaces that allow us to execute custom logic during different phases of test execution. For example, using ITestListener, we can capture screenshots on failure, log results, or update reports. In my framework, I implemented a custom listener to capture screenshots and attach them to Extent Reports whenever a test fails. I registered the listener through testng.xml to apply it globally.

---

# 🔥 Advanced Level Answer (If 5+ Years Experience)

> I use listeners for centralized reporting, failure handling, retry mechanisms, and CI notifications. It helps maintain separation of concerns by keeping test logic and reporting logic independent.

---




         */
    }
}
