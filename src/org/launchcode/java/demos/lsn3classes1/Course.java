package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private int number;
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(int number, String name){
        this.number = number;
        this.name = name;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
    public ArrayList<Student> getStudents(){
        return this.students;
    }

}
