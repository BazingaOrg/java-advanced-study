package com.itheima.template;

public class Test {
    /*
     * 模板设计模式：把抽象类整体就可以看做成一个模板，模板中不能决定的东西定义成抽象方法，让使用模板的类（继承抽象类的类）去重写抽象方法实现需求
     * 小结：模板设计模式的优势，模板已经定义了通用结构，使用者只需要关心自己需要实现的功能即可
     */
    public static void main(String[] args) {
        Tom t = new Tom();
        t.write();
    }
}
