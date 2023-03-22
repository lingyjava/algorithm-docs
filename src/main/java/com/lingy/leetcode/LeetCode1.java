package com.lingy.leetcode;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ly
 * @apiNote  <a href = "https://leetcode.cn/problems/two-sum/">LeetCode1</a>
 */
public class LeetCode1 implements Solution {

    @Test
    @Override
    public void solution() {
        int[]  arr = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = base(arr, target);
        System.out.println(Arrays.toString(result));
    }

    /**
     * 暴力枚举
     * */
    public int[] base(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    /**
     * 哈希表
     * */
    public int[] hashTable(int[] nums, int target) {
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[] {i , hashTable.get(target - nums[i])};
            }
            hashTable.put(nums[i], i);
        }
        return null;
    }
}
