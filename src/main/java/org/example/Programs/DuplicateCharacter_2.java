package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter_2 {

    public static void main(String[] args) {
        String str = "java kumar";
        char [] charArray =str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char ch:charArray){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char c:map.keySet()){
            if(map.get(c)>1)
            System.out.println(c+""+map.get(c));
        }
    }
}
