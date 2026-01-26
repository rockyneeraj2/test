package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class RemoveWords {
    public static void main(String[] args) {
        String str = "java hello python java code hello";

        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        int count = 1;

        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], count);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }

        //print duplicate characters
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println("Duplicate Character: " + key + ", Count: " + map.get(key));
            }
        }
    }
}
