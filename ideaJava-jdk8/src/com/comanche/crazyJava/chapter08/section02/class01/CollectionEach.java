package com.comanche.crazyJava.chapter08.section02.class01;

import java.util.ArrayList;
import java.util.List;

public class CollectionEach {
    /**
     * lambda遍历集合
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(obj -> System.out.println(obj));
    }
}
