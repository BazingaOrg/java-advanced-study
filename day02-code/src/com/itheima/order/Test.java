package com.itheima.order;

import java.util.Scanner;

public class Test {
    // ClassCastException: 在引用数据类型的强转中，【实际类型】和【目标类型】不匹配，就会出现此异常
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：1. 国内订单 2. 国外订单");

        OrderService orderService =   null;

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                orderService = new OrderServiceImpl();

                break;
            case 2:
                orderService = new OrderseasServiceImpl();
                break;
        }

        // instanceof: 对象名 instanceof 类名，判断一个对象是否是一个类的案例，通俗的理解：判断关键字左边的对象，是否是右边的类型，返回boolean类型结果
        if(orderService instanceof OrderseasServiceImpl) {
            OrderseasServiceImpl osi = (OrderseasServiceImpl) orderService;
            osi.checkIP();
        }

        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.paid();
    }
}
