package org.example.CoreJava;

public class singleDimensionalArray {

    public static void main(String[] args) {

        int myInt = 2;

        int[] myArray = new int[10];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        System.out.println(myArray[3]);
        System.out.println("length ===" +myArray.length);


        int[] myArrayNew = {10, 20, 30, 40, 50, 60};
        System.out.println(myArrayNew[1]);
        System.out.println("length ===" +myArrayNew.length);

        String [] arr = new String[10];
        byte [] arr1;
        short [] arr12;
        long [] arr3;
        float [] arr4;
        double [] arr5;
        char [] chl;


        System.out.println("print all value from loop");

        int [] ArrayList  = {10,20,30,40};

        for (int i=0;i<ArrayList.length;i++){
            System.out.println(ArrayList[i]);
        }

    }
}
