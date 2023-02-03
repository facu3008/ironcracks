package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Teacher;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static com.ironhack.ironschool.methods.Assign.assign;
import static org.junit.jupiter.api.Assertions.*;

class AssignTest {
    private Assign assign = new Assign();
    private Map<String, Teacher> testTeacherMap;
    private Map<String, Course> testCourseMap;
    private Map<String, Teacher> emptyTeacherMap;
    private Map<String, Course> emptyCourseMap;
    private Teacher teacher1, teacher2;
    private Course course1, course2;

    @BeforeEach
    public void setUp() {

        emptyTeacherMap = null;
        testTeacherMap = new HashMap<>();

        teacher1 = new Teacher("1","profe1", new BigDecimal(100));
        testTeacherMap.put("1", teacher1);

        testCourseMap = new HashMap<>();
        emptyCourseMap = null;

        course1 = new Course("1", "curso1", new BigDecimal(100), new BigDecimal(1000), null);
        testCourseMap.put("1", course1);
    }

    @AfterEach
    public void tearDown() {
        testCourseMap.clear();
        testTeacherMap.clear();
    }

    @Test
    public void assignTest_teacherIsNull_Throws() {
        try {
            assign(testTeacherMap, emptyCourseMap, "1", "1");
        } catch (NullPointerException  e) {
            Assert.assertEquals("No hay registros suficientes", e.getMessage());
        }
    }

    @Test
    public void assignTest_courseIsNull_Null() {
        try {
            assign(testTeacherMap, emptyCourseMap, "1", "1");
        } catch (NullPointerException e) {
            Assert.assertEquals("No hay registros suficientes", e.getMessage());
        }
    }


    @Test
    public void assignTest_validIds_Works() {
        assign(testTeacherMap, testCourseMap, "1", "1");
        assertEquals(teacher1, course1.getTeacher());
    }

    @Test
    public void assignTest_inValidTeacherId_Null() {
        assign(testTeacherMap, testCourseMap, "3", "1");
        assertNull(course1.getTeacher());
    }

    @Test
    public void assignTest_inValidCourseId_Null() {
        assign(testTeacherMap, testCourseMap, "1", "3");
        assertNull(course1.getTeacher());
    }
}