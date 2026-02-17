package Playwright;

public class OOPS_Javascript {

    public static void main(String[] args) {

        /*

        Great question 👍
Since you're preparing for **Playwright automation interviews**, understanding **OOP in JavaScript (ES6+) and how it’s used in Playwright frameworks** is very important.

I’ll explain:

1. ✅ OOP concepts in JavaScript
2. ✅ Code examples
3. ✅ How each concept is used in Playwright framework
4. ✅ Interview-style explanation

---

# 🔥 OOP in JavaScript (ES6)

JavaScript supports OOP using:

* Classes
* Objects
* Constructor
* Inheritance
* Encapsulation
* Abstraction
* Polymorphism

---

# 1️⃣ Encapsulation

### 🔹 Definition:

Wrapping data and methods together inside a class and restricting direct access.

### ✅ Example:

```js
class User {
  #password; // private field

  constructor(name, password) {
    this.name = name;
    this.#password = password;
  }

  checkPassword(pass) {
    return this.#password === pass;
  }
}

const user = new User("Neeraj", "1234");
```

### 🎯 Use in Playwright:

* Keep locators private
* Expose only actions

```js
class LoginPage {
  constructor(page) {
    this.page = page;
    this.usernameInput = page.locator('#username');
  }

  async login(user, pass) {
    await this.usernameInput.fill(user);
  }
}
```

👉 We hide implementation details and expose only reusable methods.

---

# 2️⃣ Abstraction

### 🔹 Definition:

Showing only necessary functionality and hiding complex logic.

### ✅ Example:

```js
class Payment {
  process() {
    console.log("Processing payment...");
  }
}
```

User doesn’t know internal logic.

### 🎯 Use in Playwright:

In POM:

```js
await loginPage.login("user", "pass");
```

Test doesn’t know:

* How locators work
* How waits happen
* Internal logic

That’s abstraction.

---

# 3️⃣ Inheritance

### 🔹 Definition:

One class acquiring properties/methods of another.

### ✅ Example:

```js
class BasePage {
  constructor(page) {
    this.page = page;
  }

  async navigate(url) {
    await this.page.goto(url);
  }
}

class LoginPage extends BasePage {
  async login() {
    console.log("Login logic");
  }
}
```

### 🎯 Use in Playwright Framework:

Common pattern:

```js
class BasePage {
  constructor(page) {
    this.page = page;
  }

  async waitForPageLoad() {
    await this.page.waitForLoadState('networkidle');
  }
}
```

All pages extend BasePage.

👉 Reduces duplication.

---

# 4️⃣ Polymorphism

### 🔹 Definition:

Same method name, different behavior.

### Example:

```js
class Animal {
  speak() {
    console.log("Animal sound");
  }
}

class Dog extends Animal {
  speak() {
    console.log("Bark");
  }
}
```

### 🎯 Use in Playwright:

Different page classes implement same method:

```js
class ChromeLoginPage {
  async login() {}
}

class MobileLoginPage {
  async login() {}
}
```

Same method → different implementation.

---

# 5️⃣ Constructor in JavaScript

### Used to initialize object properties

```js
class LoginPage {
  constructor(page) {
    this.page = page;
  }
}
```

In Playwright:

`page` object is injected through constructor.

Very common interview question:
👉 "Why do we pass page in constructor?"

Answer:

* Dependency injection
* Better reusability
* Supports parallel execution

---

# 🔥 Real Playwright POM Structure Using OOP

```
pages/
   BasePage.js
   LoginPage.js
   DashboardPage.js

tests/
   login.spec.js
```

---

### BasePage.js

```js
class BasePage {
  constructor(page) {
    this.page = page;
  }

  async waitForLoad() {
    await this.page.waitForLoadState('networkidle');
  }
}

module.exports = BasePage;
```

---

### LoginPage.js

```js
const BasePage = require('./BasePage');

class LoginPage extends BasePage {
  constructor(page) {
    super(page);
    this.username = page.locator('#username');
    this.password = page.locator('#password');
    this.loginBtn = page.locator('#login');
  }

  async login(user, pass) {
    await this.username.fill(user);
    await this.password.fill(pass);
    await this.loginBtn.click();
  }
}

module.exports = LoginPage;
```

---

### login.spec.js

```js
test('login test', async ({ page }) => {
  const loginPage = new LoginPage(page);
  await loginPage.login("admin", "1234");
});
```

---

# 🔥 Why OOP is Important in Playwright Framework?

| Without OOP      | With OOP            |
| ---------------- | ------------------- |
| Code duplication | Reusable classes    |
| Hard maintenance | Structured design   |
| No scalability   | Scalable            |
| Flaky tests      | Stable architecture |

---

# 🔥 Senior-Level Interview Question

### ❓ Why prefer OOP over simple test scripts in Playwright?

### ✅ Strong Answer:

* Improves maintainability
* Promotes code reuse
* Reduces duplication
* Supports large test suites
* Enables abstraction layer
* Easier refactoring
* Better scalability for CI/CD pipelines

Since you already have framework experience (Jenkins + CI/CD background), you can add:

👉 "OOP allows separation of test logic and UI logic, which makes regression execution more stable in CI environments."

---

# 🔥 Advanced Follow-Up Interview Questions

1. When would you NOT use inheritance in Playwright?
2. What is composition vs inheritance in JS?
3. How would you design a scalable Playwright framework?
4. How do you implement Singleton pattern in Playwright?
5. How do you apply SOLID principles in JS automation?

---


         */
    }
}
