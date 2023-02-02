package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static com.ironhack.ironschool.methods.LookupCourse.lookupCourse;
import static org.junit.Assert.*;


class LookupCourseTest {

    LookupCourse lookupCourse = new LookupCourse();
    private Course course1, course2;
    @BeforeEach
    void setUp() {
        Map<String, Course> courseMap = new HashMap<>();
        course1 = new Course("curso1", new BigDecimal(100));
        courseMap.put("1", course1);
        course2 = new Course("curso2", new BigDecimal(200));
        courseMap.put("2", course2);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void lookupCourse_idValid_course() {

        Map<String, Course> courseMap = new HashMap<>();
        course1 = new Course("curso1", new BigDecimal(100));
        courseMap.put("1", course1);
        course2 = new Course("curso2", new BigDecimal(200));
        courseMap.put("2", course2);

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);

        assertEquals(course1,  lookupCourse(courseMap));
    }
}