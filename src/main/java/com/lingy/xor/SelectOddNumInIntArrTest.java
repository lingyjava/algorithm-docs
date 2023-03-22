package com.lingy.xor;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author ly
 * @Date: 2022/9/22 11:26
 */
public class SelectOddNumInIntArrTest {

    @Test
    public void selectOne() {
        SelectOddNumInIntArr selectOneOddNumInIntArr = new SelectOneOddNumInIntArr();
        int[] arr = new int[] {6,6,51,2,3,51,2,3,3};
        System.out.println("oddNum : " + Arrays.toString(selectOneOddNumInIntArr.select(arr)));
    }

    @Test
    public void selectTwo() {
        SelectOddNumInIntArr selectTwoOddNumInIntArr = new SelectTwoOddNumInIntArr();
        int[] arr2 = new int[] {6,6,51,2,3,51,2,3,3,6};
        System.out.println("oddNum : " + Arrays.toString(selectTwoOddNumInIntArr.select(arr2)));
    }

}
