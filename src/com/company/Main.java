package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create ArrayLists to keep persons and courses
        ArrayList<Person> teachers = new ArrayList<>();
        ArrayList<Person> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        while (true) {
            System.out.println("What person do you wish to add? teacher/student/course/list/exit");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("teacher")) {
                teachers.add(addPerson());

                for (Person teacher : teachers) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.geteMail() + " " + teacher.getNumberID());
                }


            } else if (answer.equalsIgnoreCase("student")) {
                students.add(addPerson());

                for (Person student : students) {
                    System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.geteMail() + " " + student.getNumberID());
                }

            } else if (answer.equalsIgnoreCase("course")) {
                courses.add(addCourse());


                for (Course course : courses) {
                    System.out.println(course.getCourseName() + " " + course.getCourseID());
                }


            } else if (answer.equalsIgnoreCase("list")) {
                System.out.println("What List do you wish to see? teacher/student/course");
                String myAnswer = scan.nextLine();
                if (myAnswer.equalsIgnoreCase("teacher")) {
                    System.out.println("Teachers List");
                    for (Person teacher : teachers) {
                        System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.geteMail() + " " + teacher.getNumberID());
                    }
                }
                if (myAnswer.equalsIgnoreCase("student")) {
                    System.out.println("Students List");
                    for (Person student : students) {
                        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.geteMail() + " " + student.getNumberID());
                    }
                }
                if (myAnswer.equalsIgnoreCase("course")) {
                    System.out.println("Course List");
                    for (Course course : courses) {
                        System.out.println(course.getCourseName() + " " + course.getCourseID());
                    }
                } else {
                    System.out.println("Try again!");
                }
            } else if (answer.equalsIgnoreCase("exit")) {
                break;
            }

        }


    }
    //create a method to add person

    public static Person addPerson() {


        Person newPerson = new Person();

        //create a Scanner object to let user make an input

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstname = s.nextLine();
        newPerson.setFirstName(firstname);


        System.out.println("Enter the last name");
        String lastName = s.nextLine();
        newPerson.setLastName(lastName);


        System.out.println("Enter your email");
        String yourEmail = s.nextLine();
        newPerson.seteMail(yourEmail);


        System.out.println("Enter your ID number");
        String yourID = s.nextLine();
        newPerson.setNumberID(yourID);


        return newPerson;

    }

    //create method to add course
    public static Course addCourse() {

        Course newCourse = new Course();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of course");
        String courseName = scan.nextLine();
        newCourse.setCourseName(courseName);

        System.out.println("Enter course ID number");
        String numberID = scan.nextLine();
        newCourse.setCourseID(numberID);

        return newCourse;

    }
}
