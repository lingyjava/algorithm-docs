package com.lingy.leetcode;

import com.lingy.api.Solution;
import org.junit.Test;

/**
 * @author lingy
 * @apiNote <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/">LeetCode122</a>
 */
public class LeetCode122 implements Solution {

    @Test
    @Override
    public void solution() {
        int[] prices = {7,6,4,3,1};
        int result = dp(prices);
        System.out.println(result);
    }
    /**
     *
     * 动态规划
     * */
    public int dp(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

}
