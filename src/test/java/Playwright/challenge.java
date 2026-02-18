package Playwright;

public class challenge {

    public static void main(String[] args) {

        /*

        Ah, Playwright—fast, powerful, but not all rainbows 🌈. In real projects,
        these are the **most common challenges I’ve faced (and what interviewers love to hear)**:

---

## 1. Handling Dynamic & Flaky Elements

**Challenge:**
Elements load asynchronously, change DOM structure, or re-render → tests fail intermittently.

**How I handled it:**

* Used **auto-waiting** wisely instead of hard waits
* Relied on **`locator` + `expect().toBeVisible()`**
* Avoided XPath where possible; preferred **data-testid**

👉 *Interview angle:* “Playwright reduces flakiness, but poor locator strategy can still break tests.”

---

## 2. Shadow DOM & iFrames

**Challenge:**
Modern apps use **Shadow DOM** and **nested iframes**, which aren’t always straightforward.

**Solution:**

* Used Playwright’s **built-in shadow DOM piercing**
* Handled iframes via:

  ```js
  const frame = page.frameLocator('#frame-id');
  await frame.locator('button').click();
  ```

---

## 3. Authentication & Session Handling

**Challenge:**
Repeated login slowed execution and caused instability.

**Solution:**

* Used **`storageState`** to reuse authenticated sessions
* Saved cookies/local storage once and reused across tests

👉 *Big plus in interviews* ✔️

---

## 4. Parallel Execution Issues

**Challenge:**
Tests passed individually but failed in parallel due to:

* Shared test data
* Same user credentials
* DB/state conflicts

**Fix:**

* Created **isolated test data**
* Used **unique users per worker**
* Avoided shared state in tests

---

## 5. CI/CD Environment Failures

**Challenge:**
Tests worked locally but failed in Jenkins/GitHub Actions.

**Reasons:**

* Headless vs headed behavior
* Missing system dependencies
* Different timeouts

**Solution:**

* Used Playwright’s **Docker image**
* Increased timeouts only for CI
* Captured **screenshots, videos, traces** on failure

---

## 6. Test Data Management at Scale

**Challenge:**
Hardcoded test data caused failures when environments changed.

**Solution:**

* Environment-based configs (`playwright.config.ts`)
* API calls to **create test data dynamically**
* Clean-up via hooks

---

## 7. Handling File Uploads & Downloads

**Challenge:**
Native OS dialogs can’t be automated.

**Solution:**

* Used:

  ```js
  await page.setInputFiles('input[type=file]', 'file.pdf');
  ```
* Validated downloads using `page.waitForEvent('download')`

---

## 8. Debugging Failures

**Challenge:**
Understanding why a test failed in headless mode.

**Solution:**

* Used:

  ```bash
  npx playwright test --debug
  ```
* Enabled **trace viewer**:

  ```bash
  npx playwright show-trace trace.zip
  ```

---

## 9. Migration from Selenium / Cypress

**Challenge:**
Team mindset + framework differences.

**Solution:**

* Trained team on **locators, fixtures, auto-waiting**
* Refactored flaky Selenium patterns
* Standardized framework structure

---

## 10. Reporting & Test Observability

**Challenge:**
Default reports not enough for stakeholders.

**Solution:**

* Integrated **Allure**
* Attached screenshots, videos, API logs
* Tagged tests for smoke/regression

---

### 🔥 One-liner for interviews

> “Playwright is powerful, but the main challenges are managing dynamic UI behavior, parallel execution
conflicts, CI stability, and scalable test data. Most issues are solved with proper framework design rather
 than tool limitations.”

If you want, I can:

* Convert this into **perfect interview answer format**
* Give **real-world failure stories**
* Map these challenges to **Playwright QA Architect-level answers**

Just say the word 👌


         */
    }
}
