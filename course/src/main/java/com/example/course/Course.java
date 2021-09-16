package com.example.course;

public class Course {
    private String course_name;

    //Private default constructor
    private Course(){

    }

    //Public parametrised constructor
    public Course(String course_name) {
        this.course_name = course_name;
    }

    //Class variable
    public static String department;

    //public getter
    public String getCourse_name() {
        return course_name;
    }

    //public setter
    public void setCourse_name(String course_name){
        this.course_name = course_name;
    }
}
