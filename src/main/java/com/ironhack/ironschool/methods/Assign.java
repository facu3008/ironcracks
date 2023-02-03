package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Teacher;
import java.util.Map;


public class Assign {

    public static void assign(Map<String , Teacher> teachersMap, Map<String, Course> courseMap, String iDTeacher, String iDCourse){

        if (courseMap == null || teachersMap == null) {
            throw new NullPointerException("No hay registros suficientes");
        }
        for (Map.Entry<String, Course> courseEntry : courseMap.entrySet()) {
            Course courseValue = courseEntry.getValue();
            if (courseValue.getCourseId().equals(iDCourse)) {
                for (Map.Entry<String, Teacher> teacherEntry : teachersMap.entrySet()) {
                    Teacher teacherValue = teacherEntry.getValue();
                    if (teacherValue.getTeacherId().equals(iDTeacher)) {
                        courseValue.setTeacher(teacherValue);
                        System.out.println(courseValue);
                    }
                }
            }
        }
    }
}
