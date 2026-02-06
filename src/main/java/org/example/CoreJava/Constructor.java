package org.example.CoreJava;

public class Constructor {

    public static void main(String[] args) {

        /*

        What is constructor? Types of constructors
        What is a Constructor in Java?
        A constructor is a special method used to initialize an object when it is created.

        Key points:
        Constructor name = class name
        No return type (not even void)
        Automatically called when object is created using new
        Used to initialize instance variables

        class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
Student s = new Student(1, "Neeraj");


          Why do we need constructors?
          Initialize object state
          Allocate resources
          Ensure object is created in a valid state

          1️⃣ Default Constructor
          Provided by compiler
          Has no parameters
          Initializes variables with default values

          class Test {
    int x;
}

Test t = new Test(); // compiler provides default constructor

          2️⃣ No-Argument Constructor (User-Defined)
          Written explicitly by programmer
          Has no parameters

          class Test {
    Test() {
        System.out.println("No-arg constructor");
    }
}

          3️⃣ Parameterized Constructor
          Accepts parameters
          Used to initialize object with custom values

          class Emp {
    int id;
    Emp(int id) {
        this.id = id;
    }
}
             4️⃣ Copy Constructor (Not Official, But Asked!)
             Java does not have built-in copy constructor like C++,
             but we can create one manually.

class Emp {
    int id;

    Emp(Emp e) {
        this.id = e.id;
    }
}

              🔹 Constructor Chaining
              Calling one constructor from another using this() or super().
              Using this()

              class Test {
    Test() {
        this(10);
    }
    Test(int x) {
        System.out.println(x);
    }
}


         */
    }
}
