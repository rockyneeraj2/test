package org.example.Programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveWordUsingSet {
    public static void main(String[] args) {
        // input: i am rahul rahul
        //output: i am rahul

        String input = "i am rahul rahul";
        String [] str1 =input.split(" ");

        Set<String> set = new LinkedHashSet<String>();
        for(String x : str1){
            set.add(x);
        }
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
