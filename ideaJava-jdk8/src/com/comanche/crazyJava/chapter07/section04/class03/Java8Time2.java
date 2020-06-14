package com.comanche.crazyJava.chapter07.section04.class03;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Java8Time2 {
    /**
     * 获得所有时区信息
     * @param args
     */
    public static void main(String[] args) {
        //所有时区信息
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }

    /**
     * 获得默认时区信息
     */
    @Test
    public void test(){
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
    }

    /**
     * LocalDateTime添加时区信息
     */
    @Test
    public void test2(){
        LocalDateTime of = LocalDateTime.of(2020, 4, 5, 9, 58, 30);
        ZonedDateTime zonedDateTime = of.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
        //获取对应的东京时间
        ZonedDateTime withZoneSameInstant = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println(withZoneSameInstant);
    }

    @Test
    public void test3(){

    }

    @Test
    public void test4(){

    }
}
