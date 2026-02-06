package org.example.CoreJava;

public class InterviewQuestions {
    public static void main(String[] args) {

        /*

        Reverse a number / string
        Remove duplicates from array
        Second largest element
        Missing number in array
        Count character frequency
        Palindrome check
        Anagram check
        Common elements in two arrays


        Q1: What is the difference between JDK, JRE, and JVM?
        A1:
        - JDK (Java Development Kit) is a software development kit used to develop Java applications. It includes JRE and development tools like compiler (javac), debugger, etc.
        - JRE (Java Runtime Environment) is a package that provides the libraries, Java Virtual Machine (JVM), and other components to run Java applications. It does not include development tools.
        - JVM (Java Virtual Machine) is an abstract machine that enables a computer to run Java programs. It converts bytecode into machine-specific code.

        Q2: Explain the concept of OOP and its main principles.
        A2:
        OOP (Object-Oriented Programming) is a programming paradigm based on the concept of "objects". The main principles of OOP are:
        - Encapsulation: Bundling data and methods that operate on the data within one unit (class).
        - Inheritance: Mechanism by which one class can inherit properties and behaviors (methods) from another class.
        - Polymorphism: Ability of different classes to be treated as instances of the same class through a common interface, typically via method overriding or overloading.
        - Abstraction: Hiding complex implementation details and showing only the essential features of the object.

        Q3: What are the different access modifiers in Java?
        A3:
        The different access modifiers in Java are:
        - public: The member is accessible from any other class.
        - protected: The member is accessible within its own package and by subclasses.
        - default (no modifier): The member is accessible only within its own package.
        - private: The member is accessible only within its own class.

        Q4: What is the difference between an abstract class and an interface?
        A4:
        - An abstract class can have both abstract methods (without implementation) and concrete methods (with implementation). It can also have instance variables.
        - An interface can only have abstract methods (until Java 8) and static/final variables. From Java 8 onwards, interfaces can have default methods with implementation.
        - A class can inherit from only one abstract class but can implement multiple interfaces.

        Q5: What is a Java Collection Framework?
        A5:
        The Java Collection Framework is a unified architecture for representing and manipulating collections of objects. It provides various classes and interfaces to store, retrieve, and manipulate data efficiently. Key components include:
        - List: An ordered collection (e.g., ArrayList, LinkedList).
        - Set: A collection that does not allow duplicate elements (e.g., HashSet, TreeSet).
        - Map: An object that maps keys to values (e.g., HashMap, TreeMap).
        - Queue: A collection used to hold multiple elements prior to processing (e.g., PriorityQueue, LinkedList).


        Q6: What is exception handling in Java?
        A6:
        Exception handling in Java is a mechanism to handle runtime errors, allowing the normal flow of the program to continue. It is done using five keywords:
        - try: A block of code that may throw an exception.
        - catch: A block of code that handles the exception thrown by the try block.
        - finally: A block of code that is always executed after the try and catch blocks, regardless of whether an exception occurred or not.
        - throw: Used to explicitly throw an exception.
        - throws: Used in method signatures to declare that a method may throw one or more exceptions.


        Q7: What is multithreading in Java?
        A7:
        Multithreading in Java is a programming concept that allows multiple threads (smaller units of a process) to run concurrently within a single program. This enables better resource utilization and improved performance, especially for I/O-bound and CPU-bound tasks. Java provides built-in support for multithreading through the Thread class and the Runnable interface.


        Q8: What are Java Generics?
        A8:
        Java Generics is a feature that allows developers to define classes, interfaces, and methods with a placeholder for the type of data they operate on. This enables type safety and code reusability by allowing the same code to work with different data types without the need for casting. Generics are commonly used with Java Collections to specify the type of elements stored in a collection (e.g., List<String>).



        Q9: What is the difference between == and .equals() in Java?
        A9:
        - The '==' operator compares the references (memory addresses) of two objects to check if they point to the same location in memory.
        - The .equals() method compares the actual content of two objects to check if they are logically equivalent. The default implementation in the Object class compares references, but it can be overridden in custom classes to provide meaningful equality checks.

        Q10: What is the purpose of the 'static' keyword in Java?
        A10:
        The 'static' keyword in Java is used to indicate that a particular member (variable or method) belongs to the class itself rather than to any specific instance of the class. This means that the static member can be accessed without creating an instance of the class. Static members are shared among all instances of the class. Common uses of the 'static' keyword include:
        - Static variables: Shared across all instances of a class.
        - Static methods: Can be called without creating an instance of the class.
        - Static blocks: Used for static initialization of a class.

        Contnued...
        Q11: What is the difference between checked and unchecked exceptions in Java?
        A11:
        - Checked exceptions are exceptions that are checked at compile-time. The compiler requires that these exceptions be either caught using a try-catch block or declared in the method signature using the 'throws' keyword. Examples include IOException and SQLException.
        - Unchecked exceptions are exceptions that are not checked at compile-time. These exceptions are subclasses of RuntimeException and do not require explicit handling. Examples include NullPointerException and ArrayIndexOutOfBoundsException.

            Contnued...
        Q12: What is the Java Memory Model?
        A12:
        The Java Memory Model (JMM) is a specification that describes how threads in a Java program interact through memory. It defines the rules for reading and writing variables, ensuring visibility and ordering of
        operations across multiple threads. The JMM helps to prevent issues like race conditions and provides guidelines for writing thread-safe code. Key concepts in the JMM include:
        - Heap Memory: Shared memory area where all class instances and arrays are allocated.
        - Stack Memory: Each thread has its own stack that stores local variables and method call information.
        - Synchronization: Mechanisms like synchronized blocks and volatile variables to control access to shared resources between threads.

        Contnued...
        Q13: What are lambda expressions in Java?
        A13:
        Lambda expressions, introduced in Java 8, are a way to represent functional interfaces (interfaces with a single abstract method) using a more concise syntax. They allow you to write instances of functional interfaces in a clear and expressive manner. The syntax of a lambda expression consists of parameters, the arrow token (->), and a body. Lambda expressions are commonly used in conjunction with the Java Stream API for functional programming. Example:
        ```java
        (parameters) -> expression
        (parameters) -> { statements; }
        ```

        Q14: What is the difference between String, StringBuilder, and StringBuffer in Java?
        A14:
        - String: Immutable sequence of characters. Once created, the value of a String object cannot be changed. Any modification results in the creation of a new String object.
        - StringBuilder: Mutable sequence of characters. It is not synchronized, making it faster for single-threaded operations where thread safety is not a concern.
        - StringBuffer: Mutable sequence of characters. It is synchronized, making it thread-safe but slower than StringBuilder for single-threaded operations.


        Q15: What is the difference between final, finally, and finalize in Java?
        A15:
        - final: A keyword used to declare constants, prevent method overriding, and prevent inheritance of classes.
        - finally: A block used in exception handling that is always executed after the try and catch blocks, regardless of whether an exception occurred or not.
        - finalize: A method in the Object class that is called by the garbage collector before an object is removed from memory. It is used to perform cleanup operations.

       Core java Questions and Answers for Automation engineers for intwerviews.preparation

































        






         */
    }
}
