package com.ironhack.ironschool.submenus;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;

import java.util.Map;

public class SubMenuStudents {
    public static void subMenuStudents(Map<String, Student> studentMap){
        studentMap.forEach((key,value) -> System.out.println(value.getName() + " -> Id: " + key));
        System.out.println("Introduce la ID del estudiante que deseas buscar: ");
    }
}

