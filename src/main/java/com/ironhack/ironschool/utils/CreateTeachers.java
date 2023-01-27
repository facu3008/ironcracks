package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Teacher;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class CreateTeachers {

    public static void createTeachers(Map<String, Teacher> teachersMap) {
        System.out.println("Cuantos profesores pertenecen a la escuela? ");

        Scanner scanner = new Scanner(System.in);
        int teacherQuant  = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i<teacherQuant; i++ ){
            System.out.println("Introduce el nombre del profesor: ");
            String professorName  = scanner.nextLine();
            System.out.println("Introduce el salario del profesor: ");
            BigDecimal professorSalary = scanner.nextBigDecimal();
            scanner.nextLine();

            Teacher teacher = new Teacher(professorName,professorSalary);
            teachersMap.put(teacher.getTeacherId(), teacher);
        }
    }
}
