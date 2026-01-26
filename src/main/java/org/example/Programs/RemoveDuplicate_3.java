package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate_3 {
    public static void main(String[] args) {

        String str = "java";

        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 1;

        for (int i = 0; i < ch.length; i++) {
            if (!map.containsKey(ch[i])) {
                map.put(ch[i], count);
            } else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        }

        //print duplicate characters
        for (Character key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println("Duplicate Character: " + key + ", Count: " + map.get(key));
            }
        }
    }
}
