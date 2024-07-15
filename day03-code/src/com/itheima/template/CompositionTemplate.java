package com.itheima.template;

public abstract class CompositionTemplate {
    public final void write() {
        System.out.println("模板开头");

        body();

        System.out.println("模板结尾");
    }

    public abstract void body();
}
