package org.example.Programs;

public class SeparateAlphabetDigit {

    public static void main(String[] args) {

                String str = "Subbu123raj";
                String letters = "";
                String numbers = "";

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if (Character.isDigit(ch)) {
                        numbers += ch;
                    } else {
                        letters += ch;
                    }
                }

                System.out.println(letters);
                System.out.println(numbers);
            }
        }


