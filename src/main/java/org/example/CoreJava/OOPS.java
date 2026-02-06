package org.example.CoreJava;

public class OOPS {

    public static void main(String[] args) {

        /*

        OOPS (Object-Oriented Programming System) is a programming approach that uses objects and classes to design software.

Java supports four main OOPS concepts:

Encapsulation

Inheritance

Polymorphism

Abstraction

(+ Association, Aggregation, Composition as supporting concepts)

1️⃣ Encapsulation

Binding data and methods together and hiding internal details.

How Java achieves it:

private variables

public getters and setters

class Employee {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

Benefits:

Data security

Controlled access

Better maintainability

⭐ Interview line:

Encapsulation is data hiding using access modifiers.

2️⃣ Inheritance

One class acquires properties and behavior of another class.

class Animal {
    void eat() {}
}

class Dog extends Animal {
    void bark() {}
}

Types in Java:

Single

Multilevel

Hierarchical

❌ Multiple inheritance not supported using classes
✅ Supported using interfaces

Benefits:

Code reusability

Reduced duplication

⭐ Interview line:

Inheritance enables code reuse using the extends keyword.

3️⃣ Polymorphism

One method, many forms.

Types:
🔹 Compile-time (Method Overloading)
class Calc {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

🔹 Runtime (Method Overriding)
class Parent {
    void show() {}
}

class Child extends Parent {
    void show() {}
}

Benefits:

Flexibility

Loose coupling

⭐ Interview line:

Polymorphism allows the same method name to behave differently based on context.

4️⃣ Abstraction

Hiding implementation and showing only functionality.

Achieved using:

Abstract classes

Interfaces

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }
}



         */
    }
}
