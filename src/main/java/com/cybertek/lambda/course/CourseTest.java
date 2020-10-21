package com.cybertek.lambda.course;

public class CourseTest {

    public static void main(String[] args) {
        Course java = new Java();
        java.study();

        Course selenium = new Selenium();
        selenium.study();

        //different structure
        Course java2 = new Course(){
            @Override
            public void study() {
                System.out.println("Studying Java");
            }
        };
        java2.study();


        //***Lambda expressions***//
        Course javaCourse = () -> System.out.println("Studying Java");
        javaCourse.study();

        Course seleniumCourse = () -> System.out.println("Studying Selenium");
        seleniumCourse.study();
    }
}
