package com.ironhack.ironschool.methods;

import com.ironhack.ironschool.clases.Course;
import com.ironhack.ironschool.clases.Teacher;

import java.math.BigDecimal;
import java.util.Map;

public class ShowProfit {
    public static BigDecimal showProfit(Map<String, Course> courseMap, Map<String, Teacher> teacherMap){
        final BigDecimal[] totalMoneyEarned = {new BigDecimal("0")};
        courseMap.forEach((key, value) -> {
            totalMoneyEarned[0] = totalMoneyEarned[0].add(value.getMoney_earned());
        });
        final BigDecimal[] totalSalaries = {new BigDecimal("0")};
        teacherMap.forEach((key, value) -> {
            totalSalaries[0] = totalSalaries[0].add(value.getSalary());
        });

        BigDecimal profit = totalMoneyEarned[0].subtract(totalSalaries[0]);
        System.out.println("El beneficio es de " + profit);
        return profit;
    }
}
