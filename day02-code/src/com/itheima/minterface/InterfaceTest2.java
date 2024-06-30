package com.itheima.minterface;

import com.itheima.a.Inter;

public class InterfaceTest2 {
    /*
     * 接口成员的特点：
     * 1. 成员变量：只能定义常量，因为系统会默认加入三个关键字：public static final
     * 2. 成员方法：只能是抽象方法，因为系统会默认加入两个关键字：public abstract
     * 3. 构造方法：没有
     */
    public static void main(String[] args) {
        System.out.println(MyInter.NUM);
        System.out.println(Inter.INTER_NUM);
    }
}

interface MyInter {
    final static int NUM = 10;

    void show();
}