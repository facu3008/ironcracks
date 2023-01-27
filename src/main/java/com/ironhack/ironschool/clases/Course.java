package com.ironhack.ironschool.clases;

import java.math.BigDecimal;

public class Course {

    private String courseId;
    private String name;

    private BigDecimal price;
    private BigDecimal money_earned;
    private Teacher teacher;

    public Course(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.courseId = courseId;
    }

    public String getName() {
        return name;
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
}
