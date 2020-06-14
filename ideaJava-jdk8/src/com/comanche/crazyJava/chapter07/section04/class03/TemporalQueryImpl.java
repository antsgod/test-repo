package com.comanche.crazyJava.chapter07.section04.class03;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

/**
 * 需求：输入日期距离下一个劳动节之间的间隔天数
 */
public class TemporalQueryImpl implements TemporalQuery<Long> {
    @Override
    public Long queryFrom(TemporalAccessor temporal) {
        LocalDate inputDate = LocalDate.from(temporal);
        LocalDate workDay = LocalDate.of(inputDate.getYear(), Month.MAY, 1);
        if(inputDate.isAfter(workDay)){//如果输入日期在本年劳动日之后，则加1年
            workDay = workDay.plusYears(1);
        }
        long between = ChronoUnit.DAYS.between(inputDate, workDay);
        return between;
    }
}
