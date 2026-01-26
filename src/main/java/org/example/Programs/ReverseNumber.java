package org.example.Programs;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 123;
        int lastDigit;
        int reverse =0;

        while(number!=0){
            lastDigit = number%10;
            reverse = reverse*10+lastDigit;
            number=number/10;
        }

        System.out.println(reverse);

    }
}

