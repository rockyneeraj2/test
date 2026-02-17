package org.example.CoreJava;

public class Methods {

    public static void main(String[] args) {

        Methods m =new Methods();
        m.doLogin();
        staticLogin();
    }

    public void doLogin(){

        //login code:
    }

    public boolean doLogin1(){

        return true;
    }

    public String  doLogin2(){
        doLogin();

        return "neeraj";
    }

    public char  doLogin3(){

        return 'c';
    }

    public static void staticLogin(){

    }
}
