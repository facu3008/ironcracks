package com.ironhack.ironschool.submenus;

import com.ironhack.ironschool.clases.Student;
import com.ironhack.ironschool.clases.Teacher;

import java.util.Map;

public class SubMenuTeachers {
    public static void subMenuTeachers(Map<String, Teacher> teacherMap){
        teacherMap.forEach((key,value) -> System.out.println(value.getName() + " -> Id: " + key));
        System.out.println("Introduce la ID del profesor que deseas buscar: ");
    }

}
