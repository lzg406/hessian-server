package com.vivo.hessian.common.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     *
     *
     * @param dateStr
     * @param fromFormat 原始的时间格式
     * @param toFormat 转换后的时间格式
     * @return
     */
    public static String formatDate (String dateStr, String fromFormat, String toFormat) {

        DateFormat fromDateFormat = new SimpleDateFormat(fromFormat);
        Date date = null;
        try {
            date = fromDateFormat.parse(dateStr);
        } catch (Exception e) {
            throw new RuntimeException("时间转换异常:dateStr=" + dateStr + ", fromFormat=" + fromFormat);
        }

        DateFormat toDateFormat = new SimpleDateFormat(toFormat);

        return toDateFormat.format(date);
    }

    public static String formatDate_yyyyMMddHHmmss (Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

        return dateFormat.format(date);
    }

    /**
     * yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static String currentDate () {
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return dateFormat.format(currentDate);
    }

    public static String currentDate_yyyyMMddHHmmss () {
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

        return dateFormat.format(currentDate);
    }
    public static String currentDate_yyyyMMddHHmmssSSS () {
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");

        return dateFormat.format(currentDate);
    }

    public static String currentSimpleDate () {
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

        return dateFormat.format(currentDate);
    }

    public static Date convertDate (String dateStr, String format) {

        DateFormat formatter = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = formatter.parse(dateStr);
        } catch (Exception e) {
            throw new RuntimeException("时间转换异常:dateStr=" + dateStr + ", format=" + format);
        }

        return date;
    }

    public static Date convertDate_yyyyMMddHHmmss (String dateStr) {

        DateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = null;
        try {
            date = formatter.parse(dateStr);
        } catch (Exception e) {
            throw new RuntimeException("时间转换异常:dateStr=" + dateStr + ", format=yyyyMMddHHmmss");
        }

        return date;
    }

    public static Date dateAddMinutes (Date date, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minutes);

        return calendar.getTime();
    }

    public static void main(String[] args) {

    }
}
