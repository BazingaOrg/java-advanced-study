package com.itheima.myfinal;

public class FinalDemo {
    /*
     * final：修饰符，可用于修饰方法，类，变量
     * 特点：
     *      1. 修饰方法：表明该方法是最终方法，不能被重写
     *      2. 修饰类：表明该类是最终类，不能被继承
     *      3. 修饰变量：表明该变量是常量，不能再次被赋值
     *      final 修饰成员变量的命名规范：
     *          如果变量名是一个单词，所有字母大写，max MAX
     *          如果变量名是多个单词，所有字母大写，中间使用下划线分隔，maxValue MAX_VALUE
     * ----------------------------------------------------------------
     *      基本数据类型：数据值不可改变
     *      引用数据类型：地址值不可改变
     * ----------------------------------------------------------------
     *      final 修饰成员变量的注意事项：
     *          1. final 修饰成员变量，不允许修饰默认值
     *          2. final 修饰成员变量的初始化时机：（1）在定义的时候直接赋值（2）在构造方法中完成赋值
     */
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}

class Student {
    final int num;

    public Student() {
        num = 10;
    }
}

class Fu {
    public final void method() {
        System.out.println("父类中非常重要的方法，不希望被子类覆盖");
    }
}

class Zi extends Fu {
//    @Override
//    public void method() {
//        System.out.println("哈哈哈哈，功能被我干掉了");
//    }
}
