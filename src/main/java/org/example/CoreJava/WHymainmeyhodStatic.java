package org.example.CoreJava;

public class WHymainmeyhodStatic {

    public static void main(String[] args) {

        /*

        The main method is static so that JVM can call it without creating an object of the class.

🔹 What happens when a Java program runs?

JVM loads the class

JVM looks for this method:

public static void main(String[] args)


JVM does NOT create an object

JVM directly calls main()

👉 Since no object exists yet, main must be static.

🔹 What if main was NOT static?
public void main(String[] args) { }


JVM would need to create an object first

But object creation requires constructor

Constructor may depend on main

❌ Circular dependency → program cannot start

🔹 Key Reasons (Interview Points)
1️⃣ No object required

Program entry point

JVM can call it directly using class name

2️⃣ Memory efficiency

No unnecessary object creation

Faster startup

3️⃣ Consistent program execution

Same entry point for every Java program

         */
    }
}
