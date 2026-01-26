package org.example.Programs;

public class L_SecondLargestNoArray {

    public static void main(String[] args) {

        int [] arr = {1,3,8,5,2,1,6};

        int largestNO = Integer.MIN_VALUE;
        int secondLargestNo = Integer.MIN_VALUE;

        for(int number :arr){
            if(number>largestNO){
                secondLargestNo =largestNO;
                largestNO = number;
            }
            else if(number>secondLargestNo && number!=largestNO){
                secondLargestNo=number;
            }
        }

        System.out.println(secondLargestNo);


    }
}
