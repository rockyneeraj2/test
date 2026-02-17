package Selenium;

public class Testcase10sfailingrandomlyHow_to_fix_it {
    public static void main(String[] args) {

        /*
        Excellent 👍 This is a **very common senior-level automation interview question** (especially for 5+ years experience).

They are testing:

* Debugging skills
* Stability improvement strategy
* Framework understanding
* Root cause analysis approach

---

# ✅ Scenario

👉 10 test cases are failing randomly (flaky tests).

---

# 🔥 Step-by-Step Professional Approach

---

## 🔷 1️⃣ Identify Pattern

First, I check:

* Are failures on same browser?
* Same environment?
* Same module?
* Same time?
* Same error message?

👉 Random failures are usually:

* Synchronization issues
* Environment instability
* Test data conflicts
* Parallel execution issues

---

## 🔷 2️⃣ Check Failure Logs

I analyze:

* Stack trace
* Screenshot
* Video recording (if available)
* Network logs
* Console logs

Most common reasons:

* `NoSuchElementException`
* `StaleElementReferenceException`
* `TimeoutException`

---

## 🔷 3️⃣ Re-run Individually

I run failing test:

* Individually
* In isolation
* Without parallel execution

If it passes individually but fails in suite → likely:

* Shared test data issue
* Session handling issue
* Dependency issue

---

## 🔷 4️⃣ Check Synchronization

Very common cause.

Replace:
❌ Thread.sleep()

With:
✅ Explicit Wait (WebDriverWait)

Example:

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
```

---

## 🔷 5️⃣ Validate Test Data

Check:

* Is test data static?
* Is same user used in parallel?
* Is DB cleanup missing?
* Is data hardcoded?

Solution:

* Use dynamic test data
* Use unique IDs
* Clean up after execution

---

## 🔷 6️⃣ Check Parallel Execution Issues

If running parallel:

* Is driver ThreadLocal?
* Is WebDriver shared?
* Is static variable used?

Correct pattern:

```java
private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
```

Shared driver causes random failures.

---

## 🔷 7️⃣ Check Environment Stability

* Is environment slow?
* Is server overloaded?
* API latency high?
* DB connectivity issues?

Random failures sometimes are infra-related.

---

## 🔷 8️⃣ Improve Locator Strategy

Bad locators cause flakiness.

Avoid:

```xpath
//div[3]/div[2]/button
```

Prefer:

```xpath
//button[contains(text(),'Login')]
```

Or use:

* ID
* Name
* Data-testid attributes

---

## 🔷 9️⃣ Add Retry Logic (Temporary Fix)

Implement `IRetryAnalyzer`:

```java
public boolean retry(ITestResult result) {
    if (count < 2) {
        count++;
        return true;
    }
    return false;
}
```

⚠ Retry is temporary, not permanent fix.

---

## 🔷 10️⃣ Monitor Stability

After fixing:

* Run suite multiple times
* Track failure rate
* Monitor in CI pipeline

---

# 🔥 Root Cause Categories (Very Important)

| Category       | Example             |
| -------------- | ------------------- |
| Sync Issue     | Element not visible |
| Test Data      | Data already exists |
| Parallel Issue | Driver conflict     |
| Locator Issue  | Dynamic XPath       |
| Environment    | API slow            |
| Dependency     | Order dependency    |

---

# 🔥 Interview-Ready Answer (Strong Version)

You can say:

> If 10 test cases are failing randomly, I first analyze logs and identify patterns. I check whether
failures are due to synchronization issues, test data conflicts, or parallel execution problems.
I run tests individually to isolate the issue. Most random failures are caused by improper waits or
 shared driver instances in parallel runs. I fix synchronization using explicit waits, ensure proper
  ThreadLocal driver management, and make test data dynamic. Retry logic may be added temporarily, but
  the focus is always on root cause analysis and long-term stability improvement.

---



         */
    }
}
