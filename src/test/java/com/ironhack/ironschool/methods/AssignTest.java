package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static com.ironhack.ironschool.methods.Assign.assign;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AssignTest {
    private Assign assign = new Assign();
    private Map<String, Teacher> testTeacherMap;
    private Map<String, Course> testCourseMap;
    private Map<String, Teacher> emptyTeacherMap;
    private Map<String, Course> emptyCourseMap;
    private Teacher teacher1, teacher2;
    private Course course1, course2;

    @Before
    public void setUp() {

        emptyTeacherMap = new HashMap<>();
        testTeacherMap = new HashMap<>();

        teacher1 = new Teacher("1","profe1", new BigDecimal(100));
        testTeacherMap.put("1", teacher1);

        testCourseMap = new HashMap<>();
        emptyCourseMap = new HashMap<>();

        course1 = new Course("1", "curso1", new BigDecimal(100), new BigDecimal(1000), null);
        testCourseMap.put("1", course1);
    }

    @After
    public void tearDown() {
//        emptyTeacherMap.clear();
//        emptyCourseMap.clear();
//        testCourseMap.clear();
//        testTeacherMap.clear();
    }

    @Test
    public void assignTest_teacherIsNull_Null() {
    }


    @Test
    public void assignTest_validIds_Works() {
        assign(testTeacherMap, testCourseMap, "1", "1");
        assertEquals(teacher1, course1.getTeacher());
    }
}