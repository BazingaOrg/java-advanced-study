package com.itheima.arrays.test;

import java.util.Arrays;

public class BubbleSort {
    /*
     * 冒泡排序：相邻的两个数进行比较，如果第一个比第二个大，就交换他们两个
     */
    public static void main(String[] args) {
        int[] arr = {22, 44, 55, 11, 33};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
