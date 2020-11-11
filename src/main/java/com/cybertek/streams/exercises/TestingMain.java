package com.cybertek.streams.exercises;

import com.cybertek.enums.Status;

public class TestingMain {

    public static void main(String[] args) {

        System.out.println(StreamDemo.getListOfProject().stream().findFirst().get().getProjectName());
        //Human Resource CRM

        //System.out.println(StreamDemo.getListOfProject(Status.OPEN).get(1).getProjectName());

        System.out.println(StreamDemo.getListOfProject(DataGenerator.manager3).get(0).getProjectName()); //Customer Service

        System.out.println(StreamDemo.getProjectByProjectCode("PRJ003").get(0).getProjectName());

        System.out.println(StreamDemo.getUserByFirstName("Isabella").getLastName());

        System.out.println(StreamDemo.deleteUser("Isabella").stream().count());



    }
}
