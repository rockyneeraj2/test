package Playwright;

public class ShadowDOM_Debug {

    public static void main(String[] args) {

        /*
        Debugging flaky shadow DOM tests
        Excellent 👍 This is a **very senior-level Playwright interview topic**.

Shadow DOM + flakiness usually happens in:

* Web components (Lit, Stencil, Angular Elements)
* Dynamic rendering
* Lazy-loaded components
* Nested shadow roots
* CI slower environments

Let’s break it down properly.

---

# 🔥 Why Shadow DOM Tests Become Flaky?

Common reasons:

1. Component not fully rendered
2. Shadow host attached but internal elements not ready
3. Re-rendering replaces internal nodes
4. Nested shadow roots loading asynchronously
5. Animation / transition delays
6. Using `page.$()` instead of `locator()`
7. Hardcoded waits

---

# 🧠 Step-by-Step Debugging Strategy

---

# 1️⃣ Verify It’s Really Shadow DOM

Open DevTools:

If you see:

```
#shadow-root (open)
```

Then Playwright can handle it.

If it’s `closed`, you need dev support.

---

# 2️⃣ Use Locator Instead of ElementHandle

❌ Flaky approach:

```js
const btn = await page.$('#submit');
await btn.click();
```

Why flaky?

* ElementHandle is static reference
* If component re-renders → handle becomes stale

---

✅ Stable approach:

```js
await page.locator('#submit').click();
```

Locator:

* Re-queries DOM
* Auto-waits
* Retries internally

This alone fixes 50% flaky issues.

---

# 3️⃣ Wait for Shadow Host Stability

Sometimes host loads but inner content delayed.

Better pattern:

```js
const host = page.locator('custom-element');
await expect(host).toBeVisible();

await host.locator('#submit').click();
```

---

# 4️⃣ Handle Re-Rendering Issues

Modern frameworks re-render shadow DOM after state change.

Problem:

```js
await page.locator('#submit').click();
await page.locator('#message').textContent();
```

If component re-renders → selector may fail.

Better:

```js
await expect(page.locator('#message')).toHaveText('Success');
```

Use assertion-based wait instead of direct access.

---

# 5️⃣ Nested Shadow DOM Flakiness

Structure:

```
parent-element
  #shadow-root
     child-element
        #shadow-root
           button
```

Avoid long CSS chains.

Instead:

```js
const parent = page.locator('parent-element');
const child = parent.locator('child-element');
await child.locator('button').click();
```

Locator chaining is more stable.

---

# 6️⃣ Use Trace Viewer for Debugging

In CI:

```bash
npx playwright test --trace on
```

Then:

```bash
npx playwright show-trace trace.zip
```

Look for:

* Element not attached
* Element detached
* Timeout
* Invisible state

Trace viewer shows DOM snapshot at failure time.

---

# 7️⃣ Add Debug Logs

Temporarily:

```js
await page.pause();
```

Or:

```js
console.log(await page.locator('custom-element').innerHTML());
```

---

# 8️⃣ Avoid `waitForTimeout()`

❌

```js
await page.waitForTimeout(3000);
```

This makes tests:

* Slow
* Still flaky in slow CI

Instead use:

```js
await expect(locator).toBeVisible();
```

---

# 9️⃣ Handle Animations in Shadow DOM

Sometimes click fails due to animation.

Fix:

```js
await locator.click({ force: true });
```

But only if absolutely necessary.

Better:

```js
await expect(locator).toBeEnabled();
await locator.click();
```

---

# 🔟 Flaky Only in CI? Why?

CI environment:

* Slower CPU
* Network delay
* Headless mode timing difference

Solutions:

* Use `--headed` locally for debugging
* Enable slowMo for debugging
* Increase expect timeout

```js
await expect(locator).toBeVisible({ timeout: 10000 });
```

---

# 🔥 Real Senior-Level Answer

### ❓ How would you debug flaky Shadow DOM tests?

### ✅ Strong Interview Response:

> First, I verify whether it's open or closed shadow DOM.
> Then I replace ElementHandle with Locator to avoid stale references.
> I ensure proper assertion-based waits instead of hardcoded delays.
> If nested shadow roots are involved, I use locator chaining.
> I enable Playwright trace viewer to inspect DOM snapshots at failure time.
> If it fails only in CI, I analyze timing differences and increase assertion timeout instead of adding static waits.

That answer shows:

* Technical clarity
* Real-world debugging
* CI awareness
* Best practices mindset

---

# 🚀 Pro-Level Best Practices for Stable Shadow DOM Tests

1. Always use `locator()`
2. Avoid XPath
3. Avoid `page.$`
4. Avoid static waits
5. Use assertion-based waits
6. Collaborate with dev team for test IDs
7. Enable tracing in CI
8. Prefer data-testid inside shadow DOM

---

# 💡 Enterprise-Level Tip

Ask developers to add inside shadow root:

```html
<button data-testid="submit-btn">
```

Then:

```js
await page.getByTestId('submit-btn').click();
```



         */
    }
}
