package org.example.CoreJava;

public class ArrayListMap {

    public static void main(String[] args) {

        /*
        1️⃣ List
        Definition:
        An ordered collection that allows duplicate elements.
        Common Implementations:
        ArrayList → Fast random access
        LinkedList → Fast insertion/deletion
        Vector → Thread-safe (legacy)

        Characteristics:
        Ordered (insertion order is preserved)
        Allows duplicates
        Elements accessible via index

Example:

List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Apple"); // duplicate allowed
System.out.println(list.get(0)); // Apple


          Use Case:
          Maintaining sequence of elements, allowing duplicates, e.g., list of test steps.

          2️⃣ Set
         A collection that does not allow duplicates.
         Common Implementations:
         HashSet → No order, fast
         LinkedHashSet → Preserves insertion order
         TreeSet → Sorted order
         Characteristics:
         No duplicates allowed
         No direct access via index
         Unordered (except LinkedHashSet / TreeSet)

Example:

Set<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Apple"); // ignored
System.out.println(set); // [Apple, Banana]


Use Case:
Unique items collection, e.g., unique usernames, unique test IDs.

           3️⃣ Map
           Definition
           A collection of key-value pairs.
           Common Implementations:
           HashMap → No order, fast
           LinkedHashMap → Insertion order preserved
           TreeMap → Sorted by keys
           Characteristics:

           Key must be unique, value can be duplicate
           No direct element indexing
           Useful for lookup operations

Example:

Map<String, Integer> map = new HashMap<>();
map.put("Alice", 25);
map.put("Bob", 30);
map.put("Alice", 28); // overwrites previous value
System.out.println(map.get("Alice")); // 28


Use Case:
Storing configuration, lookup tables, caching, e.g., username → password mapping.


| Feature      | List                  | Set                       | Map                                                  |
| ------------ | --------------------- | ------------------------- | ---------------------------------------------------- |
| Duplicates   | Allowed               | Not allowed               | Keys: Not allowed, Values: Allowed                   |
| Order        | Maintained            | No (except LinkedHashSet) | No (except LinkedHashMap/TreeMap)                    |
| Access       | By index              | No index                  | By key                                               |
| Null Allowed | Yes                   | Yes (1 in Set)            | Key: 1 null allowed (HashMap), Value: multiple nulls |
| Examples     | ArrayList, LinkedList | HashSet, TreeSet          | HashMap, TreeMap                                     |

         */
    }
}
