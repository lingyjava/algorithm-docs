package com.lingy.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author ly
 * @Date: 2022/9/22 8:58
 * @description 对数器
 */
public class Logarithm {

    private final int TEST_TIME = 500000;
    private final int MAX_SIZE = 100;
    private final int MAX_VALUE = 100;

    public boolean logarithm(IntArrSort intArrSort) {
        boolean succeed = true;
        for (int i = 0; i < TEST_TIME; i++) {
            int[] arr1 = generateRandomArray(MAX_SIZE,MAX_VALUE);
            int[] arr2 = copyArray(arr1);
            int[] arr3 = intArrSort.sort(arr1);
            comparator(arr2);
            if (!isEqual(arr2,arr3)){
                System.out.println("SortIndex  : " + i);
                System.out.println("BeSortArr  : " + Arrays.toString(arr1));
                System.out.println("SystemSort : " + Arrays.toString(arr2));
                System.out.println("ErrorSort  : " + Arrays.toString(arr3));
                succeed = false;
                break;
            }
        }
        return succeed;
    }

    /**
     * 生成长度随机元素随机的随机数组
     * */
    private int[] generateRandomArray(int maxSize, int maxValue){
        //Math.random()  [0,1)的小数
        //Math.random() * N  [0,N)的小数
        //(int) Math.random() * N  [0,N-1)的整数

        //长度随机
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            //值随机
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    /**
     * 使用系统提供的排序方法,保证结果一定正确
     * */
    private void comparator(int[] arr){
        Arrays.sort(arr);
    }

    /**
     * 复制一个完全相同的数组
     * */
    private int[] copyArray(int[] arr){
        if (arr == null){
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    /**
     * 判断两个数组是否相等
     * */
    private boolean isEqual(int[] arr1,int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
