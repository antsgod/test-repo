package com.comanche.MultiThread.chapter05.section01;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 从启动开始，定时执行执行timerTask的任务
 */
public class TimerTest1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        Instant instant = now.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        timer.schedule(new TimerTask1(),date,5000);
        for (int i = 0; i < 50; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TimerTask1 extends TimerTask {

    @Override
    public void run() {
        System.out.println("到5秒钟了："+new Date());
    }
}
