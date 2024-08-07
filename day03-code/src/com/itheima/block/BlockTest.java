package com.itheima.block;

public class BlockTest {
    /*
     * 代码块：使用 {} 括起来的代码被称为代码块
     * 分类：
     *     1. 局部代码块
     *         位置：方法中的一对大括号
     *         作用：限定变量的生命周期，提早释放内存
     *     2. 构造代码块
     *         位置：类中方法外的一对大括号
     *         特点：在创建对象，执行构造方法的时候，就会执行构造代码块（优先于构造方法）
     *         作用：将多个构造方法中，重复的代码，抽取到构造代码块中，从而提升代码的复用性
     *     3. 静态代码块
     *         位置：类中方法外的一对大括号，需要加入 static 关键字
     *         特点：随着类的加载而执行，因为类只加载一次，所以也就只执行一次
     *         作用：对数据进行初始化
     */
    public static void main(String[] args) {

        {
            int num = 10;
            System.out.println(num);
        }
        // System.out.println(num);
        System.out.println("结束");

        Student s1 = new Student();
        Student s2 = new Student("张三");
    }
}

class Student {
    static String school;

    static {
        school = "黑马程序员";
        System.out.println("static...Student类的静态代码块");
    }

    {
        System.out.println("Student类的构造代码块");
    }

    public Student() {
        System.out.println("Student类空参构造方法");
    }

    public Student(String name) {
        System.out.println("Student类带参构造方法");
    }
}
