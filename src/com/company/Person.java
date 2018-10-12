package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private String eMail;
    private String numberID;

    public Person() {

    }

    public Person(String firstName, String lastName, String eMail, String numberID){

        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.numberID = numberID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }
}
