package org.example.Programs;

public class ArmStrong_Numbers {

    public static void main(String[] args) {

        int number = 153;   // Change this value to test
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number");
        }

    }
}
