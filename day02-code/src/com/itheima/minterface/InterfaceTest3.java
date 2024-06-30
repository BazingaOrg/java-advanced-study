package com.itheima.minterface;

interface InterA {
    void showInterA();
}

interface InterB {
    void showInterB();
}

interface InterC extends InterA, InterB {
    void showInterC();
}

class InterCImpl implements InterC {

    @Override
    public void showInterA() {

    }

    @Override
    public void showInterB() {

    }

    @Override
    public void showInterC() {

    }
}

public class InterfaceTest3 {
    /*
     * 接口和类之间的关系：
     * 1. 类和类之间：继承关系，只支持单继承，不支持多继承，但是可以多层继承
     * 2. 类和接口之间：实现关系，可以单实现，也可以多实现，甚至可以在继承一个类的同时，实现多个接口
     * 3. 接口和接口之间：继承关系，可以单继承，也可以多继承
     */
    public static void main(String[] args) {

    }
}

interface A {
    void show();
}

interface B {
    void show();
}

class ABImpl implements A, B {

    @Override
    public void show() {

    }
}

class Fu {
    public void show() {
        System.out.println("Fu...show");
    }
}

class Zi extends Fu implements A, B {
}
