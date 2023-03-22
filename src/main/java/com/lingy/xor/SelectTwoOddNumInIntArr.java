package com.lingy.xor;

/**
 * @author ly
 * @Date: 2022/9/22 11:35
 * @description 从整型数组中找两个出现奇数次的数
 */
public class SelectTwoOddNumInIntArr implements SelectOddNumInIntArr{

    @Override
    public int[] select(int[] arr) {
        int[] oddNum = new int[2];

        int xor = 0;
        for (int cur : arr) {
            xor ^= cur;
        }
        // 设出现奇数次的两个数为 x1 , x2 , 则 xor = x1 ^ x2;

        // ~ 取反码  , 对 反码+1 做 与运算（与运算,有0为0）, 可找到当前数二进制中最右位的1
        int rightOne = xor & (~xor + 1);

        // xor = x1 ^ x2 , 所以 xor 二进制中为 1 的位 x1 , x2 中必定一个为 1 ,一个为 0
        int x1 = 0;
        for (int cur : arr) {
            if ((cur & rightOne) != 0) {
                // rightOne这一二进制位为 0 则进入
                x1 ^= cur;
            }
        }

        int x2 = xor ^ x1;

        oddNum[0] = x1;
        oddNum[1] = x2;

        return oddNum;
    }
}
