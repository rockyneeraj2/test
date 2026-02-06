package org.example.CoreJava;

public class checkedAndUncheckedException {

    public static void main(String[] args) {

        /*

        | Feature             | Checked Exception     | Unchecked Exception          |
| ------------------- | --------------------- | ---------------------------- |
| Checked by compiler | ✅ Yes                 | ❌ No                         |
| Occurs at           | Compile time          | Runtime                      |
| Handling mandatory  | ✅ Yes                 | ❌ No                         |
| Package             | `java.lang.Exception` | `java.lang.RuntimeException` |
| Example             | IOException           | NullPointerException         |


| Feature             | Error             | Exception             |
| ------------------- | ----------------- | --------------------- |
| Package             | `java.lang.Error` | `java.lang.Exception` |
| Nature              | System-level      | Application-level     |
| Recoverable         | ❌ No              | ✅ Yes                 |
| Handling            | ❌ Not recommended | ✅ Recommended         |
| Caused by           | JVM/System        | Application code      |
| Checked by compiler | ❌ No              | Checked / Unchecked   |


         */
    }
}
