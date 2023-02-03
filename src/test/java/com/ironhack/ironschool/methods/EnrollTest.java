package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Student;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static com.ironhack.ironschool.methods.Assign.assign;
import static com.ironhack.ironschool.methods.Enroll.enroll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EnrollTest {


    private Enroll enroll = new Enroll();

    Map<String, Student> testStudentMap =  new HashMap<>();
    Map<String, Course> testCourseMap =  new HashMap<>();

    private Student student1;
    private Course course1;

    @BeforeEach
    public void setUp() {

        student1 = new Student("pablo", "calle del pez", "eltontito@gmail.com");
        testStudentMap.put(student1.getStudentId(), student1);

        course1 = new Course("cursoGuay", new BigDecimal(100));
        course1.setStudent(student1);
        testCourseMap.put(course1.getCourseId(), course1);



    }

    @After
    public void tearDown() {

        testCourseMap.clear();
        testStudentMap.clear();
    }

//    @Test
//    public void assignTest_StudentIsNull_Null() {
//
//    }
    @Test
    public void enrollTest_validIds_Works() {
        System.setIn(new ByteArrayInputStream((student1.getStudentId() + "\n"+ course1.getCourseId() +"\n").getBytes()));
        enroll(testStudentMap, testCourseMap);
        assertEquals(course1, student1.getCourse());
    }
}