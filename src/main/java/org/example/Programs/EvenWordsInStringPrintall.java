package org.example.Programs;

public class EvenWordsInStringPrintall {

    public static void main(String[] args) {

        String str = "sky is blue and vast";

        String[] st1 = str.split(" ");

       for(String word:st1){
           if(word.length()%2==0){
               System.out.println("even " +word);
           }
           else {
               System.out.println("odd " +word);
           }

    }

}
}
