package com.company;

public class Teacher extends Person {

    public Teacher() {

    }

    public Teacher(String firstName, String lastName, String email, String numberID) {
        super(firstName, lastName, email, numberID);

    }

    @Override
    public String toString() {
        return "First name " + getFirstName() + " Last name " + getLastName();
    }
}
