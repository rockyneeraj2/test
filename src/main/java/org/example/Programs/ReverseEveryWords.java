package org.example.Programs;

public class ReverseEveryWords {
    public static void main(String[] args) {
        String str = "how are you";
        //woh era uoy

        String result = "";

        String[] arr = str.split(" ");
        for (String word : arr) {

            String reverseWord ="";
            int j = word.length()-1;

            while (j >= 0) {
                char ch = word.charAt(j);
                reverseWord = reverseWord+ch;
                j--;
            }
            result = result + reverseWord +" ";
        }
        System.out.println(result);

    }
}
