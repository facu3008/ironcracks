package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Course;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class CreateCourses {

    public static void createCourses(Map<String, Course> courseMap) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos cursos se imparten en la escuela? ");
        int courseQuant = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= courseQuant; i++ ){

            System.out.println("Introduce el nombre del curso " + i + " :");
            String courseName  = scanner.nextLine();

            System.out.println("Introduce el precio del curso " + i + " :");
            BigDecimal coursePrice = scanner.nextBigDecimal();
            scanner.nextLine();

            Course course = new Course(courseName,coursePrice);
            courseMap.put(course.getCourseId(), course);
        }
    }
}
