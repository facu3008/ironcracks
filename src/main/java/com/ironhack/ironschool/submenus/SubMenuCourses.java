package com.ironhack.ironschool.submenus;

import com.ironhack.ironschool.clases.Course;

import java.util.Map;

public class SubMenuCourses {

    public static void subMenuCourses(Map<String, Course> courseMap){
        courseMap.forEach((key,value) -> System.out.println(value.getName() + " -> Id: " + key));
    }

}
