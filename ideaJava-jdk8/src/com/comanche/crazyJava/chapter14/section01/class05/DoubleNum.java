package com.comanche.crazyJava.chapter14.section01.class05;

public class DoubleNum {

    private int num;

    public DoubleNum(int num) {
        this.num = num;
    }

    public int get(FunInterface face){
        return face.getDoubleNum(num);
    }

}
