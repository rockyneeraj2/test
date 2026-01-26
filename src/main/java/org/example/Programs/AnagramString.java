package org.example.Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

        String str1 ="listen";
        String str2 = "silent";

        char [] ch1 = str1.toLowerCase().toCharArray();
        char [] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Given string are Anagram");
        }
        else {
            System.out.println("Given string are not Anagram");
        }
    }
}
