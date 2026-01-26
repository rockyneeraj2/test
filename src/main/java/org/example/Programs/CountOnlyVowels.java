package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class CountOnlyVowels {

    public static void main(String[] args) {

        String input = "Neeraj kumar";

        char [] charArray =input.toCharArray();

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char x:charArray){
            if(x=='a'||x=='e' || x=='i'||x=='o'||x=='u'){
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }

        System.out.println(map);

    }
}
