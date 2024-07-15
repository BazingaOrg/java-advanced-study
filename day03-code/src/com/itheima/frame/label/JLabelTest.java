package com.itheima.frame.label;

import javax.swing.*;

public class JLabelTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(512, 512);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel jl1 = new JLabel("听君一席话");
        jl1.setBounds(50, 50, 100, 100);
        frame.getContentPane().add(jl1);

        frame.setVisible(true);
    }
}
