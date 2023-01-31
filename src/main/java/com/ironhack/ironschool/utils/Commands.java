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
        String command = scanner.nextLine();


            //WHILE
            switch (command) {
                case "1-ENROLL":

                    break;
                case "2-ASSIGN":
                    assignMethod(teachersMap,courseMap);
                    break;
                case "3-SHOW COURSES":
                    courseMap.forEach((key, value) -> System.out.println(value.getName()));
                    break;
                case "4-LOOKUP COURSE":
                    System.out.println("Introduce la ID del curso: ");
                   // courseMap.forEach((key,value) -> System.out.println(value.getCourseId())); // para tener la id (provisional)
                    String courseId = scanner.nextLine();
                    courseMap.forEach((key, value) -> { if(value.getCourseId().equals(courseId)){
                        System.out.println(value);}
                    });
                    // BUSQUEDA A TRAVES DE ID (WORKS)
                    break;
                case "5-SHOW STUDENTS":
                    studentMap.forEach((key, value) -> System.out.println(value.getName()+value.getStudentId()));
                    break;
                case "6-LOOKUP STUDENTS":
                    studentMap.forEach((key,value)->
                     System.out.println(value));
                    break;
                case "7-SHOW TEACHER":
                    teachersMap.forEach((key, value) -> System.out.println(value.getName() + value.getTeacherId()));
                    break;
                case "8-LOOKUP TEACHER":
                   String teacherId = scanner.nextLine();
                    courseMap.forEach((key, value) -> { if(value.getCourseId().equals(teacherId)){
                        System.out.println(value);}
                    });
                    break;
                case "9-SHOW PROFIT":
                    break;
                default:
                    System.out.println("WTF");
                    break;
            }
    }

}

// IMPLEMENTAR MENU CON LAS OPCIONES, Y UN SUB MENU PARA AQUELLAS OPCIONES QUE PERMITEN LA ELECCION DE ID'S.