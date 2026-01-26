package org.example.Programs;

import java.util.Arrays;

public class ReverseOnlyLetter {

    public static void main(String[] args) {
        String input = "1ab2";

        int left = 0;
        int right =input.length()-1;
        char [] CharArray = input.toCharArray();

        while (left<right){
            if(!Character.isLetter(CharArray[left])){
                left++;
            }
            else if(!Character.isLetter(CharArray[right])) {
                right--;
            }
            else {
                char temp;
                temp=CharArray[left];
                CharArray[left]=CharArray[right];
                CharArray[right]=temp;
                left++;
                right--;

            }

        }
        System.out.println(Arrays.toString(CharArray));
    }
}
