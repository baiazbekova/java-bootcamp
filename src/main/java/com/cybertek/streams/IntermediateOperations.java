package com.cybertek.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {

        Integer[] numbersArray = {1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> numbersStream = Arrays.stream(numbersArray);


        System.out.println("**************FILTER*************");

        //filter
        System.out.println( numbersStream.filter(number -> number%2 !=0).count()); //5

        Stream<String> strStream = Arrays.asList("Apples", "Orange", "Kiwi", "Cherry", "Mango", "Ant").stream();

        //System.out.println( strStream.filter(str -> str.length()==5).count()); //1

        System.out.println(strStream.filter(str -> str.startsWith("A")).count()); //2

        Arrays.asList("Apples", "Orange", "Kiwi", "Cherry", "Mango", "Ant").stream()
                .filter(str -> str.equals(("A"))).forEach(str -> System.out.println(str));


        System.out.println("**********MAP*******************");
        Arrays.asList("Apples", "Orange", "Kiwi", "Cherry", "Mango", "Ant").stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
        //APPLES
        //ORANGE
        //KIWI
        //CHERRY
        //MANGO
        //ANT

        System.out.println("**********DISTINCT*******************");
        Arrays.asList("Apples", "Orange", "Kiwi", "Cherry", "Mango", "Ant").stream().distinct().forEach(str -> System.out.println(str));
        //Apples
        //Orange
        //Kiwi
        //Cherry
        //Mango
        //Ant

        System.out.println("**********SORTED ORDER*******************");
        Arrays.asList(1,2,3,4,5,6,7,8).stream().sorted().forEach(numbers -> System.out.println(numbers));
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8


    }
}