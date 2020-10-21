package com.cybertek.core;

public class SelectionStatements {

    public static void demoIfStatement(){
        String username = "Ozzy";
        if (username.equals("Ozzy")){
            System.out.println("PASS");
        }else if (username.equals("Aigerim")){
            System.out.println("FAIL");
        }else{
            System.out.println("Not valid");
        }

    }

    public static void demoSwitchCaseStatement(){

        String userName = "Mike";
        switch(userName){
            case "Ozzy":
                System.out.println("PASS");
                break;
            case "Mike":
                System.out.println("PASS");
                break;
            default:
                System.out.println("Not valid");
        }

    }
}
