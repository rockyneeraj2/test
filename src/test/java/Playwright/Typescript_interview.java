package Playwright;

public class Typescript_interview {

    public static void main(String[] args) {

        /*

        Since you're preparing for **senior SDET / Playwright roles**, TypeScript is very important (especially with Playwright).

I’ll give you **intermediate to advanced TypeScript interview questions with strong interview-style answers** — not basic textbook definitions.

---

# 🔥 TypeScript Interview Questions & Answers (SDET / Senior Level)

---

## 1️⃣ What is TypeScript and why use it over JavaScript?

### ✅ Answer:

TypeScript is a **superset of JavaScript** that adds:

* Static typing
* Interfaces
* Generics
* Enums
* Access modifiers
* Compile-time error checking

👉 Why important in automation?

* Prevents runtime failures
* Better IntelliSense
* Safer large framework development
* Strong type safety in API responses

---

## 2️⃣ What is the difference between `interface` and `type`?

### ✅ Answer:

| Feature             | interface | type |
| ------------------- | --------- | ---- |
| Object structure    | ✅         | ✅    |
| Union types         | ❌         | ✅    |
| Extending           | extends   | &    |
| Declaration merging | ✅         | ❌    |

### Example:

```ts
interface User {
  name: string;
  age: number;
}

type Status = "success" | "error";
```

👉 In frameworks, `interface` is preferred for object modeling.

---

## 3️⃣ What is `any` vs `unknown`?

### `any`

* Turns off type checking
* Dangerous

### `unknown`

* Safer version of `any`
* Must check type before use

```ts
let value: unknown;

if (typeof value === "string") {
   console.log(value.toUpperCase());
}
```

👉 In automation, avoid `any` in API response validation.

---

## 4️⃣ What are Generics?

### ✅ Answer:

Generics allow reusable components with type safety.

```ts
function identity<T>(value: T): T {
   return value;
}
```

👉 Used heavily in:

* API wrappers
* Utility functions
* Framework reusable modules

---

## 5️⃣ What is `readonly` in TypeScript?

Prevents modification.

```ts
interface User {
   readonly id: number;
   name: string;
}
```

Useful for:

* Config objects
* Test data
* Environment settings

---

## 6️⃣ What is `Partial`, `Required`, and `Pick`?

These are **Utility Types**.

### Partial

```ts
type User = {
   name: string;
   age: number;
}

type PartialUser = Partial<User>;
```

Makes all properties optional.

---

### Pick

```ts
type UserName = Pick<User, "name">;
```

---

### Required

```ts
type RequiredUser = Required<User>;
```

👉 Very common in framework design.

---

## 7️⃣ What is Union vs Intersection?

### Union (`|`)

```ts
type Status = "success" | "error";
```

### Intersection (`&`)

```ts
type Admin = User & {
   role: string;
}
```

---

## 8️⃣ What is Enum in TypeScript?

```ts
enum Role {
   Admin,
   User,
   Guest
}
```

👉 But in modern frameworks, string union types are preferred over enums.

---

## 9️⃣ What is Type Inference?

TypeScript automatically detects type.

```ts
let name = "Neeraj"; // string
```

Explicit typing preferred in framework layer.

---

## 🔟 What is `never` type?

Represents value that never occurs.

```ts
function throwError(): never {
   throw new Error("Error");
}
```

Used in:

* Exhaustive switch checking
* Fail-safe programming

---

## 1️⃣1️⃣ What is `Record` type?

```ts
type Users = Record<string, number>;
```

Equivalent to:

```ts
{
   [key: string]: number
}
```

Useful in:

* Test data mapping
* Environment configs

---

## 1️⃣2️⃣ What is the difference between `extends` in interface and generics?

### Interface:

```ts
interface Admin extends User {}
```

### Generic constraint:

```ts
function getUser<T extends User>(user: T) {}
```

---

## 1️⃣3️⃣ What is `as` keyword?

Type assertion.

```ts
const input = document.getElementById("id") as HTMLInputElement;
```

Used in Playwright DOM operations.

---

## 1️⃣4️⃣ What is Optional Chaining?

```ts
user?.address?.city
```

Prevents runtime errors.

---

## 1️⃣5️⃣ What is Nullish Coalescing?

```ts
const value = input ?? "default";
```

Only checks for null or undefined.

---

# 🔥 TypeScript + Playwright Specific Questions

---

## 1️⃣6️⃣ Why is TypeScript better for Playwright framework?

* Strongly typed locators
* Safe API response handling
* Better auto-completion
* Refactoring safe
* Less runtime bugs

---

## 1️⃣7️⃣ How would you type API response in Playwright?

```ts
interface UserResponse {
   id: number;
   name: string;
   email: string;
}

const response = await request.get('/users');
const data: UserResponse = await response.json();
```

Prevents wrong field access.

---

## 1️⃣8️⃣ What is the difference between `public`, `private`, `protected`?

```ts
class User {
   public name: string;
   private id: number;
   protected role: string;
}
```

* public → accessible everywhere
* private → only inside class
* protected → accessible in child class

Important in POM design.

---

## 1️⃣9️⃣ What is `abstract class`?

Cannot be instantiated.

```ts
abstract class BasePage {
   abstract navigate(): void;
}
```

Used in automation base page structure.

---

## 2️⃣0️⃣ What are Common TypeScript Mistakes in Automation?

* Using `any`
* Not typing API responses
* Not using generics
* Overusing enums
* Ignoring strict mode
* Not defining interfaces for test data

---

# 🔥 Senior-Level Scenario Question

### ❓ Your Playwright framework compiles but fails at runtime due to undefined property. How would TypeScript help prevent it?

### ✅ Strong Answer:

* Enable `strict: true`
* Avoid `any`
* Define interfaces for API responses
* Use optional chaining
* Use union type validation
* Add exhaustive switch checks



         */
    }
}
