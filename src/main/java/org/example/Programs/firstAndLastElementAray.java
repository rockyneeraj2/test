package org.example.Programs;

public class firstAndLastElementAray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        if (arr.length > 0) {
            System.out.println("First Element: " + arr[0]);
            System.out.println("Last Element: " + arr[arr.length - 1]);
        } else {
            System.out.println("Array is empty");
        }

    }
}
