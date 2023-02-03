package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Student;
import java.util.Map;


public class LookupStudent {

    public static Student lookupStudent(Map<String, Student> studentMap, String studentId) {

        Student foundStudent = null;

            if (studentMap == null) {
                throw new IllegalArgumentException("No hay estudiantes registrados");
            }
            for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
                Student currentStudent = entry.getValue();
                if (currentStudent.getStudentId().equals(studentId)) {
                    foundStudent = currentStudent;
                    break;
                }
            }
            if (foundStudent == null) {
                System.out.println("El estudiante especificado no existe");
            }

        return foundStudent;
    }

}


