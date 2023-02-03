package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Teacher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShowProfitTest {


    private ShowProfit profit = new ShowProfit();
    private Teacher teacher1;
    private Course course1;

    Map<String, Teacher> testTeacherMap =  new HashMap<>();
    Map<String, Course> testCourseMap =  new HashMap<>();
    @BeforeEach
    void setUp() {
        teacher1 = new Teacher("profe1", new BigDecimal(100));
        testTeacherMap.put( "profe" , teacher1);

        course1 = new Course("cursoGuay", new BigDecimal(1000));
        testCourseMap.put("curso", course1);


    }

    @AfterEach
    void tearDown() {

    }




    @Test
    public void showProfitTest_substract(){
        assertEquals(new BigDecimal(-100), ShowProfit.showProfit(testCourseMap,testTeacherMap));
    }

}