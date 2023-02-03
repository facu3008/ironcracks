package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static com.ironhack.ironschool.methods.Assign.assign;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AssignTest {
    private Assign assign = new Assign();
    Map<String, Teacher> testTeacherMap =  new HashMap<>();
    Map<String, Course> testCourseMap =  new HashMap<>();
    private Teacher teacher1;
    private Course course1;

    @BeforeEach
    public void setUp() {

        teacher1 = new Teacher("profe1", new BigDecimal(100));
        testTeacherMap.put(teacher1.getTeacherId(), teacher1);

        course1 = new Course("cursoGuay", new BigDecimal(100));
        course1.setTeacher(teacher1);
        testCourseMap.put(course1.getCourseId(), course1);



    }

    @After
    public void tearDown() {

        testCourseMap.clear();
       testTeacherMap.clear();
    }

   @Test
    public void assignTest_teacherIsNull_Null() {

  }


    @Test
    public void assignTest_validIds_Works() {
        System.setIn(new ByteArrayInputStream((teacher1.getTeacherId() + "\n"+ course1.getCourseId() +"\n").getBytes()));
        assign(testTeacherMap, testCourseMap);
        assertEquals(teacher1, course1.getTeacher());
    }
}


// para comprobar lo que devuelve un sout


// PrintStream stdout = System.out; -> creamos un sout nuevo en la variable stdout

//System.setOut(stdout); -> le pedimos que apunte la salida a stdout

// String outputText = byteArrayOutputStream.toString(); -> todo lo que llega a la salida standard lo pasaremos por la salida outputText (recuperamos lo que queremos enseñar)
