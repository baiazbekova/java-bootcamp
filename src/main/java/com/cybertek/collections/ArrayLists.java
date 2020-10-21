package com.cybertek.collections;

import com.cybertek.enums.Gender;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void createList(){
        List<Integer> list = new ArrayList<>();
        list.add(5); list.add(10); list.add(20);
        for(Integer l:list){
            System.out.println(l);
        }
    }

    public static void createUserList(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike", "Smith", new Role(1, "ManagerAssistant"), Gender.MALE));
        userList.add(new User("Aigerim", "Baiazbekova", new Role (2, "QA Eng"), Gender.FEMALE));

        for (User u: userList){
            System.out.println(u.getRole().getDescription());
        }

    }

    public static List<Role> createRoleList(){
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role (1, "manager"));
        roleList.add(new Role (2, "qa"));
        roleList.add(new Role (3, "dev"));
        roleList.add(new Role (4, "Employee"));
        roleList.add(new Role (5, "Employee"));

        return roleList;

    }
}
