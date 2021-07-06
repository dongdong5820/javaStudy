package com.basis.java;

import com.utils.DateUtil;

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
    }
}
