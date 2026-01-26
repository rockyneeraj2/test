package org.example.Programs;

public class ReplaceVowelWithX {

    public static void main(String[] args) {

        String input = "hello";

        char ch [] =input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(char x :ch){
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                sb.append('X');
            }
            else {
                sb.append(x);
            }
        }
        System.out.println(sb.toString());
    }
}
