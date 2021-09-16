package com.example.test;

public class Daro {
    private String tutor_name = "Asahel";
    private int no_of_students=63;

    public Daro(String tName, int nS){
        this.tutor_name = tName;
        this.no_of_students = nS;
    }

    public Daro(){

    }

    public int getNo_of_students() {
        return no_of_students;
    }


    public String getTutor_name() {
        return tutor_name;
    }

    public void setNo_of_students(int no_of_students) {
        this.no_of_students = no_of_students;
    }

    public void setTutor_name(String tutor_name) {
        this.tutor_name = tutor_name;
    }
}
