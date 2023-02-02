package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Teacher;

import java.util.Map;
import java.util.Scanner;

public class Assign {

    public static void assign(Map<String , Teacher> teachersMap, Map<String, Course> courseMap){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el id del teacher: ");
        teachersMap.forEach((key,value) -> System.out.println("Professor Id: " + value.getTeacherId()));
        String iDTeacher = scanner.nextLine();

        System.out.println("Introduce el id del curso: ");
        courseMap.forEach((key,value) -> System.out.println("Curso Id: " + value.getCourseId()));
        String iDCourse = scanner.nextLine();

        courseMap.forEach((courseKey, courseValue) -> {
            if (courseValue.getCourseId().equals(iDCourse)) {
                teachersMap.forEach((teacherKey, teacherValue) -> {
                    if (teacherValue.getTeacherId().equals(iDTeacher)) {
                        courseValue.setTeacher(teacherValue);
                        System.out.println(courseValue);
                    }
                });
            }
        });

    }
}
