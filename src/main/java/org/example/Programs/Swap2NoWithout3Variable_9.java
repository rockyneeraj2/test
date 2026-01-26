package org.example.Programs;

public class Swap2NoWithout3Variable_9 {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println("before swap: a "+ a);
        System.out.println("before swap: b "+ b);

        a = a+b;//30
        b= a-b; //10
        a=a-b;//20

        System.out.println("after swap: a "+ a);
        System.out.println("after swap: b "+ b);

    }
}
