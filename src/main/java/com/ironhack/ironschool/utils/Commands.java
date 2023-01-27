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

        switch (command){
            case  "SHOW COURSES":
                courseMap.forEach((key, value) -> System.out.println(value));
                break;
            default:
                System.out.println("WTF");
        }
    }

}
