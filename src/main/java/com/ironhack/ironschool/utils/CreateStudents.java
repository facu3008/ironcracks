package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Student;

import java.util.Map;
import java.util.Scanner;

public class CreateStudents {
    public static void createStudents(Map<String, Student> studentMap)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos alumnos asisten la escuela? ");
        int studentQuant  = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= studentQuant; i++ ){

            System.out.println("Introduce el nombre del estudiante " + i + " :");
            String studentName  = scanner.nextLine();

            System.out.println("Introduce la direccion del estudiante " + i + " :");
            String studentAddress  = scanner.nextLine();

            System.out.println("Introduce el email del estudiante " + i + " :");
            String studentEmail  = scanner.nextLine();
           // System.err.println(studentEmail);

            Student student = new Student(studentName,studentAddress,studentEmail);

            studentMap.put(student.getStudentId(), student);
        }
    }
}
