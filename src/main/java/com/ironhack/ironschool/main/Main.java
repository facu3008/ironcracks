package com.ironhack.ironschool.main;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;
import com.ironhack.ironschool.clases.Teacher;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, Teacher> teachersMap = new HashMap<>();
        Map<String, Student> studentMap = new HashMap<>();
        Map<String, Course> courseMap = new HashMap<>();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de la escuela: ");
        String schoolName  = scanner.nextLine();

        System.out.println("Cuantos profesores pertenecen a la escuela? ");

        int teacherQuant  = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i<teacherQuant; i++ ){
            System.out.println("Introduce el nombre del profesor: ");
            String professorName  = scanner.nextLine();
            System.out.println("Introduce el salario del profesor: ");
            BigDecimal professorSalary = scanner.nextBigDecimal();
            scanner.nextLine();

            Teacher teacher= new Teacher(professorName,professorSalary);
            teachersMap.put(teacher.getTeacherId(), teacher);
        }



        System.out.println("Cuantos cursos quieres dar en la escuela? ");
        int courseQuant  = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i<courseQuant; i++ ){
            System.out.println("Introduce el nombre del curso: ");
            String courseName  = scanner.nextLine();
            System.out.println("Introduce el precio del curso: ");
            BigDecimal coursePrice = scanner.nextBigDecimal();
            scanner.nextLine();

            Course course= new Course(courseName,coursePrice);
            courseMap.put(course.getCourseId(), course);


        }

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

            Student student= new Student(studentName,studentAddress,studentEmail);
            studentMap.put(student.getStudentID(), student);
        }

    }

}