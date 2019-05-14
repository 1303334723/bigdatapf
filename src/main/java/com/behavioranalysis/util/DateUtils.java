package com.behavioranalysis.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期时间工具类
 */
public class DateUtils {

    public static final SimpleDateFormat TIME_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat DATE_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat DATEKEY_FORMAT =
            new SimpleDateFormat("yyyyMMdd");

    public static boolean between(String date, String startTime, String endTime) {
        long dateLong = parseDate(date).getTime();
        long startTimeLong = parseDate(startTime).getTime();
        long endTimeLong = parseDate(endTime).getTime();

        long dateStartLong = dateLong - startTimeLong;
        long endDateLong = endTimeLong - dateLong;

        if (dateStartLong >= 0 && endDateLong >= 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断一个时间是否在另一个时间之前
     *
     * @param time1 第一个时间
     * @param time2 第二个时间
     * @return 判断结果
     */
    public static boolean before(String time1, String time2) {
        try {
            Date dateTime1 = TIME_FORMAT.parse(time1);
            Date dateTime2 = TIME_FORMAT.parse(time2);

            if (dateTime1.before(dateTime2)) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 判断一个时间是否在另一个时间之后
     *
     * @param time1 第一个时间
     * @param time2 第二个时间
     * @return 判断结果
     */
    public static boolean after(String time1, String time2) {
        try {
            Date datetime1 = TIME_FORMAT.parse(time1);
            Date datetime2 = TIME_FORMAT.parse(time2);

            if (datetime1.after(datetime2)) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 计算时间差值（单位为秒）
     *
     * @param time1 时间1
     * @param time2 时间2
     * @return 差值
     */
    public static int minus(String time1, String time2) {
        try {
            Date datetime1 = TIME_FORMAT.parse(time1);
            Date datetime2 = TIME_FORMAT.parse(time2);

            long millisecond = datetime2.getTime() - datetime2.getTime();

            return Integer.valueOf(String.valueOf(millisecond));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 获取年月日和小时
     *
     * @param datetime 时间（yyyy-MM-dd HH:mm:ss）
     * @return 结果
     */
    public static String getDateHour(String datetime) {
        String date = datetime.split(" ")[0];
        String hourMinuteSecond = datetime.split(" ")[1];
        String hour = hourMinuteSecond.split(":")[0];
        return date + "_" + hour;
    }

    /**
     * 获取当天时间（yyyy-MM-dd）
     *
     * @return 当天日期
     */
    public static String getTodayDate() {
        return DATE_FORMAT.format(new Date());
    }

    /**
     * 获取昨天的日期（yyyy-MM-dd)
     *
     * @return 昨天日期
     */
    public static String getYesterdayDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -1);

        Date date = cal.getTime();

        return DATE_FORMAT.format(date);
    }

    /**
     * 获取昨天的日期
     *
     * @return 昨天日期
     */
    public static Date getYesterday2Date() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -1);

        Date date = cal.getTime();

        return date;
    }

    /**
     * 格式化日期（yyyy-MM-dd)
     *
     * @param date Date对象
     * @return 格式化后的日期
     */
    public static String formatDate(Date date) {
        return DATE_FORMAT.format(date);
    }

    /**
     * 格式化时间（yyyy-MM-dd HH:mm:ss)
     *
     * @param date Date对象
     * @return 格式化后的时间
     */
    public static String formatTime(Date date) {
        return TIME_FORMAT.format(date);
    }

    /**
     * 解析时间字符串
     *
     * @param time 时间字符串
     * @return 解析后的Date对象
     */
    public static Date parseTime(String time) {
        try {
            return TIME_FORMAT.parse(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 格式化日期key
     *
     * @param date
     * @return
     */
    public static String formatDateKey(Date date) {
        return DATEKEY_FORMAT.format(date);
    }

    public static Date parseDateKey(String datekey) {
        try {
            return DATEKEY_FORMAT.parse(datekey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date parseDate(String datekey) {
        try {
            return DATE_FORMAT.parse(datekey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 格式化时间，保留到分钟级别
     *
     * @param date
     * @return
     */
    public static String formatTimeMinute(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        return sdf.format(date);
    }
}
