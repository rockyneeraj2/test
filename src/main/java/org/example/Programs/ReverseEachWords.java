package org.example.Programs;

public class ReverseEachWords {

    public static void main(String[] args) {

        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String reversed = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }

            result += reversed + " ";
        }

        System.out.println(result.trim());

    }
}
