package com.lingy.leetcode;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.*;

/**
 * @author lingy
 * @apiNote <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/">LeetCode26</a>
 */
public class LeetCode26 implements Solution {

    @Test
    @Override
    public void solution() {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = doublePointer(arr);
        System.out.println(result);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * 双指针
     * */
    public int doublePointer(int[] nums) {
        if (Objects.isNull(nums) || nums.length < 1) {
            return 0;
        }
        int fast = 1, slow = 1, len = nums.length;
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
