package com.company;

public class Student extends Person {



    public Student(){

    }

    public Student(String firstName, String lastName, String eMail, String numberID){
        super(firstName, lastName, eMail, numberID);

    }

    @Override
    public String toString() {
        return "First name " + getFirstName() + " Last name " + getLastName();
    }



}
