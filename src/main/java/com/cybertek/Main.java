package com.cybertek;

import com.cybertek.core.Loops;
import com.cybertek.core.Methods;
import com.cybertek.core.SelectionStatements;
import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oop.abstraction.implementation.UserServiceImplementation;
import com.cybertek.oop.abstraction.service.UserService;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.inheritance.BaseEntity;
import com.cybertek.oop.inheritance.Project;
import com.cybertek.oop.polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main (String[] args) {
        //****CORE****//
        Methods methods = new Methods();
        methods.methodA();
        methods.methodB();
        methods.methodB();
        methods.methodC();
        Methods.methodc();

        Loops.demoForEach();
        Loops.demoForIterator();

        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();


        //***OOP-Encapsulation***//
        User user = new User("Aigerim", "Baiazbekova", new Role(123, "Manager"), Gender.MALE);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());

        //***OOP-Inheritance***//

        //Project Object
        Project project = new Project(12345678, LocalDateTime.now(), 100, LocalDateTime.now(), 101, "ACN100",
                "Accenture-Avengers", new User("Aigerim", "Baiazbekova",new Role(123, "Manager"), Gender.MALE),
                LocalDate.now(), LocalDate.now().plusDays(7), Status.IN_PROGRESS, "Comcast-XA");

        System.out.println(project.getProjectCode());
        System.out.println(project.getEndDate());
        System.out.println(project.getStartDate());



        //OOP-Interface//
        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("mike").getLastName());


        //OOP-Polymorphism//
        Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplementation userServiceImplementation = new UserService();

        employee.getEmployeeHours();

        ((Employee)employee2).getEmployeeHours(); //down casting


        //ENUMS//
        System.out.println(Gender.FEMALE);
        System.out.println(Status.IN_PROGRESS.getValue().substring(2));
    }



}

