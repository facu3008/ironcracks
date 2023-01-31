package com.ironhack.ironschool.submenus;

import com.ironhack.ironschool.clases.Course;

import java.util.Map;

public class SubMenuCourse {

    public static void subMenuTcourses(Map<String, Course> courseMap){
        courseMap.forEach((key,value) -> System.out.println(key));
    }



}
