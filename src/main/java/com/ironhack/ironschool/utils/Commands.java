package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;
import com.ironhack.ironschool.clases.Teacher;

import java.util.Map;
import java.util.Scanner;

public class Commands {
    public static void insertCommand(Map<String, Teacher> teachersMap, Map<String, Student> studentMap, Map<String, Course> courseMap) {
        int opcion;
        Scanner S = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println(" Bienvenido al menu de Consultas  Basicas \n" +

                    " 1: Enroll - 2: Assign - 3: SHOW COURSE - 4: LOOKUP COURSE \n" +
                    " 5: SHOW STUDENTS - 6: LOOKUP STUDENTS - 7: SHOW TEACHER - " +
                    "8: LOOKUP TEACHER - 9: SHOW PROFIT  -10: Exit program ") ;
            System.out.println("Por Favor digite la opcion: ");
            opcion= S.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Comando prueba 1");
                    break;
                case 2:

////                    System.out.println("Comando prueba 2");
//                    System.out.println("Introduce el id del teacher: ");
//                    String iDTeacher = scanner.nextLine();
//                    System.out.println("Introduce el id del curso: ");
//                    String iDCourse = scanner.nextLine();
//                    courseMap.forEach((k, v) ->
//                    {
//                        if (v.getCourseId().equals(iDCourse)) {
//                            teachersMap.forEach((key, value) -> {
//                                if (value.getTeacherId().equals(iDTeacher))
//                                {v.setTeacher(value);
//                                }
//                            });
//
//                    });
//                    courseMap.forEach((key,value) -> System.out.println(value));
//                    break;
                case 3:
//                    System.out.println("Comando prueba 1");
                    courseMap.forEach((key, value) -> System.out.println(value.getName()));
                    break;
                case 4:
                    courseMap.forEach((key, value) -> System.out.println(value));
                    // BUSQUEDA A TRAVES DE ID
                    break;
                case 5:
                    studentMap.forEach((key, value) -> System.out.println(value.getName()));
                    // SOLO DEVUELVE EL ULTIMO VALOR AÑADIDO *REVISAR*
                    break;
                case 6:
                    studentMap.forEach((key,value)->
                            System.out.println(value));
                    break;
                case 7:
                    System.out.println("Comando prueba 7");
                    break;
                case 8:
                    System.out.println("Comando prueba 8");
                    break;
                case 9:
                    System.out.println("Comando prueba 1");
                    break;
                case 10:
                    System.out.println("Usted ha decidido no consultar data");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        } while (opcion != 10);
        System.out.println("Consulta Finalizada");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduce un comando:");
//        String command = scanner.nextLine();


    }


}

// IMPLEMENTAR MENU CON LAS OPCIONES, Y UN SUB MENU PARA AQUELLAS OPCIONES QUE PERMITEN LA ELECCION DE ID'S.