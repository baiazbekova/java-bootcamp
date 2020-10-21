package com.cybertek.streams;

import com.cybertek.collections.ArrayLists;
import com.cybertek.oop.encapsulation.Role;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {
        //Creating stream from an array

        String[] courses = {"Java", "JS", "TypeScript", "Python"};
        Stream<String> courseStream = Arrays.stream(courses);


        //creating stream from Collection
        Stream<Role> roleStream = ArrayLists.createRoleList().stream();

        //creating stream from specified values
        Stream<Integer> stream = Stream.of(1,2,3,45,6);



    }

}
