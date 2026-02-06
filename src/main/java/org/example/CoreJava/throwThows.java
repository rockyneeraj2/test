package org.example.CoreJava;

public class throwThows {

    public static void main(String[] args) {

        /*


| Aspect                     | `throw`                                       | `throws`                                             |
| -------------------------- | --------------------------------------------- | ---------------------------------------------------- |
| What it is                 | Keyword to **explicitly throw an exception**  | Keyword to **declare exceptions**                    |
| Used in                    | **Method body**                               | **Method signature**                                 |
| Number of exceptions       | Throws **one exception at a time**            | Can declare **multiple exceptions**                  |
| Purpose                    | To **actually create and throw** an exception | To **inform caller** that method may throw exception |
| Checked exception handling | Must be handled using try-catch or declared   | Caller must handle or rethrow                        |
| Object creation            | Requires an **exception object**              | No object creation                                   |



Custom exception
A custom exception is a user-defined exception class created to handle application-specific error scenarios.

1️⃣ Checked Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

2️⃣ Unchecked Custom Exception: Extends RuntimeException (Most common)
class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}





         */
    }
}
