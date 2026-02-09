package Selenium;

public class DataDrivenKeywordDriven {

    public static void main(String[] args) {

        /*

        Great question 👍 — **Data-Driven vs Keyword-Driven frameworks** are **classic automation interview topics**, especially for Selenium + Java roles.

Here’s a **clear, interview-ready comparison** with examples and talking points.

---

## 🔹 What is a Data-Driven Framework?

A **Data-Driven Framework** separates **test data** from **test scripts** so the same test can
run multiple times with different inputs.

### 🔸 Data Sources

* Excel
* CSV
* JSON
* Database
* Properties file

### 🔸 Example (TestNG + DataProvider)

```java
@DataProvider
public Object[][] loginData() {
    return new Object[][] {
        {"admin","admin123"},
        {"user","user123"}
    };
}

@Test(dataProvider = "loginData")
public void loginTest(String user, String pass) {
    loginPage.login(user, pass);
}
```

✔ One test → multiple data sets
✔ Easy to scale test coverage

---

## 🔹 What is a Keyword-Driven Framework?

A **Keyword-Driven Framework** separates **test logic** from **test execution** using **keywords** like:

* `OPEN_BROWSER`
* `ENTER_TEXT`
* `CLICK`
* `VERIFY_TEXT`

### 🔸 Example Keyword Table (Excel)

| Keyword      | Locator  | Value    |
| ------------ | -------- | -------- |
| OPEN_BROWSER | chrome   |          |
| ENTER_TEXT   | username | admin    |
| ENTER_TEXT   | password | admin123 |
| CLICK        | loginBtn |          |

### 🔸 Keyword Implementation (Java)

```java
public void performAction(String keyword, String locator, String value) {
    switch(keyword) {
        case "ENTER_TEXT":
            driver.findElement(By.id(locator)).sendKeys(value);
            break;
        case "CLICK":
            driver.findElement(By.id(locator)).click();
            break;
    }
}
```

✔ Non-technical users can write tests
✔ High abstraction

---

## 🔹 Data-Driven vs Keyword-Driven (Interview Table)

| Feature         | Data-Driven          | Keyword-Driven          |
| --------------- | -------------------- | ----------------------- |
| Focus           | Test data            | Test actions            |
| Test logic      | In code              | In keywords             |
| Data repetition | High                 | Low                     |
| Complexity      | Medium               | High                    |
| Maintenance     | Easy                 | Hard                    |
| Used by         | Automation engineers | Manual / Business users |

---

## 🔹 Which One Do You Use in Real Projects?

👉 **Hybrid Framework** (Best Answer)

> **“In real projects, I use a hybrid framework combining POM, Data-Driven, and Keyword-Driven approaches.”**

---

## 🔹 Interview-Winning Line

> **“Data-Driven improves test coverage, while Keyword-Driven improves readability; hybrid frameworks
give the best of both.”**

---


         */
    }
}
