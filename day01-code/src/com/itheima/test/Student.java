package com.itheima.test;

public class Student extends Person {
    private double grade;
    public Student() {
    }

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student(int grade) {
        this.grade = grade;
    }

    /**
     * 获取
     * @return grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * 设置
     * @param grade
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void study() {
        System.out.println("姓名为" + super.getName() + "，年龄为" + super.getAge() + "岁，成绩为" + this.grade + "分的学生正在学习");
    }
}
