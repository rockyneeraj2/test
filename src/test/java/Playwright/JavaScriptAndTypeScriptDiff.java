package Playwright;

public class JavaScriptAndTypeScriptDiff {

    public static void main(String[] args) {

        /*
        | Feature     | JavaScript | TypeScript      |
| ----------- | ---------- | --------------- |
| Typing      | Dynamic    | Static          |
| Type errors | At runtime | At compile time |
| Type safety | ❌          | ✅               |


// JavaScript
let count = 10;
count = "ten";   // No error


// TypeScript
let count: number = 10;
count = "ten";   // ❌ Compile-time error


3️⃣ Compilation:
| Aspect      | JavaScript    | TypeScript     |
| ----------- | ------------- | -------------- |
| Compilation | Not required  | Required       |
| Output      | Runs directly | Compiles to JS |

4️⃣ Features

| Feature          | JavaScript | TypeScript                           |
| ---------------- | ---------- | ------------------------------------ |
| Interfaces       | ❌          | ✅                                    |
| Generics         | ❌          | ✅                                    |
| Enums            | ❌          | ✅                                    |
| Access modifiers | ❌          | ✅ (`public`, `private`, `protected`) |
| Type inference   | ❌          | ✅                                    |


         */
    }
}
