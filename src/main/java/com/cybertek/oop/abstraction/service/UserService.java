package com.cybertek.oop.abstraction.service;

import com.cybertek.enums.Gender;
import com.cybertek.oop.abstraction.implementation.UserServiceImplementation;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {

    @Override
    public String userByRoleId (int id){
        User user = new User("mike","smith", new Role(id, "admin"), Gender.MALE);
        return user.getFirstName() + " " + user.getLastName();
    }
    @Override
    public User userByFirstName(String firstName) {
        User user = new User (firstName, "Ally", new Role (1, "manager"), Gender.MALE);
        return user;
    }

}
