package org.example.Programs;

import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {
        String str = "java java python python java";

        String [] st1 =str.split(" ");

        Map<String,Integer> map = new HashMap<>();

        for(String st :st1){
            map.put(st,map.getOrDefault(st,0)+1);
        }

        for(String s:map.keySet()){
            if(map.get(s)>1)
            System.out.println(s+" "+map.get(s));
}

    }
}
