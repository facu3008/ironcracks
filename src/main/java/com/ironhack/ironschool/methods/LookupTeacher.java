package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Teacher;
import java.util.Map;

public class LookupTeacher {
    public static Teacher lookupTeacher(Map<String, Teacher> teacherMap, String teacherId){

        Teacher foundTeacher = null;

            if (teacherMap == null) {
                throw new IllegalArgumentException("No hay profesores registrados");
            }
            for (Map.Entry<String, Teacher> entry : teacherMap.entrySet()) {
                Teacher currentTeacher = entry.getValue();
                if (currentTeacher.getTeacherId().equals(teacherId)) {
                    foundTeacher = currentTeacher;
                    break;
                }
            }
        if (foundTeacher == null) {
            System.out.println("El profesor especificado no existe");
        }
        return foundTeacher;
    }
}
