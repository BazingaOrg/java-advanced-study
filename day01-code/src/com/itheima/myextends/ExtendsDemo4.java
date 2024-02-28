package com.itheima.myextends;

public class ExtendsDemo4 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.methodC();
        c1.methodB();
        c1.methodA();
    }
}

// Java 只支持单继承，不支持多继承，但支持多层继承
class A {
    public void methodA() {
        System.out.println("a...");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("b...");
    }
}

class C extends B {
    public void methodC() {
        System.out.println("c...");
    }
}
