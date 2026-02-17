package org.example.CoreJava;

public class MultipleInheritanceUsingInterface {

    /*
    In Java, **multiple inheritance is not supported with classes**, but it **is supported using interfaces**.

That means:

* A class can extend only **one class**
* But it can implement **multiple interfaces**

---

# ✅ Example: Multiple Inheritance Using Interfaces

### 🔷 Step 1: Create Interface 1

```java
interface Camera {

    void takePhoto();

    void recordVideo();
}
```

---

### 🔷 Step 2: Create Interface 2

```java
interface MusicPlayer {

    void playMusic();

    void stopMusic();
}
```

---

### 🔷 Step 3: Implement Both Interfaces in One Class

```java
class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music...");
    }
}
```

---

### 🔷 Step 4: Main Method

```java
public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.recordVideo();
        phone.playMusic();
        phone.stopMusic();
    }
}
```

---

# ✅ Output

```
Taking photo...
Recording video...
Playing music...
Stopping music...
```

---

# 🔥 Why Java Allows Multiple Inheritance via Interfaces?

Because:

* Interfaces only declare methods (no implementation in older Java versions)
* No ambiguity like in multiple class inheritance
* Avoids Diamond Problem

---

# 🔥 Diamond Problem Example (Interview Point)

If two interfaces have the same method:

```java
interface A {
    void show();
}

interface B {
    void show();
}
```

And class implements both:

```java
class Test implements A, B {
    public void show() {
        System.out.println("Resolved method");
    }
}
```

The class must override the method, so ambiguity is resolved.

---

# 🔥 Java 8+ Default Method Case

If both interfaces have default methods:

```java
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}
```

Then implementing class must override:

```java
class Test implements A, B {
    @Override
    public void show() {
        A.super.show();   // or B.super.show();
    }
}
```

-

Let me know 🚀

     */

}
