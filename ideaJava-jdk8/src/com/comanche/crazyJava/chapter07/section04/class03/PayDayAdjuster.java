package com.comanche.crazyJava.chapter07.section04.class03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 需求：传入随意日期，判断当月15号是否是周末，
 *  如果是，则将发薪日调整为本周的周五，
 *  如果不是，发薪日为15号那天的日期，
 *  返回发薪日期
 */
public class PayDayAdjuster implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate date = LocalDate.from(temporal);
        LocalDate payDate = date.withDayOfMonth(15);
        if(payDate.getDayOfWeek() == DayOfWeek.SUNDAY ||payDate.getDayOfWeek() == DayOfWeek.SATURDAY){
            payDate = payDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        }
        return payDate;
    }
}
