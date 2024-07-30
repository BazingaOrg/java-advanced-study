package com.itheima.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    /*
     * SimpleDateFormat类：用于日期格式化
     * 1. 构造方法：
     * public SimpleDateFormat(): 根据默认的格式，创建SimpleDateFormat对象
     * public SimpleDateFormat(String pattern): 根据指定的格式，创建SimpleDateFormat对象
     * 2. 常用方法：
     * public final String format(Date date): 格式化日期
     * public public final Date parse(String source): 将日期字符串，解析为日期对象
     */
    public static void main(String[] args) throws ParseException {
        // 创建一个日期格式化对象，使用默认格式
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");

        Date date = new Date();

        String result = simpleDateFormat.format(date);
        System.out.println(result);

        String day = "2024年07月31日";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1 = simpleDateFormat1.parse(day);

        System.out.println(date1);
    }
}
