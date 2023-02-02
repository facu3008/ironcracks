package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;

import java.util.Map;
import java.util.Scanner;

public class LookupStudent {
    public static void lookupStudent(Map<String, Student> studentMap){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la ID del estudiante: ");
        studentMap.forEach((key, value) -> System.out.println(value.getStudentId()));
        String studentId = scanner.nextLine();

        studentMap.forEach((key, value) -> {
            if (value.getStudentId().equals(studentId)) {
                System.out.println(value);
            }
        });
    }
}
