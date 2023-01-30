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

    //    Variable called studentId of data type string, auto-generated (Private member)
//    Variable called name of data type string (Private member)
//    Variable called address of data type string (Private member)
//    Variable called email of data type string (Private member)

//    Nullable variable called course of data type Course, representing the course this student is enrolled into (Private member)
//    A parameterized constructor that takes name, address and email
//    Public Getter functions to access these variables
//    Public Setter functions to change these variables


//    Optional attributes are accepted if needed based on the code structure
}
