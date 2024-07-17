package com.itheima.object.tostring;

public class ToStringDemo {
    /*
     * public String toString() 返回该对象的字符串表示
     *
     * public String toString() {
     *     return getClass().getName() + "@" + Integer.toHexString(hashCode());
     * }
     *
     * ----------------------------------------------------------------
     * 细节：使用打印语句，打印对象名的时候，println方法，源码层面，会自动调用该对象的toString方法。
     *
     * public static String valueOf(Object obj) {
     *     return (obj == null) ? "null" : obj.toString();
     * }
     *
     *
     */
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());
    }
}

class A {
    @Override
    public String toString() {
        return "重写了toString方法";
    }
}
