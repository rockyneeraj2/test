package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class VowelConsonsnet_10 {
    public static void main(String[] args) {


        String str = "neeeraj";

        char[] ch = str.toCharArray();

        Map<Character,Integer> map =new HashMap<>();

        for (char c : ch) {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                map.put(c,map.getOrDefault(c,0)+1);
                System.out.println(map.get(c));
            }else {
                map.put(c,map.getOrDefault(c,0)+1);
                System.out.println(map.get(c));
            }

        }


    }
}
