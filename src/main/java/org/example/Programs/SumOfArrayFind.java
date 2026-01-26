package org.example.Programs;

public class SumOfArrayFind {

    public static void main(String[] args) {

        int [] number = {1,22,44,55,66};

        int sum =0;

        for(int i=0;i<number.length;i++){
            sum = sum+number[i];
        }

        System.out.println(sum);
    }
}
