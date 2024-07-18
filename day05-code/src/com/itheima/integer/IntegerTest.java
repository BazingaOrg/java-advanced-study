package com.itheima.integer;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "10,20,30,40,50,60,70,80,90,100";

        String[] sArr = s.split(",");

        int[] nums = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            nums[i] = Integer.parseInt(sArr[i]);
        }

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        System.out.println(max);
    }
}
