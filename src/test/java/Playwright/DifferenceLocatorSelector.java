package Playwright;

public class DifferenceLocatorSelector {

    public static void main(String[] args) {

        /*

        🟢 locator()
const button = page.locator('#submit');
await button.click();


Lazy evaluation

Auto-wait built in

Retries automatically

Recommended approach

Modern API

🔴 waitForSelector()
await page.waitForSelector('#submit');
await page.click('#submit');


Explicit waiting

Returns ElementHandle

Older style

Not needed in most cases

Can make tests verbose

🔥 Key Differences Table
Feature	locator()	waitForSelector()
Auto-wait for actions	✅ Yes	❌ No (only waits for appearance)
Re-evaluates DOM	✅ Yes	❌ No
Returns	Locator	ElementHandle
Recommended	✅ Yes	⚠ Only when needed
Reduces flakiness	✅ High	❌ Medium
🎯 Interview Answer

"locator() is a modern, lazy-evaluated API with built-in auto-waiting and retry mechanisms.
 waitForSelector() explicitly waits for an element to appear and returns an ElementHandle,
  making it less resilient and generally unnecessary in modern Playwright tests."
         */
    }
}
