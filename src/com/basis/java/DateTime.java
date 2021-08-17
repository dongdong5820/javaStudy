package com.basis.java;

import com.utils.DateUtil;

import java.util.Calendar;

/**
 * @author: Ranlay.su
 * @date: 2021-07-06 20:53
 * @description: 日期，时间，时间戳转换
 * @version: 1.0
 */
public class DateTime {
    public static void main(String[] args) {
        String dateStr = "1982-01-03";
        String format = "yyyy-MM-dd";
        // 日期转时间戳
        Integer dateTime = DateUtil.dateToTimestamp(dateStr, format);
        System.out.println(dateTime);
        // 时间戳转日期
        dateStr = DateUtil.timestampToDate(String.valueOf(dateTime), format);
        System.out.println(dateStr);
        Integer year = 2020;
        System.out.println(year + "年的开始时间戳为： " + DateUtil.getYearStartTime(year));
        System.out.println(year + "年的结束时间戳为： " + DateUtil.getYearEndTime(year));

        Long timestamp = System.currentTimeMillis();
        System.out.println("当前年的开始时间戳为： " + DateUtil.getYearStartTime(timestamp));
        System.out.println("当前年的结束时间戳为： " + DateUtil.getYearEndTime(timestamp));

        testCalendar();
    }

    public static void testCalendar() {
        System.out.println("============================");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR) + "年");
        System.out.println((calendar.get(Calendar.MONTH) + 1) + "月");
        System.out.println(calendar.get(Calendar.DATE) + "日");
        // 24小时制
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + "时");
        System.out.println(calendar.get(Calendar.MINUTE) + "分");
        System.out.println(calendar.get(Calendar.SECOND) + "秒");
        System.out.println(calendar.get(Calendar.MILLISECOND) + "毫秒");
    }
}
