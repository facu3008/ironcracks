package com.ironhack.ironschool.clases;

import java.math.BigDecimal;
import java.util.UUID;

public class Course {

    private String courseId;
    private String name;
    private BigDecimal price;
    private BigDecimal money_earned;
    private Teacher teacher;

    public Course(String name, BigDecimal price) {
        this.courseId = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.money_earned = new BigDecimal(0);
    }

    // Constructor para Tests
    public Course(String courseId, String name, BigDecimal price, BigDecimal money_earned, Teacher teacher) {
        this.courseId = courseId;
        this.name = name;
        this.price = price;
        this.money_earned = money_earned;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public BigDecimal getMoney_earned() {
        return money_earned;
    }

    public void setMoney_earned(BigDecimal money_earned) {
        this.money_earned = money_earned;
    }

    @Override
    public String toString() {
        return "Course info: " +
                "courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", money_earned=" + money_earned +
                ", teacher=" + teacher + ".";
    }


}
    //    This class will have:
//
//    Variable called courseId of data type string, auto-generated (Private member)
//    Variable called name of data type string (Private member)
//    Variable called price of data type double, representing the price of this course (Private member)
//    Variable called money_earned of data type double, representing the total money earned by this course (Private member)
//    Nullable variable called teacher of data type Teacher (Private member)
//    A parameterized constructor that takes name and price
//    Public Getter functions to access these variables
//    Public Setter functions to change these variables
//    Optional attributes are accepted if needed based on the code structure

