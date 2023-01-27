package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Student;

import java.util.Map;
import java.util.Scanner;

public class CreateStudents {
    public static void createStudents(Map<String, Student> studentMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos alumnos asisten la escuela? ");
        int studentQuant  = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i<studentQuant; i++ ){
            System.out.println("Introduce el nombre del estudiante: ");
            String studentName  = scanner.nextLine();
            System.out.println("Introduce la direccion del estudiante: ");
            String studentAddress  = scanner.nextLine();
            System.out.println("Introduce el email del estudiante: ");
            String studentEmail  = scanner.nextLine();

            Student student = new Student(studentName,studentAddress,studentEmail);
            studentMap.put(student.getStudentID(), student);
        }
    }
}
