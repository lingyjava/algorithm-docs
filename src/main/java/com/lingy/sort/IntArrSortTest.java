package com.lingy.sort;

import org.junit.Test;

/**
 * @author ly
 * @Date: 2022/9/22 9:12
 */
public class IntArrSortTest {

    @Test
    public void intArrSort() {
        Logarithm logarithm = new Logarithm();
        System.out.print("SortStatus : ");
        if (logarithm.logarithm(new SelectionSort())) {
            System.out.println("SortStatus : Success!");
        }else {
            System.out.println("SortStatus : Error!");
        }
    }
}
