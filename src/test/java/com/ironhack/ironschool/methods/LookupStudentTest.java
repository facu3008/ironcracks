package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static com.ironhack.ironschool.methods.LookupStudent.lookupStudent;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class LookupStudentTest {

    private LookupStudent lookupStudent = new LookupStudent();
    private Map<String, Student> testMap;
    private Map<String, Student> emptyMap;
    private Student student1, student2;



    @Before
    public void setUp() {

        emptyMap = new HashMap<>();
        testMap = new HashMap<>();

        student1 = new Student("1", "student1", "email1", "address1", null);
        testMap.put("1", student1);
        student2 = new Student("2", "student2","email2", "address2", null);
        testMap.put("2", student2);
    }


    @After
    public void tearDown() {
        emptyMap.clear();
        testMap.clear();
    }


    @Test
    public void lookupCourse_emptyMap_null() {
        try {
            lookupStudent(emptyMap, "3");
        } catch (IllegalArgumentException e) {
            assertEquals("No hay estudiantes registrados", e.getMessage());
        }
    }

    @Test
    public void lookupCourse_idValid_course() {
        assertEquals(student1, lookupStudent(testMap, "1"));
    }

    @Test
    public void lookupCourse_idInvalid_null() {
        assertNull(lookupStudent(testMap, "3"));
    }
}