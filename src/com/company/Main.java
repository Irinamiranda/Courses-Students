package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create ArrayLists to keep persons and courses
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Biology", "12030", "Anna Soboleva"));
        courses.add(new Course("English", "46537", "Emily Garcia"));
        courses.add(new Course("programming", "64537", "Debora March"));

        while (true) {
            System.out.println("What person do you wish to add? teacher/student/course/list/exit");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("teacher")) {
                teachers.add(addTeacher());

                for (Teacher teacher : teachers) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.geteMail() + " " + teacher.getNumberID() + " teaches " + teacher.getTeaches());
                }


            } else if (answer.equalsIgnoreCase("student")) {
                students.add(addStudent());

                for (Student student : students) {
                    System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.geteMail() + " " + student.getNumberID() + " takes " + student.getTakes());
                }

            } else if (answer.equalsIgnoreCase("course")) {
                courses.add(addCourse());


                for (Course course : courses) {
                    System.out.println(course.getCourseName() + " " + course.getCourseID() + "taught by: " + course.getTaughtBy() + "taken by: " + course.getTakenBy());
                }


            } else if (answer.equalsIgnoreCase("list")) {
                System.out.println("What List do you wish to see? teacher/student/course");
                String myAnswer = scan.nextLine();
                if (myAnswer.equalsIgnoreCase("teacher")) {
                    System.out.println("Teachers List");
                    for (Teacher teacher : teachers) {
                        System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.geteMail() + " " + teacher.getNumberID() + " teaches: "  + teacher.getTeaches());
                    }
                }
                if (myAnswer.equalsIgnoreCase("student")) {
                    System.out.println("Students List");
                    for (Student student : students) {
                        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.geteMail() + " " + student.getNumberID() + " takes " + student.getTakes());
                    }
                }
                if (myAnswer.equalsIgnoreCase("course")) {
                    System.out.println("Course List");
                    for (Course course : courses) {
                        System.out.println(course.getCourseName() + " " + course.getCourseID() + " " + " taught by: " + course.getTaughtBy());
                    }
                }
            } else if (answer.equalsIgnoreCase("exit")) {
                break;
            }

        }


    }
    //create a method to add person

   /* public static Person addPerson() {


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

    }*/
   //create method to add student
   public static Student addStudent() {


       Student newStudent = new Student();

       //create a Scanner object to let user make an input

       Scanner s = new Scanner(System.in);
       System.out.println("Enter the first name");
       String firstname = s.nextLine();
       newStudent.setFirstName(firstname);


       System.out.println("Enter the last name");
       String lastName = s.nextLine();
       newStudent.setLastName(lastName);


       System.out.println("Enter your email");
       String yourEmail = s.nextLine();
       newStudent.seteMail(yourEmail);


       System.out.println("Enter your ID number");
       String yourID = s.nextLine();
       newStudent.setNumberID(yourID);

       System.out.println("Enter the class that student takes");
       String takes = s.nextLine();
       newStudent.setTakes(takes);


       return newStudent;

   }
   //create a method to add teacher
   public static Teacher addTeacher() {


       Teacher newTeacher = new Teacher();

       //create a Scanner object to let user make an input

       Scanner s = new Scanner(System.in);
       System.out.println("Enter the first name");
       String firstname = s.nextLine();
       newTeacher.setFirstName(firstname);


       System.out.println("Enter the last name");
       String lastName = s.nextLine();
       newTeacher.setLastName(lastName);


       System.out.println("Enter your email");
       String yourEmail = s.nextLine();
       newTeacher.seteMail(yourEmail);


       System.out.println("Enter your ID number");
       String yourID = s.nextLine();
       newTeacher.setNumberID(yourID);

       System.out.println("Enter the class that teacher teaches");
       String teaches = s.nextLine();
       newTeacher.setTeaches(teaches);


       return newTeacher;

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

        System.out.println("Enter the first and last name of teacher");
        String name = scan.nextLine();

        newCourse.setTaughtBy(name);

        System.out.println("Enter the first and last name of student");
        String name2 = scan.nextLine();

        newCourse.setTakenBy(name2);


        return newCourse;

    }
}
