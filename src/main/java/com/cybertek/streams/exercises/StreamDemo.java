package com.cybertek.streams.exercises;

import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.Project;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

    //Task 1
    public static List<Project> getListOfProject(){
        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects;
    }

    //Task 2
    public static List<Project> getListOfProject(Status status){
        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(st -> st.getProjectStatus().equals(status)).collect(Collectors.toList());

    }


    //Task 3
    public static List<Project> getListOfProject(User manager){

        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(man -> man.getAssignedManager().equals(manager)).collect(Collectors.toList());

    }

     //Task 4
    public static List<Project>getProjectByProjectCode(String projectCode){

        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(code -> code.getProjectCode().equals(projectCode)).collect(Collectors.toList());

    }

     //Task 5
    public static List<User> getListUsers(){

        List<User> listOfUsers = DataGenerator.getUsers();
        return listOfUsers;

    }


     //Task 6
    public static User getUserByFirstName(String firstName){
        List<User> listOfUsers = DataGenerator.getUsers();
        return listOfUsers.stream().filter(fn -> fn.getFirstName().equals(firstName)).findFirst().get();
    }


     //Task 7
   // public static String getUserByUserId(Long id){
      //  List<User> listOfUsers = DataGenerator.getUsers();
        //return listOfUsers.stream().filter(fn -> fn.getId().equals(id)).findFirst().get();

    //}



     //Task 8
    public static List<User> deleteUser(String firstName){
        List<User> listOfUsers = DataGenerator.getUsers();
        return listOfUsers.stream().filter(fn -> fn.getFirstName().equals(firstName)).collect(Collectors.toList());


    }




     /*Task 9
    public static List<Project> updateProjectStatus(Status oldStatus, Status newStatus){

    }
     */

     /*Task 10
    public static List<Project> findProjectByManager(User manager){

    }
     */


     /*Task 11
    public static Integer totalProjectDurationForManager (User manager){

    }
     */


     /*Task 12
    public static long findTotalMaleInCompany (){

    }
     */
}
