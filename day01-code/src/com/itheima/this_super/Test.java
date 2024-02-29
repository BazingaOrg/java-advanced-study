package com.itheima.this_super;

public class Test {
    /*
     * 开闭原则：对功能扩展开放，对修改代码关闭
     */
    public static void main(String[] args) {
        A a1 = new A(10, 20, 30);
        A a2 = new A(11, 21, 31);

        A a3 = new A(12, 22, 32, 33);
    }
}

/*
 * 项目 1.0 版本：有3个成员变量
 * 项目 1.1 版本：新增一个成员变量
 */
class A {
    int a;
    int b;
    int c;
    int d;

    public A() {
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A(int a, int b, int c, int d) {
        this(a, b, c);
        this.d = d;
    }
}
