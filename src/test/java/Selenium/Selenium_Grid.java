package Selenium;

public class Selenium_Grid {

    public static void main(String[] args) {

        /*

        This is a very common **Selenium automation interview question** (especially 3–8 years experience level).

Let’s break it clearly:

---

# ✅ Why Is Selenium Grid Used?

## 🔷 1️⃣ Parallel Execution

Run multiple test cases at the same time → reduces execution time.

Example:

* 100 test cases
* Without Grid → 3 hours
* With Grid (5 nodes) → ~40 minutes

---

## 🔷 2️⃣ Cross-Browser Testing

Run the same test on:

* Chrome
* Firefox
* Edge
* Safari

---

## 🔷 3️⃣ Cross-Platform Testing

Execute tests on different OS:

* Windows
* macOS
* Linux

---

## 🔷 4️⃣ Distributed Execution

Tests run on multiple machines (nodes) connected to a central hub.

---

# 🔥 Architecture of Selenium Grid

![Image](https://miro.medium.com/0%2A1tlt45UHBU00DYVZ.png)

![Image](https://www.selenium.dev/images/documentation/legacy/grid_3/grid.png)

![Image](https://www.tothenew.com/blog/wp-ttn-blog/uploads/2022/09/components-1.png)

![Image](https://dz2cdn1.dzone.com/storage/temp/15252783-grid-4-appim.jpg)

### Components:

### 🔹 Hub

* Central server
* Receives test requests
* Distributes to available nodes

### 🔹 Node

* Machines where browsers are installed
* Executes test cases

---

# ✅ How to Execute Test Cases Using Selenium Grid?

## 🔷 Step 1: Download Selenium Server

From official Selenium website (Grid 4 uses standalone mode).

---

## 🔷 Step 2: Start Selenium Grid (Grid 4)

Run:

```bash
java -jar selenium-server-4.x.x.jar standalone
```

Default runs at:

```
http://localhost:4444
```

---

## 🔷 Step 3: Modify Test Code to Use RemoteWebDriver

Instead of:

```java
WebDriver driver = new ChromeDriver();
```

Use:

```java
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

DesiredCapabilities caps = new DesiredCapabilities();
caps.setBrowserName("chrome");

WebDriver driver = new RemoteWebDriver(
        new URL("http://localhost:4444/wd/hub"),
        caps);
```

---

## 🔷 Step 4: Run Tests in Parallel (TestNG Example)

```xml
<suite name="GridSuite" parallel="tests" thread-count="3">
    <test name="ChromeTest">
        <parameter name="browser" value="chrome"/>
        <classes>
            <class name="TestClass"/>
        </classes>
    </test>
</suite>
```

---

# 🔥 Advanced (Professional-Level Answer)

### Use BrowserOptions (Selenium 4 Best Practice)

```java
ChromeOptions options = new ChromeOptions();

WebDriver driver = new RemoteWebDriver(
        new URL("http://localhost:4444"),
        options);
```

---

# 🔥 Real-Time Framework Integration

In automation framework:

1. Browser type passed from:

   * TestNG XML
   * Jenkins parameter
   * Properties file

2. DriverFactory class decides:

   * Local execution → ChromeDriver
   * Grid execution → RemoteWebDriver

---

# 🔥 Interview Answer (2-Minute Version)

You can say:

> Selenium Grid is used to execute test cases in parallel across multiple browsers and machines. It helps reduce execution time and enables cross-browser and cross-platform testing.
>
> In my framework, I configured Selenium Grid 4 and used RemoteWebDriver to connect to the Grid hub. I parameterized the browser using TestNG and executed tests in parallel to improve CI/CD pipeline efficiency.

---

         */
    }
}
