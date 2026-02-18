package org.example.Programs;

public class moveAllZerofirst {

    public static void main(String[] args) {

        String str = "32400121200";
        String zeros = "";
        String others = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                zeros += "0";
            } else {
                others += str.charAt(i);
            }
        }

        String result = zeros + others;

        System.out.println(result);
    }
}
