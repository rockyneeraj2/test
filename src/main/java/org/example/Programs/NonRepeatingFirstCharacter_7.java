package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingFirstCharacter_7 {
    public static void main(String[] args) {
        String str = "heerrello";
        // String str1 = "programming";

        char[] charArray = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char c:charArray){
            map.put(c,map.getOrDefault(c,0)+1);

        }

        for(char cc:map.keySet()){
            if(map.get(cc)==1) {
                System.out.println(cc);
                break;
            }

                }
        }

    }

