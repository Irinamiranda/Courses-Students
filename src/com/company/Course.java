package com.company;

public class Course {
    private String courseName;
    private String courseID;
    private String taughtBy;


    public String getTaughtBy() {
        return taughtBy;
    }

    public void setTaughtBy(String taughtBy) {
        this.taughtBy = taughtBy;
    }

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

    }
    public Course(String courseName, String courseID,  String taughtBy){
        this.courseName = courseName;
        this.courseID = courseID;
        this.taughtBy = taughtBy;

    }



}
