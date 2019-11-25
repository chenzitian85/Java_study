/*
* 日期类时间的使用
* */
package cn.study.oo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;
import java.util.Date;

public class Canlendar_study {
    //将日期转换为指定格式输出
    public static void main(String[] args) throws ParseException {

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());  //每刷新一次时间秒数会发生对应的改变 Date类构建的日期的秒数不变
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println("当前时间：" + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);
        System.out.println(c.getTimeInMillis());
    }
}
