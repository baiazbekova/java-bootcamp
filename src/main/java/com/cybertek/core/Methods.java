package com.cybertek.core;

import static java.lang.System.out;

public class Methods {

    public void methodA(){
        out.println("methodA() is called");
    }

    public void methodC(){
        out.println("methodA(String str) is called");
    }

    public String methodB(){
        return "methodB()is called";
    }

    public String methodB(int x){
        return "methodB(int x) is called";
    }

    public static void methodc(){
        out.println("methodC() is called");
    }
}
