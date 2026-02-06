package org.example.CoreJava;

public class DiffStringBuilderBuffer {

    public static void main(String[] args) {

        /*
        1. String
        Immutable
        Once created, cannot be changed
        Any modification creates a new object
        Stored in String Constant Pool
        Thread-safe by default

        String s = "Java";
        s = s.concat(" World");  // new object created

        2. StringBuilder
        Mutable
        Faster than StringBuffer
        Not thread-safe
        Introduced in Java 1.5
        Used in single-threaded environment

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" World");   // same object modified

        3. StringBuffer
        Mutable
        Thread-safe
        Slower than StringBuilder (due to synchronization)
        Available since Java 1.0
        Used in multi-threaded environment

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" World");   // synchronized, thread-safe

        | Feature         | String              | StringBuilder | StringBuffer        |
| --------------- | ------------------- | ------------- | ------------------- |
| Mutability      | ❌ Immutable         | ✅ Mutable     | ✅ Mutable           |
| Thread-safe     | ✅ Yes               | ❌ No          | ✅ Yes               |
| Performance     | Slow (many objects) | Fastest       | Slower than Builder |
| Synchronization | N/A                 | ❌ No          | ✅ Yes               |
| Memory          | High                | Low           | Medium              |
| Introduced in   | Java 1.0            | Java 1.5      | Java 1.0            |







         */

    }
}
