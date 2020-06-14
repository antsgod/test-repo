package com.comanche.crazyJava.chapter07.section04.class03;

import java.time.*;

public class Java8Time {
    public static void main(String[] args) {
        Instant now = Instant.now();
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        LocalDateTime now3 = LocalDateTime.now();
        ZonedDateTime now4 = ZonedDateTime.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);
        System.out.println(now3);
        System.out.println(now4);
    }
}
