package org.example.Programs;

public class FindLengthOfLastWordString {

    public static void main(String[] args) {

       String str = "hello world   moon ";
       System.out.println(str);


       char ch [] = str.toCharArray();
       int count =0;

       for(int i=ch.length-1;i>=0;i--){
           if(ch[i]!=' '){
               count = count+1;
           }
           else if (count>0){
               System.out.println(count);
               break;
           }
       }
    }


}
