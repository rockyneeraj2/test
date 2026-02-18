package org.example.Programs;

public class ReveseWords {
    public static void main(String[] args) {


                String str = "Java is easy";
                String[] words = str.split(" ");
                String rev ="";

                for (int i = words.length - 1; i >= 0; i--) {
                    rev+= words[i];

                    if(i!=0){
                        rev+= " ";
                    }

                }

                System.out.println(rev);
        //System.out.println(rev.trim();
            }
        }







