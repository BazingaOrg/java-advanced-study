package com.itheima.arrays.test;

import java.util.Arrays;

public class SelectSort {
    /*
     * 选择排序：从 0 索引开始，拿着每一个索引上的元素跟后面的元素依次比较
     */
    public static void main(String[] args) {
        int[] arr = {22, 55, 11, 44, 33};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
