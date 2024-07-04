package com.itheima.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择支付方式：1. 支付平台支付 2. 银行卡网银支付 3. 信用卡快捷支付");
        System.out.println("请输入您的支付方式：");
        int choice = sc.nextInt();

        Payment pay = null;

        switch (choice) {
            case 1:
                pay = new PlatformPaymentImpl();
                break;
            case 2:
                pay = new BankcardPaymentImpl();
                break;
            case 3:
                pay = new CreditCardPaymentImpl();
                break;
            default:
                break;
        }

        System.out.println("请输入您的支付金额：");
        double money = sc.nextDouble();
        pay.pay(money);
    }
}
