package com.itheima.math;

public class MathDemo {
    /*
     * Math类：包含执行基本数字运算的方法
     *
     * public static int abs (int a) : 获取参数的绝对值
     * public static double ceil (double a) : 向上取整
     * public static double floor (double a) : 向下取整
     * public static int round (double a) : 四舍五入
     * public static int max (int a, int b) : 获取两个数中的最大值
     * public static double pow (double a, double b) : 计算a的b次方
     * public static double random () : 返回值为double的随机值，范围[0.0, 1.0)
     */
    public static void main(String[] args) {
        System.out.println(Math.abs(-123));
        System.out.println(Math.ceil(20.5));
        System.out.println(Math.floor(20.4));
        System.out.println(Math.round(2.3));
        System.out.println(Math.max(12, 23));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.random());
    }
}
