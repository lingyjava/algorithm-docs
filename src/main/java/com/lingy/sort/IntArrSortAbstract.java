package com.lingy.sort;

/**
 * @author ly
 * @Date: 2022/9/22 9:08
 */
public abstract class IntArrSortAbstract {

    protected final static int ARR_LEN_TWO = 2;

    protected void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
