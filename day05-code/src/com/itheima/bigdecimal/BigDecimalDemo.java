package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    /*
     * BigDecimal类：解决小数运算中，出现的不精确问题
     * BigDecimal创建对象：
     *    public BigDecimal(double val): 不推荐，无法保证小数运算的精确
     *    public BigDecimal(String val)
     *    public static BigDecimal valueOf(double val)
     *
     * BigDecimal常用成员方法：
     *    public BigDecimal add(BigDecimal b): 加法
     *    public BigDecimal subtract(BigDecimal b): 减法
     *    public BigDecimal multiply(BigDecimal b): 乘法
     *    public BigDecimal divide(BigDecimal b): 除法
     *    public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式): 除法
     * 注意：如果使用BigDecimal运算，出现了除不尽的情况，就会出现异常
     */
    public static void main(String[] args) {
        double num1 = 0.1;
        double num2 = 0.2;
        System.out.println(num1 + num2);

        BigDecimal b1 = new BigDecimal("10.0");
        BigDecimal b2 = new BigDecimal("3.0");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2, 3, RoundingMode.HALF_UP));

        BigDecimal result = b1.divide(b2, 3, RoundingMode.HALF_UP);
        double v = result.doubleValue();
        Math.abs(v);
    }
}
