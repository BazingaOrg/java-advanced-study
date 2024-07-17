package com.itheima.object.equals;

import com.itheima.object.Student;

import java.util.Objects;

public class EqualsDemo {
    /*
     * Object类中的equals方法：
     * Object类中的equals(Object obj): 对象之间进行比较，返回true，或者是false
     *
     * public boolean equals(Object obj) {
     *     return (this == obj)
     * }
     *
     * 结论：Object类中的equals方法，默认比较的是对象内存地址
     *      - 通常会重写equals方法，让对象之间，比较内容
     */
    public static void main(String[] args) {
        Student stu1 = null;
        Student stu2 = new Student("张三", 18);

        System.out.println(Objects.isNull(stu1));

        // System.out.println(stu1 == stu2);

        // 问题：Objects.equals方法，和stu1.equals方法，有什么区别？
        // 细节：Objects.equals方法，内部依赖于我们自己所编写的equals
        // 好处：Objects.equals方法，内部带非null判断

        /*
         * public static boolean equals(Object a, Object b) {
         *  return (a == b) || (a != null && a.equals(b));
         * }
         */

        System.out.println(Objects.equals(stu1, stu2));

        // System.out.println(stu1.equals(stu2));
    }
}
