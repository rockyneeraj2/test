package org.example.Programs;

public class EvenIndexCharacter {

    public static void main(String[] args) {

        String str = "Automation";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
