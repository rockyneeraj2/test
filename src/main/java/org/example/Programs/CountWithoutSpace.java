package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class CountWithoutSpace {
    public static void main(String[] args) {

        String input ="neeraj kumar";
        char[] charArray = input.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char ch : charArray) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for(char x:map.keySet()){
            System.out.println(x+" "+ map.get(x));
        }

    }
}
