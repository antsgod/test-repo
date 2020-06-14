package com.comanche.MultiThread.chapter05.section01;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 5秒后执行timerTask的任务
 */
public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer(false);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = now.plusSeconds(5);

        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        timer.schedule(new timerTask(),date);
    }
}

class timerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("运行时间为："+new Date());
    }
}
