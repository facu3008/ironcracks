package com.ironhack.ironschool.main;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de la escuela: ");
        String schoolName  = scanner.nextLine();

        System.out.println("Cuantos profesores pertenecen a la escuela? ");

        int teacherQuant  = scanner.nextInt();
        for (int i = 0; i<teacherQuant; i++ ){
            System.out.println("Introduce el nombre del profesor: ");
            String professorName  = scanner.nextLine();
            System.out.println("Introduce el salario del profesor: ");
            BigDecimal professorSalary = scanner.nextBigDecimal();
        }

        System.out.println("Cuantos cursos quieres dar en la escuela? ");
        int courseQuant  = scanner.nextInt();


        for (int i = 0; i<courseQuant; i++ ){
            System.out.println("Introduce el nombre del curso: ");
            String courseName  = scanner.nextLine();
            System.out.println("Introduce el precio del curso: ");
            BigDecimal coursePrice = scanner.nextBigDecimal();
        }

        System.out.println("Cuantos alumnos asisten la escuela? ");
        int studentQuant  = scanner.nextInt();
        for (int i = 0; i<studentQuant; i++ ){
            System.out.println("Introduce el nombre del estudiante: ");
            String studentName  = scanner.nextLine();
            System.out.println("Introduce la direccion del estudiante: ");
            String studentAddress  = scanner.nextLine();
            System.out.println("Introduce el email del estudiante: ");
            String studentEmail  = scanner.nextLine();
        }

    }

}