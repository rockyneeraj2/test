package org.example.Programs;

import java.util.Arrays;

public class LargestAndSmallestElementArray_5 {
    public static void main(String[] args) {

        int [] arr ={1,3,5,2,344,55};

        int largest = arr[0];
        int smallest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            else if(arr[i]<smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("largest element " +largest);
        System.out.println("smallest element " +smallest);

    }
}
