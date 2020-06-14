package com.comanche.crazyJava.chapter07.section04.class03;

import org.junit.Test;

import java.sql.Timestamp;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 关注新旧API类的转换
 */
public class Java8Time4 {
    /**
     * java.util.Date转LocalDate转
     */
    @Test
    public void test3(){
        Date date = new Date();
        System.out.println(date);
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        System.out.println(localDateTime);
    }
    /**
     * java.util.Date转LocalDate,第二种方法
     */
    @Test
    public void test31(){
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        LocalDate localDate = date1.toLocalDate();
        System.out.println(date);
        System.out.println(date1);
        System.out.println(localDate);
    }
    /**
     * java.sql.Date转LocalDate转
     */
    @Test
    public void test4(){
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = date.toLocalDate();
        System.out.println(date);
        System.out.println(localDate);
    }

    /**
     * Timestamp转LocalDateTime
     */
    @Test
    public void test5(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        LocalDateTime localDateTime = timestamp.toLocalDateTime();
        System.out.println(timestamp);
        System.out.println(localDateTime);
    }

    /**
     * Calendar转ZonedDateTime
     */
    @Test
    public void test6(){
        Calendar instance = Calendar.getInstance();
        Instant instant = instance.toInstant();
        TimeZone timeZone = instance.getTimeZone();
        ZoneId zoneId = timeZone.toZoneId();
        ZonedDateTime of = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(instance);
        System.out.println(of);
    }
    /**
     * Calendar转LocalDateTime
     */
    @Test
    public void test7(){
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int date = instance.get(Calendar.DAY_OF_MONTH);
        int hour = instance.get(Calendar.HOUR);
        int minute = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        LocalDateTime of = LocalDateTime.of(year, month + 1, date, hour, minute, second);
        System.out.println(instance);
        System.out.println(of);
    }

    /**
     * LocalDateTime转java.util.Date
     */
    @Test
    public void test8(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());
        Date from = Date.from(zonedDateTime.toInstant());
        System.out.println(from);
    }

    @Test
    public void test9(){

    }
}
