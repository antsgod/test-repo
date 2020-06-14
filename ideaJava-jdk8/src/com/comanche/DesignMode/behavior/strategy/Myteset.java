package com.comanche.DesignMode.behavior.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Myteset {

    public static void main(String[] args) {
        Collections.sort(Arrays.asList(new Integer[]{1, 10, 19, 41, 80, -1, 100, -50}), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}
