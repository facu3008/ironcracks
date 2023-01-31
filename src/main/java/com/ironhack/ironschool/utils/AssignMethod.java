package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Teacher;

import java.util.Map;
import java.util.Scanner;

public class AssignMethod {

    public static void assignMethod(Map<String , Teacher> teachersMap, Map<String, Course> courseMap){

        Scanner scanner = new Scanner(System.in);

        teachersMap.forEach((key,value) -> System.out.println("Professor Id: "
                + value.getTeacherId()));

        System.out.println("Introduce el id del teacher: ");
        String iDTeacher = scanner.nextLine();
        courseMap.forEach((key,value) -> System.out.println("Curso Id: " + value.getCourseId()));
        System.out.println("Introduce el id del curso: ");
        String iDCourse = scanner.nextLine();
        courseMap.forEach((courseKey, courseValue) ->
        {
            if (courseValue.getCourseId().equals(iDCourse)) {
                teachersMap.forEach((teacherKey, teacherValue) -> {
                    if (teacherValue.getTeacherId().equals(iDTeacher))
                    {courseValue.setTeacher(teacherValue);
                        System.out.println(courseValue);
                    }
                });
            }
        });

    }



}
