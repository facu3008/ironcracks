package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;

import java.util.Map;
import java.util.Scanner;

public class LookupCourse {
    public static void lookupCourse(Map<String, Course> courseMap){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la ID del curso: ");
        courseMap.forEach((key, value) -> System.out.println(value.getCourseId()));
        String courseId = scanner.nextLine();

        courseMap.forEach((key, value) -> {
            if (value.getCourseId().equals(courseId)) {
                System.out.println(value);
            }
        });
    }
}
