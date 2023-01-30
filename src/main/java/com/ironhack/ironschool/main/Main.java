package com.ironhack.ironschool.main;

import com.ironhack.ironschool.clases.*;
import com.ironhack.ironschool.utils.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.ironhack.ironschool.utils.Commands.insertCommand;


public class Main {
    public static void main(String[] args) {

        Map<String, Teacher> teachersMap = new HashMap<>();
        Map<String, Student> studentMap = new HashMap<>();
        Map<String, Course> courseMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de la escuela: ");
        String schoolName  = scanner.nextLine();

        CreateTeachers.createTeachers(teachersMap);
        CreateCourses.createCourses(courseMap);
        CreateStudents.createStudents(studentMap);

        insertCommand(teachersMap, studentMap, courseMap);


        }

}

