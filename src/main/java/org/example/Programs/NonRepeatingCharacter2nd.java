package org.example.Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter2nd {

    public static void main(String[] args) {
        String str = "swiss"; // Example string

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Count occurrences of each character
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find the second non-repeated character
        int count = 0;
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                count++;
                if (count == 2) {
                    System.out.println("Second non-repeated character: " + c);
                    return;
                }
            }
        }

        System.out.println("No second non-repeated character found.");
    }
}

