package org.example.Programs;

public class SwapUsingEXOR_bitwise {

    public static void main(String[] args) {

        // using EX-OR operator
        // 1 1 =0, 0 0 =0 , 1 0 =1, 0-1=1

        int a=10;
        int b=20;

        System.out.println("before swap: a "+ a);
        System.out.println("before swap: b "+ b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("after swap: a "+ a);
        System.out.println("after swap: b "+ b);
    }
}
