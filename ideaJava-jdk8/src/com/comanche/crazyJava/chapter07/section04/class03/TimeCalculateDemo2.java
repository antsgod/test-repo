package com.comanche.crazyJava.chapter07.section04.class03;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCalculateDemo2 {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 线程安全问题
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Date format = null;
                    try {
                        synchronized (simpleDateFormat) {
                            format = simpleDateFormat.parse("2020-01-01 12:05:58");
                            System.out.println(format);
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }
    }


    /**
     * 验证单线程环境会不会有问题
     */
    @Test
    public void test() throws ParseException {
        Date format = simpleDateFormat.parse("2020-01-01 12:05:58");
        System.out.println(format);
    }

}
