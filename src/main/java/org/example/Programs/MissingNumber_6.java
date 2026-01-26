package org.example.Programs;

public class MissingNumber_6 {
    public static void main(String[] args) {

        int [] num = {1,2,3,5,6};

        int n =6;

        int sum =0;

        int expected = (n*(n+1)/2);

        for(int i=0;i<num.length;i++){
            sum = sum + num[i];

        }
        System.out.println("missing no "+ (expected-sum));


    }


}
