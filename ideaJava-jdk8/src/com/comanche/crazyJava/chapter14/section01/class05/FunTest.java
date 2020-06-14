package com.comanche.crazyJava.chapter14.section01.class05;

import org.junit.Test;

public class FunTest {

    @Test
    public void test1(){
        FunInterface.print("aaa");
    }

    @Test
    public void test2(){
        DoubleNum doubleNum = new DoubleNum(2);
        int print = doubleNum.get(obj -> obj*2);
        System.out.println(print);
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


