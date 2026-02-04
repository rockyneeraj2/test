package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class VowelConsonsnet_10 {
    public static void main(String[] args) {


        String str = "neeeraj";

        char [] ch = str.toCharArray();

        for(char c:ch){
            if(c=='a' || c=='e'|| c=='i'||c=='o'||c=='u'){
                System.out.println(c +" " + "vowel");
            }else{

                System.out.println(c +" " +"consonant");
            }
        }


    }
}
