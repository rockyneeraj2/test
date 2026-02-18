package org.example.Programs;

public class SumOfDigit {

    public static void main(String[] args) {

        int number = 1234;
        int sum = 0;

        while (number > 0) {
            sum += number % 10;   // get last digit
            number = number / 10; // remove last digit
        }

        System.out.println("Sum of digits: " + sum);

    }
}
