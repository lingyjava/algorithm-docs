package com.lingy.sort;

/**
 * @author ly
 * @Date: 2022/9/22 10:34
 * @description 插入排序
 */
public class InsertionSort  extends IntArrSortAbstract implements IntArrSort {

    @Override
    public int[] sort(int[] arr) {
        if (arr == null) {
            return null;
        }
        int len = arr.length;
        if (len < ARR_LEN_TWO) {
            return arr;
        }

        // 使 0 ~ i 有序, 从 i 开始往回比较相邻的元素。
        // 当需要交换时继续循环。
        // 若不需要交换时, 因前面的元素有序,所以不用继续比较。
        for (int i = 1; i < len; i++) {

            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
        return arr;
    }
}
