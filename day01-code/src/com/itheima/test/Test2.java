package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        Coder c = new Coder("张三", 30, 15000);
        c.work();

        Manager m = new Manager("李四", 40, 18000, 5000);
        m.work();
    }
}
