package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import java.util.Map;


public class LookupCourse {
    public static Course lookupCourse(Map<String, Course> courseMap, String courseId) {

        Course foundCourse = null;

            if (courseMap == null) {
                throw new IllegalArgumentException("No hay cursos registrados");
            }
            for (Map.Entry<String, Course> entry : courseMap.entrySet()) {
                Course currentCourse = entry.getValue();
                if (currentCourse.getCourseId().equals(courseId)) {
                    foundCourse = currentCourse;
                    break;
                }
            }
            if (foundCourse == null) {
                System.out.println("El curso especificado no existe");
            }
        return foundCourse;
    }
}
