package com.ironhack.ironschool.clases;

import java.util.UUID;

public class Student {

    private final String studentId;
    private String name;

    private String address;

    private String email;

    private Course course;

    public Student(String name, String address, String email) {
        this.studentId = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.email = email;
    }

    // Constructor utilizado en Tests
    public Student(String studentId, String name, String address, String email, Course course) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", course=" + course +
                '}';
    }
}
