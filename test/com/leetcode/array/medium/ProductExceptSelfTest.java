package com.leetcode.array.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ProductExceptSelfTest {

    @Test
    public void testProductExceptSelf_BasicCase() {
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] result = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }

    @Test
    public void testProductExceptSelf_WithZero() {
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] result = solution.productExceptSelf(new int[]{1, 0, 3, 4});
        assertArrayEquals(new int[]{0, 12, 0, 0}, result);
    }

    @Test
    public void testProductExceptSelf_NegativeNumbers() {
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] result = solution.productExceptSelf(new int[]{-1, 2, -3, 4});
        assertArrayEquals(new int[]{-24, 12, -8, 6}, result);
    }

    @Test
    public void testProductExceptSelf_TwoElements() {
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] result = solution.productExceptSelf(new int[]{3, 4});
        assertArrayEquals(new int[]{4, 3}, result);
    }

    @Test
    public void testProductExceptSelf_SingleElement() {
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] result = solution.productExceptSelf(new int[]{5});
        assertArrayEquals(new int[]{1}, result);
    }
}