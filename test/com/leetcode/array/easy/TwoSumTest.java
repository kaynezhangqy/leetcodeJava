package com.leetcode.array.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    
    @Test
    public void testTwoSum_BasicCase() {
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }
    
    @Test
    public void testTwoSum_WithDuplicates() {
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }
    
    @Test
    public void testTwoSum_SameElement() {
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }
    
    @Test
    public void testTwoSum_NegativeNumbers() {
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
        assertArrayEquals(new int[]{2, 4}, result);
    }
    
}
