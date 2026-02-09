package Playwright;

public class local_test_cases_pass_but_its_failing_in_jenkins {

    public static void main(String[] args) {

        /*

        Classic problem 😄 — interviewers *love* this one. Here’s how to explain it **clearly, practically, and like a senior SDET**.

---

## Why tests pass locally but fail in Jenkins (Playwright)

### 1. Headed vs Headless Execution

**Issue:**

* Local → mostly headed
* Jenkins → headless by default
  Different rendering, timing, and focus behavior.

**Fix:**

```ts
use: {
  headless: true, // test locally in headless too
}
```

👉 Always debug in **headless locally** to reproduce CI issues.

---

### 2. Slower CI Machines (Timing Issues)

**Issue:**
Jenkins nodes are slower → flaky waits fail.

**Fix:**

* Avoid `waitForTimeout`
* Use **explicit expectations**

```ts
await expect(locator).toBeVisible({ timeout: 10000 });
```

---

### 3. Missing OS / Browser Dependencies

**Issue:**
Playwright browsers need system libs (esp. Linux Jenkins).

**Fix:**

```bash
npx playwright install --with-deps
```

✅ Best practice: use **Playwright Docker image**

---

### 4. Environment Variables Not Set

**Issue:**
Local `.env` exists, Jenkins doesn’t.

**Fix:**

* Define env vars in Jenkins:

  * `BASE_URL`
  * `USERNAME`
  * `PASSWORD`
* Or load via Jenkins credentials

```ts
process.env.BASE_URL
```

---

### 5. Wrong Base URL / Network Access

**Issue:**

* App accessible locally
* Jenkins cannot access VPN / internal URL

**Fix:**

* Verify Jenkins node network access
* Whitelist IPs / configure proxy

---

### 6. Parallel Execution Conflicts

**Issue:**
Local → 1 worker
Jenkins → multiple workers

**Symptoms:**

* Shared users
* Shared test data
* Random failures

**Fix:**

```ts
workers: process.env.CI ? 2 : 1
```

or create **unique data per test**

---

### 7. Different Node / Playwright Versions

**Issue:**
Local Node v18, Jenkins Node v14 😬

**Fix:**

* Lock versions:

```bash
node --version
npx playwright --version
```

* Use `.nvmrc` or Docker

---

### 8. File Path Issues (Linux vs Windows)

**Issue:**

* Jenkins → Linux
* Local → Windows

**Fix:**

```ts
path.join(process.cwd(), 'test-data/file.pdf');
```

❌ Avoid hardcoded paths like `C:\`

---

### 9. Tests Depend on Execution Order

**Issue:**
Local sequential pass, Jenkins parallel fails.

**Fix:**

* Remove inter-test dependency
* Use `beforeEach` setup
* Make tests independent

---

### 10. No Proper Logs / Evidence in CI

**Issue:**
Hard to debug failures in Jenkins.

**Fix (MUST mention in interview):**

```ts
use: {
  screenshot: 'only-on-failure',
  video: 'retain-on-failure',
  trace: 'on-first-retry'
}
```

---

## Jenkins-Proof Playwright Config (Example)

```ts
use: {
  headless: true,
  baseURL: process.env.BASE_URL,
  screenshot: 'only-on-failure',
  video: 'retain-on-failure',
  trace: 'on-first-retry'
},
workers: process.env.CI ? 2 : 1,
retries: process.env.CI ? 1 : 0
```

---

## 🔥 Interview-ready answer

> “Local tests passed because they were running in headed mode with stable data and fewer resources. In Jenkins, failures happened due to headless execution, slower machines, missing environment variables, and parallel execution conflicts. I fixed it by improving waits, isolating test data, aligning environments, and adding proper debugging artifacts.”

---

If you want next:

* **Exact Jenkinsfile for Playwright**
* **How to debug CI failures using trace viewer**
* **How to explain this in 30 seconds vs 2 minutes**

Just tell me 👌




         */
    }
}
