package com.itheima.test;

public class Manager extends Employee {
    private int prize;

    public Manager() {
    }

    public Manager(String name, int age, int salary, int prize) {
        super(name, age, salary);
        this.prize = prize;
    }

    /**
     * 获取
     * @return prize
     */
    public int getPrize() {
        return prize;
    }

    /**
     * 设置
     * @param prize
     */
    public void setPrize(int prize) {
        this.prize = prize;
    }

    public void work() {
        System.out.println("姓名为" + super.getName() + "，年龄为" + super.getAge() + "岁，工资为" + super.getSalary() + "，奖金为" + this.prize + "的经理正在分配任务...");
    }
}
