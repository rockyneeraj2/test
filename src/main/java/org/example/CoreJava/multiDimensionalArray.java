package org.example.CoreJava;

public class multiDimensionalArray {

    public static void main(String[] args) {

        int [] [] arr =new int[2][3];
        arr[0][0] =2;
        arr[0][1] =3;
        arr[0][2] =5;
        arr[1][0] =6;
        arr[1][1] =7;
        arr[1][2] =8;

        System.out.println(arr[1][2]);


        int[][] myDimensionArray = {{2,3,5},{4,6,7}};

        for(int i=0;i<myDimensionArray.length;i++){
            for(int j=0;j<myDimensionArray.length;j++){
                System.out.println(myDimensionArray[i][j]);
            }
        }
    }
}
