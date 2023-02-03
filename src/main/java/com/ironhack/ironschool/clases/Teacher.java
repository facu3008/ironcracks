package com.ironhack.ironschool.clases;

import java.math.BigDecimal;
import java.util.UUID;

public class Teacher {
    private String teacherId;
    private String name;
    private BigDecimal salary;

    public Teacher(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
        this.teacherId = UUID.randomUUID().toString();
    }

    // Constructor utilizado para Tests


    public Teacher(String teacherId, String name, BigDecimal salary) {
        this.teacherId = teacherId;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    //    Teacher class
//
//    This class will have:
//
//    Variable called teacherId of data type string, auto-generated (Private member)
//    Variable called name of data type string (Private member)
//    Variable called salary of data type double, representing the salary of the teacher (Private member)
//    A parameterized constructor that takes name and salary
//    Public Getter functions to access these variables
//    Public Setter functions to change these variables

//    Optional attributes are accepted if needed based on the code structure
}
