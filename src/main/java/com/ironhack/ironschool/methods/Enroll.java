package com.ironhack.ironschool.methods;
import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;
import java.util.Map;
import java.util.Scanner;

public class Enroll {

    public static void enroll(Map<String , Student> studentMap, Map<String, Course> courseMap){

        Scanner scanner = new Scanner(System.in);

        studentMap.forEach((key,value) -> System.out.println("Student Id: " + value.getStudentId()));
        System.out.println("Introduce el id del alumno: ");
        String iDStudent = scanner.nextLine();

        courseMap.forEach((key,value) -> System.out.println("Curso Id: " + value.getCourseId()));
        System.out.println("Introduce el id del curso: ");
        String iDCourse = scanner.nextLine();

        studentMap.forEach((studentKey, studentValue) -> {
            if (studentValue.getStudentId().equals(iDStudent)) {
                courseMap.forEach((courseKey, courseValue) -> {
                    if (courseValue.getCourseId().equals(iDCourse)) {
                        studentValue.setCourse(courseValue);
                        courseValue.setMoney_earned(courseValue.getMoney_earned().add(courseValue.getPrice()));
                        System.out.println(studentValue);
                    }
                });
            }
        });
    }
}
