package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Student;
import com.ironhack.ironschool.clases.Teacher;

import java.util.Map;
import java.util.Scanner;

public class LookupTeacher {
    public static void lookupTeacher(Map<String, Teacher> teacherMap){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la ID del profesor: ");
        teacherMap.forEach((key, value) -> System.out.println(value.getTeacherId()));
        String teacherId = scanner.nextLine();

        teacherMap.forEach((key, value) -> {
            if (value.getTeacherId().equals(teacherId)) {
                System.out.println(value);
            }
        });
    }
}
