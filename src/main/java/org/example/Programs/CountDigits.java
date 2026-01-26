package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class CountDigits {
    public static void main(String[] args) {
        String input = "Automation12121";
        char[] charArray = input.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char character : charArray) {
            if (character >= '0' && character <= '9') {
                map.put(character, map.getOrDefault(character, 0) + 1);
            }
        }


        for (char c : map.keySet()) {
            //  if(map.get(c)==1)
            System.out.println(c + " " + map.get(c));
        }
    }
}


