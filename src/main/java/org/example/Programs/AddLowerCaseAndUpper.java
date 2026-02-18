package org.example.Programs;

import java.util.HashSet;
import java.util.Set;

public class AddLowerCaseAndUpper {

    public static void main(String[] args) {


                String str = "aBACbcEDed";

                Set<Character> lowerSet = new HashSet<>();
                Set<Character> upperSet = new HashSet<>();

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if (Character.isLetter(ch)) {
                        lowerSet.add(Character.toLowerCase(ch));
                        upperSet.add(Character.toUpperCase(ch));
                    }
                }

                String lowerResult = "";
                String upperResult = "";

                for (char ch : lowerSet) {
                    lowerResult += ch;
                }

                for (char ch : upperSet) {
                    upperResult += ch;
                }

                System.out.println(lowerResult);
                System.out.println(upperResult);
            }
        }

