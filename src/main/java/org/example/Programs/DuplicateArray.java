package org.example.Programs;

import java.util.*;

public class DuplicateArray {
    public static void main(String[] args) {

        int[] Arr = {1, 2, 3, 2, 1};
        //DuplicateArray.findDuplicateUsingBruteForce(Arr);
        //DuplicateArray.findDuplicateUsingSorting(Arr);
        //DuplicateArray.findDuplicateUsingSet(Arr);
        DuplicateArray.findDuplicateUsingHashmap(Arr);

        //Brute force method:
    }

    public static void findDuplicateUsingBruteForce(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j <= arr.length-1; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println("duplicate elemt " + arr[i]);

                }
            }
        }
    }

    // using sorting method:
    // 1,2,3,2,1
    //1,1,2,2,3

    public  static void findDuplicateUsingSorting(int [] arr){
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]==arr[i+1]){
                System.out.println("duplicate elem " +arr[i]);
            }

        }
    }

    public static void findDuplicateUsingSet(int[] arr){

        Set<Integer> hs = new HashSet<Integer>();

        for(int x : arr){
            if(!hs.add(x)){
                System.out.println("duplicate " +x);
            }


        }

    }

    //using hashMap:
    public static void findDuplicateUsingHashmap(int[]arr){


        Map<Integer,Integer> map = new HashMap<>();

        for(Integer st :arr){

            map.put(st,map.getOrDefault(st,0)+1);
        }

        for(Integer ee:map.keySet()){
            if(map.get(ee)>1)
            System.out.println(ee+"--"+map.get(ee));
        }

        /*

        class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int [] arr = {1,2,3,42,3,1,2};

	   Map<Integer,Integer> map = new HashMap<Integer,Integer>();

	   for(Integer i : arr){
	       map.put(i,map.getOrDefault(i,0)+1);
	   }

	   for(Integer c: map.keySet()){
	       if(map.get(c)>1)
	       System.out.println(c +" --" + map.get(c) );
	   }
	}

}

         */



    }
}
