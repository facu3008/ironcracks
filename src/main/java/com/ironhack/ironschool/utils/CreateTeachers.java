package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Teacher;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class CreateTeachers {

    public static void createTeachers(Map<String, Teacher> teachersMap) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos profesores pertenecen a la escuela? ");
        int teacherQuant  = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i<=teacherQuant; i++ ){

            System.out.println("Introduce el nombre del profesor " + i + " :");
            String professorName  = scanner.nextLine();

            System.out.println("Introduce el salario del profesor " + i + " :");
            BigDecimal professorSalary = scanner.nextBigDecimal();
            scanner.nextLine();

            Teacher teacher = new Teacher(professorName,professorSalary);
            teachersMap.put(teacher.getTeacherId(), teacher);
        }
    }
}
