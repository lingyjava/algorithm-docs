package com.lingy.xor;

/**
 * @author ly
 * @Date: 2022/9/22 14:08
 *
 * 使用异或的性质交换两个值
 */
public class Swap {

    /*
    * 设两个值为 a , b
    * 使用如下三步完成值的交换,不产生临时变量。
    * a = a ^ b;
    *
    * b = a ^ b; 由第一步可得 b = a ^ b ^ b ; 根据异或性质(任何数异或自己为 0 , 0 异或任何数为任何数) ; b = a;
    *
    * a = a ^ b; 由第二步可得 a = a ^ b ^ a ; 同理可得 a = b;
    *
    * 注意：
    *   使用该方法时,a和b的数值可以相等,但必须是两个独立的内存区域,即内存地址不能相同。
    *   下标相等时相当于与自己在异或运算,导致会把下标为i和j的元素的值抹除为0。
    *   比如数组元素互换时,arr[i] = arr[i] ^ arr[j],i和j一定不能相等。
    * */

    public static void swap(int[] arr, int i, int j) {
        if (i == j || arr[i] == arr[j]) {
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void swap (int i , int j) {
        if (i == j) {
            return;
        }
        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
    }

}
