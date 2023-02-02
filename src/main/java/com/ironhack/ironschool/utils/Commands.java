package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;
import com.ironhack.ironschool.clases.Teacher;

import java.util.Map;
import java.util.Scanner;

import static com.ironhack.ironschool.methods.Assign.assign;
import static com.ironhack.ironschool.methods.Enroll.enroll;
import static com.ironhack.ironschool.methods.LookupCourse.lookupCourse;


public class Commands {
    public static void insertCommand(Map<String, Teacher> teachersMap, Map<String, Student> studentMap, Map<String, Course> courseMap) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Introduce un comando:");
       String command;
      
        do{
            System.out.println(" Bienvenido al menu de Consultas  Basicas \n" +
                    " 1: ENROLL \t\t\t 2: ASSIGN \t\t\t 3: SHOW COURSE \n " +
                    "4: LOOKUP COURSE \t 5: SHOW STUDENTS \t 6: LOOKUP STUDENTS \n " +
                    "7: SHOW TEACHER \t 8: LOOKUP TEACHER \t 9: SHOW PROFIT \n " +
                    "10: EXIT PROGRAM ") ;
            System.out.println("Por Favor digite la opcion: ");
            command = scanner.nextLine();

            switch (command) {
                // ENROLL
                case "1" -> enroll(studentMap, courseMap);

                // ASSIGN
                case "2" -> assign(teachersMap, courseMap);

                // SHOW COURSES
                case "3" -> courseMap.forEach((key, value) -> System.out.println(value.getName()));

                // LOOKUP COURSE
                case "4" -> lookupCourse(courseMap);

                // SHOW STUDENTS
                case "5" -> studentMap.forEach((key, value) -> System.out.println(value.getName()));


                // LOOKUP STUDENTS
                case "6" -> System.out.println("Comando prueba 6");


                // SHOW TEACHER
                case "7" -> System.out.println("Comando prueba 7");


                // LOOKUP TEACHER
                case "8" -> System.out.println("Comando prueba 8");


                // SHOW PROFIT
                case "9" -> System.out.println("Comando prueba 9");


                case "10" -> System.out.println("Consulta Finalizada");

                default -> System.out.println("OPCION INVALIDA");
            }
        } while (!command.equals("10"));
    }
}

// IMPLEMENTAR MENU CON LAS OPCIONES, Y UN SUB MENU PARA AQUELLAS OPCIONES QUE PERMITEN LA ELECCION DE ID'S.