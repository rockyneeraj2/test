package org.example.CoreJava;

public class finalFinallyFinalize {

    public static void main(String[] args) {

        /*

        1️⃣ final variable
        Value cannot be changed
        final int x = 10;
        // x = 20; ❌ compile-time error

        2️⃣ final method
        Cannot be overridden
        class A {
        final void show() {}

        3️⃣ final class
        Cannot be inherited
        final class Test {}

        🔹 finally (Block)
        Used with try-catch
        Always executes whether exception occurs or not
        Used for cleanup code (closing DB, files, browser)

        try {
    int x = 10 / 0;
} catch (Exception e) {
    System.out.println("Exception");
} finally {
    System.out.println("Always executed");
}

}

            | Aspect            | final                       | finally   | finalize()   |
| ----------------- | --------------------------- | --------- | ------------ |
| Type              | Keyword                     | Block     | Method       |
| Purpose           | Restriction                 | Cleanup   | GC cleanup   |
| Used with         | Variables, methods, classes | try-catch | Object class |
| Execution         | Compile-time                | Runtime   | GC dependent |
| Can be overridden | ❌ No                        | ❌ No      | ✅ Yes        |
| Reliability       | High                        | High      | ❌ Low        |


         */
    }
}
