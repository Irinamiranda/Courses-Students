package com.company;

public class Teacher extends Person {
    private String teaches;

    public Teacher() {

    }

    public Teacher(String firstName, String lastName, String email, String numberID, String teaches) {
        super(firstName, lastName, email, numberID);
        this.teaches = teaches;

    }


    public String getTeaches() {
        return teaches;
    }

    public void setTeaches(String teaches) {
        this.teaches = teaches;
    }
}
