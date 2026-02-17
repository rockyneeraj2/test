package Playwright;

public class JavaScript_Interview {

    public static void main(String[] args) {

        /*

        Since you're preparing for **senior-level automation & SDET interviews**, I’ll give you **intermediate to advanced JavaScript interview questions with crisp but strong answers** — the way you can explain in interviews.

---

# 🔥 JavaScript Interview Questions & Answers (SDET / Senior Level)

---

## 1️⃣ What is the difference between `var`, `let`, and `const`?

### ✅ Answer:

| Feature        | var                            | let          | const        |
| -------------- | ------------------------------ | ------------ | ------------ |
| Scope          | Function scoped                | Block scoped | Block scoped |
| Re-declaration | Allowed                        | Not allowed  | Not allowed  |
| Re-assignment  | Allowed                        | Allowed      | Not allowed  |
| Hoisting       | Yes (initialized as undefined) | Yes (TDZ)    | Yes (TDZ)    |

**Interview Tip:**
Always prefer `const` by default. Use `let` only when reassignment is needed. Avoid `var` in modern JS.

---

## 2️⃣ What is Hoisting?

### ✅ Answer:

Hoisting is JavaScript’s default behavior of moving declarations to the top of their scope before execution.

```javascript
console.log(a); // undefined
var a = 10;
```

With `let` and `const`, variables are hoisted but stay in **Temporal Dead Zone (TDZ)** until initialized.

---

## 3️⃣ What is Closure?

### ✅ Answer:

A closure is when an inner function remembers variables from its outer function even after the outer function has executed.

```javascript
function outer() {
    let count = 0;
    return function inner() {
        count++;
        return count;
    }
}

const counter = outer();
counter(); // 1
counter(); // 2
```

👉 Used in:

* Data privacy
* Module pattern
* Event handlers
* Playwright/Cypress custom commands

---

## 4️⃣ What is Event Loop in JavaScript?

### ✅ Answer:

JavaScript is single-threaded but handles async operations using:

* Call Stack
* Web APIs
* Callback Queue
* Event Loop

The **event loop** continuously checks:

* If call stack is empty
* Then pushes callbacks from queue to stack

---

## 5️⃣ Difference Between `==` and `===`

### ✅ Answer:

* `==` → Loose equality (type coercion)
* `===` → Strict equality (no type conversion)

```javascript
'5' == 5   // true
'5' === 5  // false
```

👉 Always use `===` in production.

---

## 6️⃣ What is a Promise?

### ✅ Answer:

A Promise represents a value that may be available now, later, or never.

States:

* Pending
* Fulfilled
* Rejected

```javascript
fetch(url)
   .then(res => res.json())
   .catch(err => console.log(err));
```

---

## 7️⃣ What is Async/Await?

### ✅ Answer:

Async/await is syntactic sugar over promises that makes async code look synchronous.

```javascript
async function getData() {
   try {
      const response = await fetch(url);
      const data = await response.json();
      return data;
   } catch (error) {
      console.log(error);
   }
}
```

👉 In Playwright, almost everything is async.

---

## 8️⃣ What is the difference between `map`, `filter`, and `reduce`?

### ✅ Answer:

* `map()` → Transform each element
* `filter()` → Filter elements
* `reduce()` → Accumulate to single value

```javascript
const nums = [1,2,3,4];

nums.map(n => n*2);       // [2,4,6,8]
nums.filter(n => n>2);    // [3,4]
nums.reduce((a,b)=>a+b);  // 10
```

---

## 9️⃣ What is Prototype in JavaScript?

### ✅ Answer:

Every JS object has a prototype.
Prototype enables inheritance.

```javascript
function Person(name) {
   this.name = name;
}

Person.prototype.greet = function() {
   return "Hello " + this.name;
}
```

👉 Modern JS uses `class`, but internally it works on prototypes.

---

## 🔟 What is the difference between `call`, `apply`, and `bind`?

### ✅ Answer:

They control `this`.

* `call()` → Immediately invoked, arguments separately
* `apply()` → Immediately invoked, arguments as array
* `bind()` → Returns new function

```javascript
function greet(city) {
   console.log(this.name + " from " + city);
}

const person = { name: "Neeraj" };

greet.call(person, "Delhi");
greet.apply(person, ["Delhi"]);
const newFn = greet.bind(person);
```

---

## 1️⃣1️⃣ What is Debouncing?

### ✅ Answer:

Debouncing delays execution until user stops triggering event.

Used in:

* Search input
* API calls
* UI optimization

---

## 1️⃣2️⃣ What is the difference between Shallow Copy and Deep Copy?

### ✅ Shallow Copy:

Copies reference of nested objects.

```javascript
const obj2 = {...obj1};
```

### ✅ Deep Copy:

Creates full independent copy.

```javascript
const obj2 = JSON.parse(JSON.stringify(obj1));
```

---

## 1️⃣3️⃣ What is Memory Leak in JS?

### ✅ Answer:

Memory leak happens when memory is allocated but not released.

Common causes:

* Unremoved event listeners
* Closures holding references
* Global variables
* Timers not cleared

---

## 1️⃣4️⃣ What is Currying?

### ✅ Answer:

Transforming function with multiple arguments into multiple functions with single argument.

```javascript
function multiply(a) {
   return function(b) {
      return a * b;
   }
}

multiply(2)(3); // 6
```

---

## 1️⃣5️⃣ Difference Between Arrow Function and Normal Function?

| Feature     | Arrow   | Normal  |
| ----------- | ------- | ------- |
| this        | Lexical | Dynamic |
| arguments   | No      | Yes     |
| Constructor | No      | Yes     |



         */
    }
}
