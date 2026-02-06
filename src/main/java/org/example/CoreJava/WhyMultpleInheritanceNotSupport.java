package org.example.CoreJava;

public class WhyMultpleInheritanceNotSupport {

    public static void main(String[] args) {

        /*

         Why multiple inheritance is NOT supported with classes in Java?
        Java does not support multiple inheritance using classes to avoid ambiguity and complexity,
         mainly due to the Diamond Problem.

         class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

class C extends A {
    void show() {
        System.out.println("C");
    }
}

// ❌ Not allowed
class D extends B, C {}

         */
    }
}
