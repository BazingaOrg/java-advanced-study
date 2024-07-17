package com.itheima.system;

public class SystemDemo {
    /*
     * System类常见方法：
     * 1. public static void exit (int status) : 终止当前运行的Java虚拟机，非零表示异常终止
     * 2. public static long currenttimeMillis () : 返回当前系统的时间毫秒值形式
     * 3. public static void arraycopy (Object src, int srcPos, Object dest, int destPos, int length) : 数组拷贝
     */
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] destArr = new int[3];

        System.arraycopy(arr, 1, destArr, 0, 3);

        for (int i = 0; i < destArr.length; i++) {
            System.out.println(destArr[i]);
        }
    }
}
