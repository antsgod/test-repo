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
        System.out.println("测试");
    }
}

class TimerTask1 extends TimerTask {

    @Override
    public void run() {
        System.out.println("到5秒钟了："+new Date());
    }
}
