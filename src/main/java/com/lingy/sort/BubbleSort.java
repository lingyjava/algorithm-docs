package com.lingy.sort;

/**
 * @author ly
 * @Date: 2022/9/22 11:03
 * @description 冒泡排序
 */
public class BubbleSort extends IntArrSortAbstract implements IntArrSort{
    @Override
    public int[] sort(int[] arr) {
        if (arr == null) {
            return null;
        }
        int len = arr.length;
        if (len < ARR_LEN_TWO) {
            return arr;
        }

        // 从第一位开始
        for (int i = 0; i < len - 1; i++) {

            // 从最后一位元素比较, 直到 index =  i
            for (int j = len - 1; j > i; j--) {
                if (arr[i] > arr[j]) {
                    swap(arr, i ,j);
                }
            }
        }
        return arr;
    }

    @Override
    protected void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
