package org.example.CoreJava;

public class StringImmutable {

    public static void main(String[] args) {

        //once a String object is created, its value cannot be changed.
        //A hacker could change the value after validation

        String s = "Java";
        s.concat(" World");   // creates a NEW object
        System.out.println(s); // Java

        //Java uses String Constant Pool.

        String s1 = "Java";
        String s2 = "Java";

        //Both s1 and s2 point to same object in String pool.
        //If String were mutable:
        //Changing s1 would affect s2
        //This would break pool behavior
        //✅ Immutability allows safe object sharing, saving memory.

        //Thread Safety
        //Strings are naturally thread-safe.

    }
}
