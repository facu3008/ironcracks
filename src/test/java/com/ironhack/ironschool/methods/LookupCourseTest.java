package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import static com.ironhack.ironschool.methods.LookupCourse.lookupCourse;
import static org.junit.Assert.*;


public class LookupCourseTest {

    private LookupCourse lookupCourse = new LookupCourse();
    private Map<String, Course> testMap;
    private Map<String, Course> emptyMap;
    private Course course1, course2;



    @Before
    public void setUp() {
        testMap = new HashMap<>();
        emptyMap = new HashMap<>();

        course1 = new Course("1", "curso1", new BigDecimal(100), new BigDecimal(1000), null, null);
        testMap.put("1", course1);
        course2 = new Course("2", "curso2", new BigDecimal(200), new BigDecimal(2000), null, null);
        testMap.put("2", course2);
    }


    @After
    public void tearDown() {
        emptyMap.clear();
        testMap.clear();
    }


    @Test
    public void lookupCourse_emptyMap_null() {
        try {
            lookupCourse(emptyMap, "3");
        } catch (IllegalArgumentException e) {
            assertEquals("No hay cursos registrados", e.getMessage());
        }
    }

    @Test
    public void lookupCourse_idValid_course() {
        assertEquals(course1, lookupCourse(testMap, "1"));
    }

    @Test
    public void lookupCourse_idInvalid_null() {
        assertNull(lookupCourse(testMap, "3"));
    }
}