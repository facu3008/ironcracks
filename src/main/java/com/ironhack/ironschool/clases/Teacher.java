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
}
