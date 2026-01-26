package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter_1 {
    public static void main(String[] args) {

        String input = "madam kumar";

        char ch[] = input.toCharArray();

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char character:ch){

            map.put(character,map.getOrDefault(character,0)+1);

        }



        for(char c:map.keySet()){
            System.out.println( c+" "+ map.get(c));
        }

    }
}
