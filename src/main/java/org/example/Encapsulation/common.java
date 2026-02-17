package org.example.Encapsulation;

public class common {

    //In this Java for Testers tutorial we will learn Encapsulation in Java or Data Hiding in Java.
    // Encapsulation in Java is the process to wrap the data and code which manipulates that data into a
    // single unit. This is also know as data hiding in Java, it is done to secure the direct data manipulation
    // from other classes.
    //The data can be accessed by other classes using getters and setters, which help in accessing or
    // setting the data for private variables in encapsulated class.

    private   int length;
    private int width;
    private int height;

    public void SetBoxDimension(int l,int b,int h){
        System.out.println("box created " +l+" " +b+ " " +h+" ");

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
