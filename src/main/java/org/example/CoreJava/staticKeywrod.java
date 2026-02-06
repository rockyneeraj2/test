package org.example.CoreJava;

public class staticKeywrod {

    public static void main(String[] args) {

        /*

        The static keyword is used to associate a variable, method, or block with the class itself,
        rather than with an object

        Static Variable (Class Variable)
        Single copy shared by all objects
        Stored in Method Area
        Created when class is loaded

        class Test {
    static int count = 0;

    Test() {
        count++;
    }
}

Test t1 = new Test();
Test t2 = new Test();
System.out.println(Test.count); // 2

          Static Method
          Can be called without object
          Can access only static members directly
          Cannot use this or super

          class Utils {
    static void print() {
        System.out.println("Hello");
    }
}

Utils.print();

        Static Block
        Executes once when class is loaded
        Used for static initialization

        class Demo {
    static {
        System.out.println("Static block executed");
    }
}

      Static Class
     Only nested classes can be static
     Helps logically group classes

     class Outer {
    static class Inner {
        void show() {}
    }
}



         */
    }
}
