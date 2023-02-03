package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static com.ironhack.ironschool.methods.LookupTeacher.lookupTeacher;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class LookupTeacherTest {

    private LookupTeacher lookupTeacher = new LookupTeacher();
    private Map<String, Teacher> testMap;
    private Map<String, Teacher> emptyMap;
    private Teacher teacher1, teacher2;



    @Before
    public void setUp() {

        emptyMap = new HashMap<>();
        testMap = new HashMap<>();

        teacher1 = new Teacher("1","profe1", new BigDecimal(100));
        testMap.put("1", teacher1);
        teacher2 = new Teacher("2","profe2", new BigDecimal(200));
        testMap.put("2", teacher2);
    }


    @After
    public void tearDown() {
        emptyMap.clear();
        testMap.clear();
    }


    @Test
    public void lookupTeacher_emptyMap_null() {
        try {
            lookupTeacher(emptyMap, "3");
        } catch (IllegalArgumentException e) {
            assertEquals("No hay profesores registrados", e.getMessage());
        }
    }

    @Test
    public void lookupTeacher_idValid_teacher() {
        assertEquals(teacher1, lookupTeacher(testMap, "1"));
    }

    @Test
    public void lookupTeacher_idInvalid_null() {
        assertNull(lookupTeacher(testMap, "3"));
    }
}