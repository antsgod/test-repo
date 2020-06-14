package com.comanche.crazyJava.chapter07.section04.class03;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * 关注格式化
 */
public class Java8Time5 {
    @Test
    public void test1(){
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ISO_DATE);
        String format1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format);
        System.out.println(format1);
        LocalDateTime parse = LocalDateTime.parse(format1);
        System.out.println(parse);
    }

    @Test
    public void test2(){
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String format1 = now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String format2 = now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String format3 = now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(format);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
    }

    /**
     * 自定义格式化
     */
    @Test
    public void test3(){
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);
    }
    /**
     * Java 中，怎么在格式化的日期中显示时区？
     */
    @Test
    public void test4(){
        Date date = new Date();
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime1 = instant.atZone(ZoneId.of("Asia/Shanghai"));
        zonedDateTime1.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println(zonedDateTime1);
    }

    /**
     * 字符串转日期
     */
    @Test
    public void test5(){
        LocalDate yyyyMMdd = LocalDate.parse("20190910", DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(yyyyMMdd);
        LocalDateTime a = LocalDateTime.parse("2020-05-17 22:13:07",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(a);
    }

    @Test
    public void test6(){

    }

    @Test
    public void test7(){

    }

    @Test
    public void test8(){

    }

    @Test
    public void test9(){

    }
}
