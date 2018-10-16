package com.company;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseID;

    public ArrayList<Student> getTakenBy() {
        return takenBy;
    }

    private ArrayList<Student> takenBy;

    public ArrayList<Teacher> getTaughtBy() {
        return taughtBy;
    }

    private ArrayList<Teacher> taughtBy;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public Course(){
        this.takenBy = new ArrayList<>();
        this.taughtBy = new ArrayList<>();

    }
    public Course(String courseName, String courseID){
        this.courseName = courseName;
        this.courseID = courseID;
        this.takenBy = new ArrayList<>();
        this.taughtBy = new ArrayList<>();


    }

    @Override
    public String toString() {
        return "course id:" + getCourseID() + ", name:" + getCourseName();
    }
}
