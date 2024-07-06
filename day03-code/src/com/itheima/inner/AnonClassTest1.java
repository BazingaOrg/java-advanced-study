package com.itheima.inner;

public class AnonClassTest1 {
    /*
     * 匿名内部类：
     *     概述：匿名内部类本质上是一个特殊的局部内部类（定义在方法内部）
     *     前提：需要存在一个接口或类
     *     格式：
     *           new 接口或类() {
     *           }
     *           new 类名(){} : 代表继承这个类
     *           new 接口名(){} : 代表实现这个接口
     */
    public static void main(String[] args) {
        // 问题：方法的形参是接口类型，我们该传入的是什么？
        // 答案：传入的是该接口的实现类对象
        useInner(new InnerImpl());

        useInner(new Inner() {
            @Override
            public void show() {
                System.out.println("匿名内部类...show");
            }
        });
    }

    public static void useInner(Inner i) {
        i.show();
    }
}

interface Inner {
    void show();
}

class InnerImpl implements Inner {
    @Override
    public void show() {
        System.out.println("InnerImpl...show");
    }
}
