package com.cybertek.oop.abstraction.implementation;

import com.cybertek.oop.encapsulation.User;

public interface UserServiceImplementation {

    //method in string format
    String userByRoleId (int id);
    User userByFirstName(String firstName); //will give all user object (firstname, lastname, role)

}
