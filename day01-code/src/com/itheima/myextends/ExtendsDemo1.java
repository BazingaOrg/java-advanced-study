package com.itheima.myextends;

public class ExtendsDemo1 {
    /*
     *  继承：类与类之间产生关系（子父类关系），子类就可以直接使用父类中，非私有的成员
     */
    public static void main(String[] args) {
        Coder c1 = new Coder();
        c1.setName("张三");
        c1.setAge(24);
        c1.setSalary(10000);

        System.out.println(c1.getName() + "---" + c1.getAge() + "---" + c1.getSalary());
    }
}

class Employee {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

/*
 *  创建类的细节：一个.java文件中可以编写多个 class
 *  1. 保证类与类之间是平级关系
 *  2. 只能有一个被 public 修饰
 */
class Coder extends Employee {
}

class Manager extends Employee {
}
