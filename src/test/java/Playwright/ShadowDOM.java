package Playwright;

public class ShadowDOM {

    public static void main(String[] args) {

        /*
        Handling **Shadow DOM in Playwright** is a very common **senior SDET interview question**, especially for modern apps built with Web Components (Lit, Stencil, Polymer, etc.).

I’ll explain clearly:

1. ✅ What is Shadow DOM
2. ✅ Why Selenium struggles but Playwright handles it better
3. ✅ How to handle it in Playwright (with examples)
4. ✅ Closed Shadow DOM handling
5. ✅ Interview-ready explanation

---

# 🔍 What is Shadow DOM?

Shadow DOM allows encapsulation of HTML, CSS, and JS inside a component.

It creates a **separate DOM tree** attached to an element.

Example:

```html
<custom-element>
   #shadow-root (open)
      <button>Click Me</button>
</custom-element>
```

Normal DOM selectors cannot directly access elements inside shadow root.

---

# 🚀 Why Playwright is Better Than Selenium for Shadow DOM?

* Selenium needs JavaScript execution
* Playwright automatically pierces **open shadow roots**
* No special handling required in most cases

That’s why Playwright is preferred for modern UI apps.

---

# ✅ Case 1: Open Shadow DOM (Most Common)

If shadow root is **open**, Playwright handles it automatically.

### Example HTML Structure

```html
<custom-button>
   #shadow-root (open)
      <button id="submit">Submit</button>
</custom-button>
```

---

### ✅ Playwright Code

```js
await page.locator('custom-button >> #submit').click();
```

OR simply:

```js
await page.locator('#submit').click();
```

👉 Playwright automatically searches inside open shadow roots.

---

# ✅ Better Approach (Recommended)

Use locator chaining:

```js
const shadowHost = page.locator('custom-button');
await shadowHost.locator('#submit').click();
```

---

# 🔥 Case 2: Nested Shadow DOM

If shadow DOM is inside another shadow DOM:

```js
await page.locator('parent-element')
          .locator('child-element')
          .locator('#submit')
          .click();
```

Playwright handles nested shadow roots seamlessly.

---

# 🚨 Case 3: Closed Shadow DOM

If shadow root is:

```
#shadow-root (closed)
```

❌ Playwright cannot access it directly.

Because browser security does not expose it.

---

### ✅ Workaround (If allowed)

Using evaluate:

```js
await page.evaluate(() => {
   const host = document.querySelector('custom-element');
   const shadowRoot = host.shadowRoot;
   shadowRoot.querySelector('#submit').click();
});
```

But ⚠️ this works only for open shadow roots.

For closed shadow roots:

👉 You cannot access them unless:

* App provides test hooks
* Developer exposes test ID
* Use alternative strategy

---

# 🔥 How to Identify If Shadow DOM Is Present?

In browser DevTools:

If you see:

```
#shadow-root (open)
```

Then it’s open shadow DOM.

---

# 🎯 Real Interview Question

### ❓ How would you handle shadow DOM in Playwright?

### ✅ Strong Answer:

1. Playwright automatically supports open shadow DOM.
2. Use `locator()` chaining.
3. Avoid XPath inside shadow DOM.
4. For closed shadow DOM, collaborate with dev team.
5. Use `evaluate()` only when necessary.

---

# ⚠️ Common Mistakes

* Using XPath inside shadow DOM (not reliable)
* Using `page.$()` instead of `locator()`
* Not understanding open vs closed shadow root
* Hardcoded waits

---

# 🔥 Senior-Level Answer (Impressive Version)

> "Playwright has native support for open shadow DOM, so we don’t need explicit JS execution like in Selenium. I usually use locator chaining for better stability. If it's a closed shadow root, we either request a test hook or rely on API validation instead of UI interaction."

That answer shows:

* Technical depth
* Real-world thinking
* Collaboration mindset

---

# 💡 Bonus: Shadow DOM + Playwright Best Practice

Use test id:

```js
await page.getByTestId('submit-btn').click();
```

Ask devs to add:

```html
<button data-testid="submit-btn">Submit</button>
```

Best enterprise-level solution.

---

         */
    }
}
