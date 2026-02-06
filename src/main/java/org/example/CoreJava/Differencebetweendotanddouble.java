package org.example.CoreJava;

public class Differencebetweendotanddouble {

    public static void main(String[] args) {

        /*

        Difference between == and .equals() in Java == Operator

Compares memory reference (address)
Checks whether both variables point to the same object
Works for primitives and objects

String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);   // false (different objects)

🔹 .equals() Method

Compares content/value of objects
Defined in Object class
Can be overridden by classes (String, Integer, etc.)
System.out.println(a.equals(b)); // true (same content)

| Aspect            | `==`                 | `.equals()`             |
| ----------------- | -------------------- | ----------------------- |
| Type              | Operator             | Method                  |
| Compares          | Reference            | Content (if overridden) |
| Works on          | Primitives & Objects | Objects only            |
| Can be overridden | ❌ No                 | ✅ Yes                   |
| Used for          | Identity check       | Logical equality        |



         */
    }
}
