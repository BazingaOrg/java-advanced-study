package com.itheima.date;

import java.util.Date;

public class DateDemo1 {
    /*
     * Date类
     * 1. 构造方法：
     * public Date(): 将当前时间，封装为Date日期对象
     * public Date(long time): 将时间毫秒值转换成Date日期对象
     *
     * 2. 常见方法：
     * public long getTime(): 返回从1970年1月1日0时0分0秒到当前日期的毫秒数
     * public void setTime(): 设置日期对象的时间为当前时间毫秒值对应的时间
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(1000L);
        System.out.println(d2);

        System.out.println(d1.getTime());
        System.out.println(d2.getTime());

        System.out.println("------------");

        Date d3 = new Date();
        d3.setTime(1000L);
        System.out.println(d3);
    }
}
