package org.example.Programs;

public class ReveseWords {
    public static void main(String[] args) {


                String str = "Java is easy";
                String[] words = str.split(" ");

                for (int i = words.length - 1; i >= 0; i--) {
                    System.out.print(words[i] + " ");
                }
            }
        }







