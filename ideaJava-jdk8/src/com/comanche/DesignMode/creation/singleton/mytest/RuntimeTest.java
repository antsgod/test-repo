package com.comanche.DesignMode.creation.singleton.mytest;

public class RuntimeTest {

    public static void main(String[] args) {
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
    }
}
