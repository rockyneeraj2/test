package Playwright;

public class letVarConstantDiff {

    public static void main(String[] args) {

        /*

        1️⃣ Scope Difference
        | Keyword | Scope Type      |
| ------- | --------------- |
| `var`   | Function-scoped |
| `let`   | Block-scoped    |
| `const` | Block-scoped    |


function test() {
  if (true) {
    var a = 10;
    let b = 20;
    const c = 30;
  }

  console.log(a); // ✅ 10
  console.log(b); // ❌ ReferenceError
  console.log(c); // ❌ ReferenceError
}

var ignores block {}
👉 let and const respect block scope

2️⃣ Hoisting
| Keyword | Hoisted | Initialized     |
| ------- | ------- | --------------- |
| `var`   | Yes     | Yes (undefined) |
| `let`   | Yes     | No              |
| `const` | Yes     | No              |

console.log(x); // undefined
var x = 5;

console.log(y); // ❌ ReferenceError
let y = 5;

3️⃣ Re-declaration & Re-assignment
| Keyword | Re-declare | Re-assign |
| ------- | ---------- | --------- |
| `var`   | ✅          | ✅         |
| `let`   | ❌          | ✅         |
| `const` | ❌          | ❌         |


4️⃣ const with Objects
const user = { name: "Neeraj" };
user.name = "Kumar";  // ✅ allowed

const prevents reassignment, not mutation.



         */
    }
}
