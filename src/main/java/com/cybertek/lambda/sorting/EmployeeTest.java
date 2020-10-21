package com.cybertek.lambda.sorting;

import com.cybertek.oop.encapsulation.Role;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Mike", "Smith", "DC",
                new Role(1, "Developer"));
        Employee e2 = new Employee(102, "Amy", "Smith", "DC",
                new Role(2, "SDET"));
        Employee e3 = new Employee(103, "Adam", "Smith", "Boston",
                new Role(3, "BA"));
        Employee e4 = new Employee(104, "Jim", "Smith", "Chicago",
                new Role(4, "PM"));
        Employee e5 = new Employee(105, "Chris", "Smith", "DC",
                new Role(5, "Scrum Master"));

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println(employeeList);

        employeeList.sort((emp1, emp2) -> emp1.getEmployeeId().compareTo(emp2.getEmployeeId()));
        employeeList.sort((em1, em2) -> em2.getRole().getId().compareTo(em1.getRole().getId()));
        System.out.println(employeeList);

    }
}
