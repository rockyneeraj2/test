package org.example.CoreJava;

public class TypesOfInheritance {

    public static void main(String[] args) {

        /*
        nheritance means one class acquiring properties and behavior of another class using the extends keyword.
Java supports 5 types of inheritance conceptually, but only 3 using classes directly.

1️⃣ Single Inheritance ✅ (Supported)

One child class inherits one parent class

class Parent {
    void show() {}
}

class Child extends Parent {
    void display() {}
}


✔ Simple
✔ Most commonly used

2️⃣ Multilevel Inheritance ✅ (Supported)

Chain of inheritance

class GrandParent {
    void gp() {}
}

class Parent extends GrandParent {
    void p() {}
}

class Child extends Parent {
    void c() {}
}


✔ Reusability across multiple levels

3️⃣ Hierarchical Inheritance ✅ (Supported)

Multiple child classes inherit the same parent

class Parent {
    void show() {}
}

class Child1 extends Parent {}
class Child2 extends Parent {}


✔ Common functionality shared

4️⃣ Multiple Inheritance ❌ (Not Supported with Classes)

One child inherits multiple parent classes

// NOT allowed
class Child extends Parent1, Parent2 {}


❌ Not supported due to Diamond Problem

How Java solves it?

✔ Using interfaces

interface A {
    void show();
}

interface B {
    void show();
}

class Test implements A, B {
    public void show() {
        System.out.println("Implemented");
    }
}

5️⃣ Hybrid Inheritance ❌ (Not Supported with Classes)

Combination of multiple inheritance types

Supported only using interfaces

Not supported using classes


| Type         | Using Classes | Using Interfaces |
| ------------ | ------------- | ---------------- |
| Single       | ✅ Yes         | ✅ Yes            |
| Multilevel   | ✅ Yes         | ✅ Yes            |
| Hierarchical | ✅ Yes         | ✅ Yes            |
| Multiple     | ❌ No          | ✅ Yes            |
| Hybrid       | ❌ No          | ✅ Yes            |


*/



    }
}

