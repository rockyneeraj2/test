package Playwright;

public class StaleElementException {

    public static void main(String[] args) {

        /*
        🟢 How Playwright Solves It

Playwright does NOT store element references when using locator().

const button = page.locator('#save');
await button.click();


Instead, it stores:

The selector strategy


Before every action, Playwright:

Re-queries the DOM

Gets a fresh element

Performs actionability checks

So even if:

Old element removed

New element recreated

Locator still works ✅

🔥 Internal Behavior

Each time you run:

await button.click();


Playwright:

→ Finds element again
→ Checks visibility
→ Checks stability
→ Checks enabled state
→ Performs click


No stale reference stored.

🎯 Interview One-Liner

"Playwright avoids stale element exceptions by not storing fixed element references. The Locator API
re-evaluates the DOM before every action, ensuring it always interacts with a fresh element instance."
         */
    }
}
