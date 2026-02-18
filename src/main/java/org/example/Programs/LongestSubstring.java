package org.example.Programs;

import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {

        String str = "abcabcbb";

        int left = 0;
        int maxLength = 0;
        String longest = "";

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longest = str.substring(left, right + 1);
            }
        }

        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + maxLength);
    }
}
