package org.example.CoreJava;

public class ArrayListvsLinkedList {

    public static void main(String[] args) {

        /*

| Use Case                                    | ArrayList | LinkedList           |
| ------------------------------------------- | --------- | -------------------- |
| Frequent access by index                    | ✅         | ❌                    |
| Frequent insertion/deletion in middle/start | ❌         | ✅                    |
| Memory-efficient storage                    | ✅         | ❌                    |
| Queue/Deque operations                      | ❌         | ✅ (implements Deque) |


| Feature            | HashSet                         | LinkedHashSet            | TreeSet                           |
| ------------------ | ------------------------------- | ------------------------ | --------------------------------- |
| Order              | No                              | Insertion order          | Sorted order                      |
| Null allowed       | 1 null                          | 1 null                   | ❌ No null                         |
| Performance        | Fast (O(1))                     | Slightly slower          | Slow (O(log n))                   |
| Internal structure | HashMap                         | HashMap + Linked list    | Red-Black tree                    |
| Iteration          | Unpredictable                   | Predictable              | Sorted                            |
| Use case           | Fast lookup, duplicates removed | Maintain insertion order | Sorted elements, range operations |


| Feature             | HashMap                            | Hashtable               |
| ------------------- | ---------------------------------- | ----------------------- |
| Thread-safe         | ❌ No                               | ✅ Yes (synchronized)    |
| Null key/value      | ✅ 1 null key, multiple null values | ❌ None allowed          |
| Legacy              | ❌ New (Java 1.2)                   | ✅ Old (Java 1.0)        |
| Performance         | Fast                               | Slower (synchronized)   |
| Iterator            | Fail-fast                          | Enumerator (legacy)     |
| Part of             | java.util                          | java.util               |
| Use in multi-thread | ❌ Use `ConcurrentHashMap`          | ✅ Built-in synchronized |


| Feature           | HashMap                            | ConcurrentHashMap                   |
| ----------------- | ---------------------------------- | ----------------------------------- |
| Thread-safe       | ❌ No                               | ✅ Yes                               |
| Null key/value    | ✅ 1 null key, multiple null values | ❌ None allowed                      |
| Iterator          | Fail-fast                          | Weakly consistent (fail-safe)       |
| Performance       | Fast in single-threaded            | Fast in multi-threaded (concurrent) |
| Locking mechanism | None                               | Bucket-level locking (segments)     |
| Package           | java.util                          | java.util.concurrent                |
| Suitable for      | Single-threaded                    | Multi-threaded                      |


What is Hashing?

Definition:
Hashing is a technique to convert a large amount of data into a fixed-size value (hash code) using
 a hash function, which allows fast data retrieval.



 Why HashMap allows one null key?
 HashMap allows one null key because it handles null specially by storing it in bucket 0,
 and a Map can have only one null key at a time.


         */
    }
}
