package org.example.CoreJava;

public class tryCatch {

    public static void main(String[] args) {

        try {
            System.out.println("Try");
        }
        catch (Exception e) {
            System.out.println("Catch");
        }
        finally {
            System.out.println("Finally");
        }

        /*
        Execution order:
        try executes
        No exception → catch skipped
        finally executes

✅ Output:

Try
Finally


Can we have try without catch?
Yes ✅ we CAN have a try block without a catch block — but only if it has a finally block

try {
    int x = 10 / 2;
}
finally {
    System.out.println("Cleanup code");
}


Can finally block be skipped?
Yes ⚠️ in rare situations, the finally block can be skipped

try {
    System.exit(0);
}
finally {
    System.out.println("Finally"); // ❌ not executed
}


Multiple catch blocks – order?
When a try block can throw different types of exceptions, we can handle them using multiple catch blocks.
try {
    // code that may throw exceptions
}
catch (IOException e) {
    // handle IOException
}
catch (Exception e) {
    // handle any other exception
}

What happens if exception occurs in finally?
Finally executes after try/catch
If finally itself throws an exception,
That exception overrides any exception thrown in try or catch
The original exception is lost unless explicitly handled

public class Test {
    public static void main(String[] args) {
        try {
            int x = 10 / 0; // ArithmeticException
        } finally {
            int y = 10 / 0; // Another ArithmeticException
        }
    }
}




         */

    }
}
