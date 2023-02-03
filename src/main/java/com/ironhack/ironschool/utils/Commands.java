package com.ironhack.ironschool.utils;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;
import com.ironhack.ironschool.clases.Teacher;

import java.util.Map;
import java.util.Scanner;

import static com.ironhack.ironschool.methods.Assign.assign;
import static com.ironhack.ironschool.methods.Enroll.enroll;
import static com.ironhack.ironschool.methods.LookupCourse.lookupCourse;
import static com.ironhack.ironschool.methods.LookupStudent.lookupStudent;
import static com.ironhack.ironschool.methods.LookupTeacher.lookupTeacher;
import static com.ironhack.ironschool.methods.ShowProfit.showProfit;
import static com.ironhack.ironschool.submenus.SubMenuCourses.subMenuCourses;
import static com.ironhack.ironschool.submenus.SubMenuStudents.subMenuStudents;
import static com.ironhack.ironschool.submenus.SubMenuTeachers.subMenuTeachers;


public class Commands {
    public static void insertCommand(Map<String, Teacher> teachersMap, Map<String, Student> studentMap, Map<String, Course> courseMap) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Introduce un comando:");
       String command;
      
        do{
            System.out.println(" Bienvenido al menu de Consultas  Básicas \n" +
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
                case "2" -> {
                    System.out.println("Introduce el id del teacher: ");
                    teachersMap.forEach((key,value) -> System.out.println("Professor Id: " + value.getTeacherId()));
                    String iDTeacher = scanner.nextLine();

                    System.out.println("Introduce el id del curso: ");
                    courseMap.forEach((key,value) -> System.out.println("Curso Id: " + value.getCourseId()));
                    String iDCourse = scanner.nextLine();
                    assign(teachersMap, courseMap, iDTeacher, iDCourse);
                }

                // SHOW COURSES
                case "3" -> courseMap.forEach((key, value) -> System.out.println(value.getName()));

                // LOOKUP COURSE
                case "4" -> {
                    System.out.println("Introduce la ID del curso que deseas buscar: ");
                    subMenuCourses(courseMap);
                    String courseId = scanner.nextLine();
                    System.out.println(lookupCourse(courseMap, courseId));
                }

                // SHOW STUDENTS
                case "5" -> studentMap.forEach((key, value) -> System.out.println(value.getName()));

                // LOOKUP STUDENT
                case "6" -> {
                    System.out.println("Introduce la ID del estudiante que deseas buscar: ");
                    subMenuStudents(studentMap);
                    String studentId = scanner.nextLine();
                    System.out.println(lookupStudent(studentMap, studentId));
                }

                // SHOW TEACHERS
                case "7" -> teachersMap.forEach((key, value) -> System.out.println(value.getName()));

                // LOOKUP TEACHER
                case "8" -> {
                    System.out.println("Introduce la ID del profesor que deseas buscar: ");
                    subMenuTeachers(teachersMap);
                    String teacherId = scanner.nextLine();
                    System.out.println(lookupTeacher(teachersMap, teacherId));
                }

                // SHOW PROFIT
                case "9" -> showProfit(courseMap, teachersMap);


                case "10" -> System.out.println("Consulta Finalizada");

                default -> System.out.println("OPCION INVALIDA");
            }
        } while (!command.equals("10"));
    }
}

// IMPLEMENTAR MENU CON LAS OPCIONES, Y UN SUB MENU PARA AQUELLAS OPCIONES QUE PERMITEN LA ELECCION DE ID'S.