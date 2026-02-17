package Playwright;

public class Playwright_Interview {

    public static void main(String[] args) {

        /*

        Perfect 👍 Since you're preparing for **Playwright with JavaScript interviews**, I’ll give you **JS-focused questions that are specifically asked in Playwright automation interviews (SDET / Senior level).**

These are NOT generic JS questions — these are **JavaScript concepts applied inside Playwright**.

---

# 🔥 JavaScript Questions Specifically for Playwright Automation

---

## 1️⃣ Why is almost everything `async` in Playwright?

### ✅ Answer:

Playwright interacts with the browser over WebSocket.
Every action like:

* `click()`
* `fill()`
* `goto()`
* `waitForSelector()`

is asynchronous.

So we must use:

```js
await page.click('#login');
```

If you don’t use `await`:

* Steps execute in parallel
* Race conditions occur
* Tests become flaky

👉 Interview Tip:
"Playwright commands return promises, so proper async/await handling is mandatory to maintain execution order."

---

## 2️⃣ What happens if you use `forEach` with async/await in Playwright?

### ❌ Wrong:

```js
elements.forEach(async (el) => {
   await el.click();
});
```

### 🚨 Problem:

`forEach` does not wait for async functions.

### ✅ Correct:

```js
for (const el of elements) {
   await el.click();
}
```

👉 Very common Playwright interview trap question.

---

## 3️⃣ Difference between `Promise.all()` and sequential await in Playwright?

### Sequential:

```js
await page.click('#a');
await page.click('#b');
```

### Parallel:

```js
await Promise.all([
   page.click('#a'),
   page.click('#b')
]);
```

### ✅ When to use?

* Use `Promise.all` when actions are independent.
* Never use it when actions depend on each other.

---

## 4️⃣ What is Auto-Waiting in Playwright and how is it different from explicit wait?

### ✅ Playwright Auto-Waits For:

* Element to be attached
* Visible
* Stable
* Enabled

```js
await page.click('#submit');
```

No need for:

```js
await page.waitForSelector('#submit');
```

👉 JS concept: Playwright internally handles promises and retry logic before resolving the action.

---

## 5️⃣ What is the difference between `page.locator()` and `page.$()`?

### `page.$()`

* Returns element handle
* Doesn’t auto-wait
* Old style

### `page.locator()`

* Lazy evaluation
* Auto-wait
* Retry mechanism
* Recommended

```js
const button = page.locator('#submit');
await button.click();
```

👉 Locator is JS-based wrapper around retryable logic.

---

## 6️⃣ What is the difference between `await page.waitForTimeout()` and proper wait handling?

### ❌ Bad Practice:

```js
await page.waitForTimeout(5000);
```

Hard-coded delay → slows execution.

### ✅ Better:

```js
await page.waitForSelector('#dashboard');
```

👉 Senior answer:
"Using fixed timeout leads to unstable tests and unnecessary delays. Always wait for state, not time."

---

## 7️⃣ What is the role of Closures in Playwright Test?

Used in:

* Fixtures
* Custom commands
* Test hooks

Example:

```js
test.beforeEach(async ({ page }) => {
   await page.goto('https://example.com');
});
```

Here, `page` is passed via fixture — internally implemented using closures.

---

## 8️⃣ What is `this` behavior inside Playwright tests?

In Playwright Test:

```js
test('example', async ({ page }) => {
});
```

You don't use `this` like Mocha.

Because Playwright uses function scoping differently.

👉 Arrow functions don’t bind `this`.

---

## 9️⃣ How does JavaScript Event Loop affect Playwright execution?

Playwright actions:

* Go to WebSocket
* Browser processes
* Returns promise
* Event loop resolves it

If you block event loop with heavy synchronous code:

```js
while(true){}
```

Your test will freeze.

---

## 🔟 What is the difference between `evaluate()` and normal JS execution?

```js
await page.evaluate(() => {
   return document.title;
});
```

### Important:

Code inside `evaluate()` runs in browser context.
Outside runs in Node.js context.

👉 Very important JS concept.

---

## 1️⃣1️⃣ What is Serialization issue in `evaluate()`?

You cannot pass complex objects:

❌

```js
await page.evaluate(() => {
   return window;
});
```

Because objects must be serializable.

Only:

* primitives
* JSON objects
* arrays

---

## 1️⃣2️⃣ How do you handle dynamic data using JS in Playwright?

Example:

```js
const randomEmail = `user${Date.now()}@test.com`;
await page.fill('#email', randomEmail);
```

JS template literals + dynamic values.

---

## 1️⃣3️⃣ What is Race Condition in Playwright?

Example:

```js
page.click('#submit');
page.waitForNavigation();
```

❌ Wrong (race condition)

✅ Correct:

```js
await Promise.all([
   page.waitForNavigation(),
   page.click('#submit')
]);
```

---

## 1️⃣4️⃣ How do you handle API calls in Playwright using JS?

```js
const response = await page.request.get('/api/users');
const data = await response.json();
```

Uses Promise-based HTTP handling.

---

## 1️⃣5️⃣ What are Common JS Mistakes That Cause Flaky Playwright Tests?

* Missing `await`
* Using `forEach` with async
* Hard-coded waits
* Mixing sync & async
* Not handling promise rejection
* Overusing `waitForTimeout`
* Blocking event loop

---

# 🔥 Senior-Level Scenario Question

### ❓ Your Playwright test randomly fails saying element not found. What JS-level debugging steps would you take?

### ✅ Strong Interview Answer:

1. Check if `await` is missing.
2. Replace `page.$` with `locator`.
3. Check race condition.
4. Use `Promise.all` for navigation + click.
5. Add proper error handling.
6. Check if element inside iframe.
7. Check if shadow DOM.
8. Enable tracing:

   ```bash
   npx playwright show-trace trace.zip
   ```

         */
    }
}
