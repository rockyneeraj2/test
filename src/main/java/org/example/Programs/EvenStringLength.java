package org.example.Programs;

public class EvenStringLength {
    public static void main(String[] args) {
        String str = "java";
        int length = str.length();

        if(length%2==0){
            System.out.println("even length od sting");
        }
        else {
            System.out.println("odd length");
        }
    }
}
