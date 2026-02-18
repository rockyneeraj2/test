package org.example.Programs;

import java.util.HashMap;

public class DuplicateCheckTrueFalseMethod {

    public static boolean checkDuplicate(int[] arr, int value) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check frequency of given value
        if (map.get(value) > 1) {
            return false;   // duplicate
        } else {
            return true;    // not duplicate
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2};

        System.out.println(checkDuplicate(numbers, 3)); // true
        System.out.println(checkDuplicate(numbers, 2)); // false
    }
}
