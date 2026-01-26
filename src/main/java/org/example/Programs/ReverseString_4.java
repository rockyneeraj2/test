package org.example.Programs;

public class ReverseString_4 {
    public static void main(String[] args) {

        String str = "Neeraj";
        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);

        }
        System.out.println(rev);
    }
}
