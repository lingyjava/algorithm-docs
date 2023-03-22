package com.lingy.sort;

/**
 * @author lingy
 * @description 选择排序
 * */
public class SelectionSort extends IntArrSortAbstract implements IntArrSort {

    @Override
     public int[] sort(int[] arr) {
         if (arr == null) {
             return null;
         }
         int len = arr.length;
         if (len < ARR_LEN_TWO) {
             return arr;
         }

         // 从第一位开始到倒数第二位,与其后面所有元素比较,得知当前位置正确的元素
         for (int i = 0; i < len - 1; i++) {
             int minIndex = i;
             for (int j = i + 1; j < len; j++) {
                 if (arr[minIndex] > arr[j]) {
                     minIndex = j;
                 }
             }
             swap(arr, i ,minIndex);
         }
         return arr;
     }
}
