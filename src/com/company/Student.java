package com.company;

public class Student extends Person {

    private Course takes;

    public Student(){

    }

    public Student(String firstName, String lastName, String eMail, String numberID, Course takes){
        super(firstName, lastName, eMail, numberID);
        this.takes = takes;
    }

    public Course getTakes() {
        return takes;
    }

    public void setTakes(Course takes) {
        this.takes = takes;
    }
}
