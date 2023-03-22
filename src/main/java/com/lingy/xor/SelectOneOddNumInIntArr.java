package com.lingy.xor;

/**
 * @author ly
 * @Date: 2022/9/22 11:26
 */
public class SelectOneOddNumInIntArr implements SelectOddNumInIntArr {
    @Override
    public int[] select(int[] arr) {
        int[] oddNum = new int[1];

        int x = 0;
        for (int cur : arr) {
            x ^= cur;
        }
        oddNum[0] = x;
        return oddNum;
    }
}
