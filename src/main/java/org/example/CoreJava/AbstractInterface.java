package org.example.CoreJava;

public class AbstractInterface {

    public static void main(String[] args) {

        /*
        🔹 Interface
        An interface defines a contract — what a class must do, not how.

interface Vehicle {
    void start();          // abstract by default
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }
}

            Key Points:
            Methods are public and abstract by default
            Supports multiple inheritance
            Variables are public static final
            No constructors
            Java 8+: default & static methods allowed

            Abstract Class
            An abstract class represents partial abstraction.

            abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Petrol");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts");
    }
}

          Key Points:
          Can have abstract and non-abstract methods
          Supports single inheritance
          Can have instance variables
          Can have constructors

          | Feature          | Interface                 | Abstract Class      |
| ---------------- | ------------------------- | ------------------- |
| Keyword          | `interface`               | `abstract`          |
| Methods          | Abstract, default, static | Abstract & concrete |
| Variables        | `public static final`     | Any type            |
| Inheritance      | Multiple                  | Single              |
| Constructor      | ❌ Not allowed             | ✅ Allowed           |
| Access modifiers | Public only (methods)     | Any                 |
| Implementation   | `implements`              | `extends`           |
| Abstraction      | 100% (before Java 8)      | Partial             |


🔥 Summary Table (Interview Favorite)
| Method Type | Allowed in Interface | Overridable |
| ----------- | -------------------- | ----------- |
| Abstract    | ✅ Yes                | ✅ Yes       |
| Default     | ✅ Yes (Java 8+)      | ✅ Yes       |
| Static      | ✅ Yes (Java 8+)      | ❌ No        |
| Private     | ✅ Yes (Java 9+)      | ❌ No        |



         */
    }
}
