/*
* 时间对象
* */
package cn.study.oo3;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Date_study {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println("**********************");
        //把时间对象按照‘格式字符串指定的格式’转换成相应的字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = df.format(new Date(400000));
        System.out.println(str);
    }
}
