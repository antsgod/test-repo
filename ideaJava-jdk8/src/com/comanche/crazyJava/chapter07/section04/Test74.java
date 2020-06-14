package com.comanche.crazyJava.chapter07.section04;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test74 {
    /**
     * 格式化为ddMMyyyy
     */
    @Test
    public void test1(){
        LocalDate now = LocalDate.now();
        String format = now.format(DateTimeFormatter.ofPattern("ddMMyyyy"));
        System.out.println(format);
    }

    @Test
    public void test2(){

    }

    @Test
    public void test3(){

    }

    @Test
    public void test4(){

    }

    @Test
    public void test5(){

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


