package com.itheima.myextends.constructor;

public class Test {
    /*
     * 除了 Object 类，在所有构造方法的第一行代码，都默认隐藏了一句话 super()
     * 通过这句话，访问父类的空参构造方法
     *
     * 细节：Java 当中所有的类，都直接或间接地继承 Object 类
     */
    public static void main(String[] args) {
        Zi z1 = new Zi();
        Zi z2 = new Zi(10);
    }
}

class Fu extends Object {
    public Fu() {
        super();
        System.out.println("Fu类的空参构造方法");
    }

    public Fu(int num) {
        System.out.println("Fu类的带参构造方法...");
    }
}

class Zi extends Fu {
    public Zi() {
        super();
        System.out.println("Zi类的空参构造方法");
    }

    public Zi(int num) {
        super();
        System.out.println("Zi类的带参构造方法...");
    }
}
