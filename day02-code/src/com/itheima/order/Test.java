package com.itheima.order;

import java.util.Scanner;

public class Test {
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

        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.paid();
    }
}
