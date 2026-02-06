package org.example.CoreJava;

public class collections {
    public static void main(String[] args) {

        /*

        What is Iterator vs ListIterator?

| Feature          | Iterator                    | ListIterator                                                         |
| ---------------- | --------------------------- | -------------------------------------------------------------------- |
| Applicable to    | All Collections except Map  | Only List                                                            |
| Traversal        | Forward only                | Forward & backward                                                   |
| Modify elements  | remove() only               | add(), set(), remove()                                               |
| Start from index | ❌ No                        | ✅ Yes                                                                |
| Methods          | hasNext(), next(), remove() | hasNext(), next(), hasPrevious(), previous(), add(), set(), remove() |
| Introduced in    | Java 1.2                    | Java 1.2                                                             |



How to make collection thread-safe?
Collections in Java can be made thread-safe using Collections.synchronizedXXX(),
concurrent collections like ConcurrentHashMap and CopyOnWriteArrayList, or by manually
synchronizing access with synchronized blocks.

Comparable vs Comparator

| Feature            | Comparable             | Comparator                            |
| ------------------ | ---------------------- | ------------------------------------- |
| Interface Type     | `java.lang`            | `java.util`                           |
| Method             | `compareTo()`          | `compare()`                           |
| Class modification | Class must implement   | Class can remain unchanged            |
| Number of ways     | Single                 | Multiple                              |
| Object creation    | No extra object needed | Extra comparator object may be needed |
| Default sorting    | Natural order          | Custom order                          |


| Collection                    | Collections                                              |
| ----------------------------- | -------------------------------------------------------- |
| Interface                     | Utility class                                            |
| Represents a group of objects | Provides static utility methods (sort, reverse, shuffle) |
| e.g., List, Set, Queue        | e.g., `Collections.sort(list)`                           |



| Feature              | ArrayList     | LinkedList            |
| -------------------- | ------------- | --------------------- |
| Underlying structure | Dynamic array | Doubly linked list    |
| Random access        | Fast (O(1))   | Slow (O(n))           |
| Insert/remove middle | Slow          | Fast                  |
| Memory               | Less          | More (extra pointers) |


| Feature                | ArrayList | Vector             |
| ---------------------- | --------- | ------------------ |
| Thread-safe            | No        | Yes (synchronized) |
| Performance            | Faster    | Slower             |
| Legacy                 | No        | Yes                |
| Default size increment | 50%       | 100%               |


| Feature     | Stack                 | Queue                     |
| ----------- | --------------------- | ------------------------- |
| Interface   | Class                 | Interface                 |
| Order       | LIFO                  | FIFO                      |
| Methods     | push(), pop(), peek() | offer(), poll(), peek()   |
| Thread-safe | Vector-based          | Depends on implementation |


| Feature        | HashSet   | TreeSet                        |
| -------------- | --------- | ------------------------------ |
| Order          | No        | Sorted (natural or Comparator) |
| Performance    | O(1)      | O(log n)                       |
| Null           | 1 allowed | ❌ Not allowed                  |
| Implementation | HashMap   | TreeMap                        |


| Feature     | HashMap | Hashtable          |
| ----------- | ------- | ------------------ |
| Thread-safe | No      | Yes (synchronized) |
| Null key    | 1       | ❌                  |
| Null values | ✅       | ❌                  |
| Legacy      | No      | Yes                |


| Feature     | ArrayList     | CopyOnWriteArrayList        |
| ----------- | ------------- | --------------------------- |
| Thread-safe | ❌             | ✅                           |
| Performance | Fast          | Slow on write, fast on read |
| Use-case    | Single-thread | Multi-thread read-heavy     |




How does TreeMap work internally?
TreeMap internally uses a Red-Black Tree, storing keys in sorted order,
 providing O(log n) time for insertion, deletion, and search.

Why Map is not part of Collection interface?
         */
    }
}
