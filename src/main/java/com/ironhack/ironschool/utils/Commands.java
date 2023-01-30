package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;
import com.ironhack.ironschool.clases.Teacher;

import java.util.Map;
import java.util.Scanner;

public class Commands {
    public static void insertCommand(Map<String, Teacher> teachersMap, Map<String, Student> studentMap, Map<String, Course> courseMap) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un comando:");
        String command = scanner.nextLine();


            //WHILE
            switch (command) {
                case "ENROLL":
                    break;
                case "ASSIGN":
                    break;
                case "SHOW COURSES":
                    courseMap.forEach((key, value) -> System.out.println(value.getName()));
                    break;
                case "LOOKUP COURSE":
                    courseMap.forEach((key, value) -> System.out.println(value));
                    // BUSQUEDA A TRAVES DE ID
                    break;
                case "SHOW STUDENTS":
                    studentMap.forEach((key, value) -> System.out.println(value.getName()));
                    // SOLO DEVUELVE EL ULTIMO VALOR AÑADIDO *REVISAR*
                    break;
                case "LOOKUP STUDENTS":
                    studentMap.forEach((key,value)->
                     System.out.println(value));
                    break;
                case "SHOW TEACHER":
                    break;
                case "LOOKUP TEACHER":
                    break;
                case "SHOW PROFIT":
                    break;
                default:
                    System.out.println("WTF");
                    break;
            }
    }

}

// IMPLEMENTAR MENU CON LAS OPCIONES, Y UN SUB MENU PARA AQUELLAS OPCIONES QUE PERMITEN LA ELECCION DE ID'S.