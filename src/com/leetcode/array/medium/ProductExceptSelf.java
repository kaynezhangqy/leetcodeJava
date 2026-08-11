package com.leetcode.array.medium;


/**
 * No.238 Product of Array Except Self
 * @see <a href="https://leetcode.cn/problems/product-of-array-except-self/">LeetCode No.238</a>
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }
}