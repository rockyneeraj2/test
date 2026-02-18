package org.example.Programs;

public class CountReplaceDollar {

    public static void main(String[] args) {


        String word = "tomorrow";
        String vowels = "aeiou";
        int count = 0;
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (vowels.contains(String.valueOf(ch))) {
                count++;

                for (int j = 0; j < count; j++) {
                    result += "$";
                }
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }
}



