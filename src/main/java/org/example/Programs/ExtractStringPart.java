package org.example.Programs;

public class ExtractStringPart {
    public static void main(String[] args) {
        String str = "www.erostrum.com";
        //www -- first 4 character
        //.com --last4
        //erostrum

        String firstFourChar = str.substring(0, 4); // endIndex is exclusive
        System.out.println(firstFourChar);

        String lastFourChar = str.substring(str.length()-4,str.length());
        System.out.println(lastFourChar);

        String website = str.substring(4,str.length()-4);
        System.out.println(website);
    }
}
