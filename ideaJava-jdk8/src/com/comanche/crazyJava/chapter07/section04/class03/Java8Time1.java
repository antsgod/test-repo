package com.comanche.crazyJava.chapter07.section04.class03;

import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class Java8Time1 {
    public static void main(String[] args) {
        Year now = Year.now();
        YearMonth now1 = YearMonth.now();
        MonthDay now2 = MonthDay.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);
    }
}
