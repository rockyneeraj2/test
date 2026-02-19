package org.example.Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingLast {

    public static void main(String[] args) {



                String str = "swiss"; // Example string

                Map<Character, Integer> map = new LinkedHashMap<>();

                // Step 1: Count occurrences of each character
                for (char c : str.toCharArray()) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }

                // Step 2: Find the last non-repeated character
                char lastNonRepeated = '\0';
                for (char c : map.keySet()) {
                    if (map.get(c) == 1) {
                        lastNonRepeated = c; // keep updating, last one will remain
                    }
                }

                if (lastNonRepeated != '\0') {
                    System.out.println("Last non-repeated character: " + lastNonRepeated);
                } else {
                    System.out.println("No non-repeated character found.");
                }
            }
        }


