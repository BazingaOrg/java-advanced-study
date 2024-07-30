package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest1 {
    /*
     * 需求：计算你来到了这个世界多少天？
     */
    public static void main(String[] args) throws ParseException {
        // 1. 键盘录入用户的生日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生年月日：xxxx年xx月xx日");
        String birth = sc.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthDate = simpleDateFormat.parse(birth);

        Date todayDate = new Date();

        long mils = todayDate.getTime() - birthDate.getTime();
        long days = mils / 1000 / 60 / 60 / 24 / 365;

        System.out.println("您来到了这个世界多少天:" + days);

    }
}
