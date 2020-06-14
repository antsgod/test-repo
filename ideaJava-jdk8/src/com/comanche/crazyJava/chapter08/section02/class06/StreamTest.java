package com.comanche.crazyJava.chapter08.section02.class06;

import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder().add(1).add(12).add(15).add(89).add(-9).build();
        //System.out.println(is.max().getAsInt());
        //System.out.println(is.min().getAsInt());
        IntStream intStream = is.map(ele -> ele + 10);
        intStream.forEach(System.out::println);
    }
}
