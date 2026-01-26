package org.example.Programs;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String str = "java selenium java interview";

        String [] stArray = str.split(" ");

        Map<String,Integer> map = new HashMap<String,Integer>();

        for(String st :stArray){
            map.put(st,map.getOrDefault(st,0)+1);
        }

        for(String s:map.keySet()){
            System.out.println(s +" "+map.get(s));
        }


    }
}
