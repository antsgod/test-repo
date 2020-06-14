package com.comanche.crazyJava.chapter14.section01.class05;

@FunctionalInterface
public interface FunInterface {

    static void print(String str){
        System.out.println(str);
    }

    int getDoubleNum(int num);

}
