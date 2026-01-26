package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class CountOnlyCapitalLetter {

    public static void main(String[] args) {

        String input ="NeerajAAAEEE";
        char [] charArray = input.toCharArray();

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char chara : charArray) {
            if (chara >= 'A' && chara <= 'Z') {
                map.put(chara, map.getOrDefault(chara, 0) + 1);
            }
        }

        for(char c : map.keySet()){
            System.out.println(c +" "+ map.get(c));
        }
    }

}
