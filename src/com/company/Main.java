package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create ArrayLists to keep persons and courses
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", "12030"));
        courses.add(new Course("English", "46537"));
        courses.add(new Course("Programming", "64537"));

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Albert", "Einstein", "ae@gmail.com", "1"));
        teachers.add(new Teacher("Nikola", "Tesla", "nt@gmail.com", "2"));
        teachers.add(new Teacher("Ada", "Lovelace", "al@gmail.com", "3"));
        teachers.add(new Teacher("Charles", "Babbage", "cb@gmail.com", "4"));

        courses.get(0).getTaughtBy().add(teachers.get(1));
        courses.get(0).getTaughtBy().add(teachers.get(2));
        courses.get(1).getTaughtBy().add(teachers.get(0));
        courses.get(1).getTaughtBy().add(teachers.get(1));
        courses.get(2).getTaughtBy().add(teachers.get(2));



        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Irina", "Smirnova", "is@gmail.com", "245"));
        students.add(new Student("Andrey", "Smirnov", "as@gmail.com", "249"));
        students.add(new Student("Galina", "Kutarina", "gk@gmail.com", "246"));

        courses.get(0).getTakenBy().add(students.get(1));
        courses.get(0).getTakenBy().add(students.get(2));
        courses.get(1).getTakenBy().add(students.get(1));
        courses.get(2).getTakenBy().add(students.get(0));


        listCourses(courses);
     //   listTeachers(teachers);
//        listStudents(students);



    }

    public static void listStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("==============");
            System.out.println("student " + student.getFirstName() + " " + student.getLastName());
            System.out.println("id   : " + student.getNumberID());
            System.out.println("email: " + student.geteMail());
          //  System.out.println("takes: " + student.getTakes());
        }
    }
    public static void listTeachers(ArrayList<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println("==============");
            System.out.println("teacher " + teacher.getFirstName() + " " + teacher.getLastName());
            System.out.println("id   : " + teacher.getNumberID());
            System.out.println("email: " + teacher.geteMail());
//            System.out.println("teaches: " + teacher.getTeaches());
        }
    }

    public static void listCourses(ArrayList<Course> courses) {
        for (Course course : courses) {
            System.out.println("==============");
            System.out.println(course);

            System.out.println("Taught by: " + course.getTaughtBy());
            System.out.println("Taken by : " + course.getTakenBy());
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
//       newStudent.setTakes(takes);


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
//       newTeacher.setTeaches(teaches);


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

//        newCourse.setTaughtBy(name);

        System.out.println("Enter the first and last name of student");
        String name2 = scan.nextLine();

//        newCourse.setTakenBy(name2);


        return newCourse;

    }
}
