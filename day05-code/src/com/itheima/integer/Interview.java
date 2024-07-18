package com.itheima.integer;

public class Interview {
    /*
     * 看程序说结果，并说明原因
     * 自动装箱的时候，如果装箱的数据范围，是-128～127，==号比较的结果就是true，反之都是false
     *
     * ----------------------------------------------------------------
     *
     * 自动装箱的原理：自动帮我们调用了 Integer.valueOf(127);
     *
     * public static Integer valueOf(int i) {
     *   if (i >= -128 && i <= 127) {
     *      return IntegerCache.cache[i + (-IntegerCache.low)];
     *   }
     *   return new Integer(i);
     * }
     *
     * 如果装箱的数据，不在-128～127，会重新创建新的对象
     * 如果装箱的数据，在-128～127，不会创建新的对象，而是从底层的数组中，取出一个提前创建好的Integer对象，返回
     *
     * - Integer类中，底层存在了一个长度为256个大小的数组，Integer[] cache
     *   在数组中，存储了256个Integer对象，分别是-128～127
     */
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2); // true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4); // false
    }
}
