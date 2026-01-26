package org.example.Programs;

import java.util.HashMap;
import java.util.Map;


public class CountSplChar {
    public static void main(String[] args) {

        //(!Character.isLetterOrDigit(ch))

        String input = "abc#$^@@";
        char [] charArray =input.toCharArray();

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char x:charArray){
          if(!(x>='a' && x<='z') &&
                  !(x>='A' && x<='Z') &&
                  !(x>='0' && x<='9')){
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }

        System.out.println(map);

    }
}