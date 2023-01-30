package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Student;

import java.util.Map;
import java.util.Scanner;

public class CreateStudents {
    public static void createStudents(Map<String, Student> studentMap)
    {
        System.out.println("Cuantos alumnos asisten la escuela? ");
        Scanner scanner = new Scanner(System.in);
        int studentQuant  = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i<studentQuant; i++ ){
            System.out.println("Introduce el nombre del estudiante: ");
            String studentName  = scanner.nextLine();
            System.out.println("Introduce la direccion del estudiante: ");
            String studentAddress  = scanner.nextLine();
            System.out.println("Introduce el email del estudiante: ");
            String studentEmail  = scanner.nextLine();
           // System.err.println(studentEmail);

            Student student = new Student(studentName,studentAddress,studentEmail);
           // System.out.println(student);
            studentMap.put(student.getStudentId(), student);
            studentMap.forEach((key,value) -> {
             //   System.err.println("este es el id: " + key + " este es el nombre: " + value.getName());
            });
        }
    }
}
