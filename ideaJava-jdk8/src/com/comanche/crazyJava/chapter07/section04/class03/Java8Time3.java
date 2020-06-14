package com.comanche.crazyJava.chapter07.section04.class03;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Java8Time3 {
    public static void main(String[] args) {
        Month of = Month.of(4);
        System.out.println(of);
    }

    @Test
    public void test1(){
        LocalDate of = LocalDate.of(2020, 1, 2);
        System.out.println(of);
        LocalDate localDate = of.plusDays(5);
        System.out.println(localDate);
        LocalDate localDate1 = of.plusMonths(3);
        System.out.println(localDate1);
        LocalDate localDate2 = of.plusYears(5);
        System.out.println(localDate2);
    }

    /**
     * 在当前时间基础上加上一段时间，比如1年3个月5天
     */
    @Test
    public void test2(){
        LocalDate now = LocalDate.now();
        System.out.println(now);
        Period of = Period.of(1, 3, 5);
        LocalDate plus = now.plus(of);
        System.out.println(plus);
    }

    /**
     * with
     */
    @Test
    public void test3(){
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate localDate = now.withYear(2030);
        System.out.println(localDate);
    }

    /**
     * TemporalAdjuster
     */
    @Test
    public void test4(){
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
        System.out.println(temporalAdjuster);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate with = now.with(temporalAdjuster);
        System.out.println(with);
    }

    /**
     * 测试PayDayAdjuster
     */
    @Test
    public void test5(){
        LocalDate of = LocalDate.of(2018, 12, 15);
        PayDayAdjuster payDayAdjuster = new PayDayAdjuster();
        Temporal temporal = payDayAdjuster.adjustInto(of);
        System.out.println(temporal);
    }

    /**
     * 测试TemporalQueryImpl
     */
    @Test
    public void test6(){
        LocalDate now = LocalDate.now();
        Long aLong = new TemporalQueryImpl().queryFrom(now);
        System.out.println(aLong);
        LocalDate of = LocalDate.of(2020, 5, 2);
        Long aLong1 = new TemporalQueryImpl().queryFrom(of);
        System.out.println(aLong1);
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
