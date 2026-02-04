package org.example.Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter_7 {
    public static void main(String[] args) {
        String str = "hello";
        // String str1 = "programming";

        char[] charArray = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char c:charArray){
            map.put(c,map.getOrDefault(c,0)+1);

        }

        for(char cc:map.keySet()){
                System.out.println(cc+" "+map.get(cc));
                break;

        }

    }
}
