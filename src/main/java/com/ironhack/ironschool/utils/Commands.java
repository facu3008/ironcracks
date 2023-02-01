package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;
import com.ironhack.ironschool.clases.Teacher;

import java.util.Map;
import java.util.Scanner;

import static com.ironhack.ironschool.utils.AssignMethod.assignMethod;

public class Commands {
    public static void insertCommand(Map<String, Teacher> teachersMap, Map<String, Student> studentMap, Map<String, Course> courseMap) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Introduce un comando:");
       String command;
      
        do{
            System.out.println(" Bienvenido al menu de Consultas  Basicas \n" +

                    " 1: ENROLL - 2: ASSIGN - 3: SHOW COURSE - 4: LOOKUP COURSE \n" +
                    " 5: SHOW STUDENTS - 6: LOOKUP STUDENTS - 7: SHOW TEACHER - " +
                    "8: LOOKUP TEACHER - 9: SHOW PROFIT  -10: EXIT PROGRAM ") ;
            System.out.println("Por Favor digite la opcion: ");
            command = scanner.nextLine();
              
             
            switch (command) {
                // ENROLL
                case "1":
              System.out.println("Comando prueba 1");
                    break;
                
                // ASSIGN
                case "2":
                    assignMethod(teachersMap,courseMap);
                    break;
                
                // SHOW COURSES
                case "3":
                    courseMap.forEach((key, value) -> System.out.println(value.getName()));
                    break;
                
                // LOOKUP COURSE
                case "4":
                    System.out.println("Introduce la ID del curso: ");
                   // courseMap.forEach((key,value) -> System.out.println(value.getCourseId())); // para tener la id (provisional)
                    String courseId = scanner.nextLine();
                    courseMap.forEach((key, value) -> { if(value.getCourseId().equals(courseId)){
                        System.out.println(value);}
                    });
                    // BUSQUEDA A TRAVES DE ID (WORKS)
                    break;
                
                // SHOW STUDENTS
                case "5":
                    studentMap.forEach((key, value) -> System.out.println(value.getName()+value.getStudentId()));
                    break;
                
                // LOOKUP STUDENTS
                case "6":
                    studentMap.forEach((key,value)->
                            System.out.println(value));
                    break;
               
               // SHOW TEACHER
                case "7":
                    System.out.println("Comando prueba 7");
                    break;

               // LOOKUP TEACHER
                case "8":
                    System.out.println("Comando prueba 8");
                    break;
               
               // SHOW PROFIT
                case "9":
                    System.out.println("Comando prueba 1");
                    break;
                
                case "10":
                    System.out.println("Usted ha decidido no consultar data");
                    break;
                
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        } while (!command.equals("10"));
        System.out.println("Consulta Finalizada");

    }


}

// IMPLEMENTAR MENU CON LAS OPCIONES, Y UN SUB MENU PARA AQUELLAS OPCIONES QUE PERMITEN LA ELECCION DE ID'S.