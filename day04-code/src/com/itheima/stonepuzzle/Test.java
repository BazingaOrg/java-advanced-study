package com.itheima.stonepuzzle;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(514, 595);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("石头迷阵单机版V1.0");
        // 设置窗体置顶
        frame.setAlwaysOnTop(true);
        // 设置窗体居中
        frame.setLocationRelativeTo(null);
        // 取消默认布局
        frame.setLayout(null);

        frame.setVisible(true);
    }
}
