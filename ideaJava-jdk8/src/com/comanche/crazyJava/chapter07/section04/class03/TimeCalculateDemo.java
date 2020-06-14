package com.comanche.crazyJava.chapter07.section04.class03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class TimeCalculateDemo {

    /**
     * Calendar问题1：日期计算问题
     * @param args
     */
    public static void main(String[] args) {
        //计算当前日期距2000-01-01之间的天数
        Date date = new Date();
        long time = date.getTime();

        Calendar instance = Calendar.getInstance();
        instance.set(2000,0,1);
        Date time1 = instance.getTime();
        long time2 = time1.getTime();

        long sub = (time - time2) /1000 /60 /60/24;
        System.out.println(sub);
        System.out.println("-------------------------------");
        long between = ChronoUnit.DAYS.between(LocalDate.of(2000, 1, 1), LocalDate.now());
        System.out.println(between);
    }
}
