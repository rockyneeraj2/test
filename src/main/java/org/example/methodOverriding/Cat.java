package org.example.methodOverriding;

public class Cat extends Animal {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.makeNoice();


    }

    public void makeNoice(){
        System.out.println("Cat meous");
    }
}
