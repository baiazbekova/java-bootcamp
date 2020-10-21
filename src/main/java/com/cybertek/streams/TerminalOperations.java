package com.cybertek.streams;

import com.cybertek.collections.ArrayLists;
import com.cybertek.oop.encapsulation.Role;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {

        System.out.println("*************COUNT*************");
        long count = Arrays.asList(1,2,3,4,5).stream().count();
        System.out.println(count); //5

        long count2 = Arrays.asList("Apples", "Orange", "Kiwi", "Cherry", "Mango", "Ant").stream().filter(str -> str.equals("Apples")).count();
        System.out.println(count2); //1


        System.out.println("*************FIND FIRST - FIND ANY*************");
        Role r = ArrayLists.createRoleList().stream().filter(role -> role.getDescription().equals("Employee")).findFirst().get();
        System.out.println(r.getId()); //4

        Role r2 = ArrayLists.createRoleList().stream().filter(role -> role.getDescription().equals("Employee")).findAny().get();
        System.out.println(r2.getId());//4


        System.out.println("*************COLLECT*************"); //convert stream to list
        List<String> appleList = Arrays.asList("Apples", "Orange", "Kiwi", "Cherry", "Mango", "Ant")
                .stream().filter(s -> s.equals ("Apples")).collect(Collectors.toList());
        System.out.println(appleList.stream().count()); //1


        System.out.println("*************REDUCE*************");  //convert stream to integer/string
        int total = Arrays.asList(3,4,5,6,7).stream().reduce(5,(x,y) -> x+y);
        System.out.println(total); //30

        String word = Arrays.asList("A", "B", "C", "D", "K", "F").stream().reduce("", (a,b) -> a+b);
        System.out.println(word); //ABCDKF






    }

}
