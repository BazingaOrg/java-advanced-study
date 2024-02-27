package com.itheima.mystatic;

public class StaticDemo2 {
    static int num1 = 10;

    public static void method() {
        System.out.println("method...static");
    }

    int num2  = 20;

    public void print() {
        System.out.println("print");
    }

    /*
     *  1. static 方法中，只能访问静态成员（直接访问）
     *  2. static 中不允许使用 this 关键字
     *
     *  重新认识 main 方法
     *    - public: 被 JVM 调用，访问权限足够大
     *    - static: 被 JVM 调用，不用创建对象
     *             因为 main 方法是静态的，所以测试类中其他方法也需要是静态的
     *    - void:   被 JVM 调用，不需要给 JVM 返回值
     *    - main:   一个通用的名称，虽然不是关键字，但是被 JVM 识别
     *    - String[] args: 以前用于接受键盘录入数据的，现在没用
     */
    public static void main(String[] args) {
        System.out.println(num1);
        StaticDemo2.method();

        StaticDemo2 sd = new StaticDemo2();
        System.out.println(sd.num2);
        sd.print();
    }
}
