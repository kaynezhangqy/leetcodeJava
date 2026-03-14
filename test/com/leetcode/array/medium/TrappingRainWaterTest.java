package com.leetcode.array.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {

    @Test
    public void testTrap_BasicCase() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = solution.trap(height);
        assertEquals(6, result);
    }

    @Test
    public void testTrap_EmptyArray() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {};
        int result = solution.trap(height);
        assertEquals(0, result);
    }

    @Test
    public void testTrap_NullArray() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = null;
        int result = solution.trap(height);
        assertEquals(0, result);
    }

    @Test
    public void testTrap_SingleElement() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {5};
        int result = solution.trap(height);
        assertEquals(0, result);
    }

    @Test
    public void testTrap_TwoElements() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {3, 4};
        int result = solution.trap(height);
        assertEquals(0, result);
    }

    @Test
    public void testTrap_AllSameHeight() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {2, 2, 2, 2};
        int result = solution.trap(height);
        assertEquals(0, result);
    }

    @Test
    public void testTrap_DescendingOrder() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {5, 4, 3, 2, 1};
        int result = solution.trap(height);
        assertEquals(0, result);
    }

    @Test
    public void testTrap_AscendingOrder() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {1, 2, 3, 4, 5};
        int result = solution.trap(height);
        assertEquals(0, result);
    }

    @Test
    public void testTrap_ExampleFromLeetCode() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = solution.trap(height);
        assertEquals(6, result);
    }

    @Test
    public void testTrap_AnotherExample() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {4, 2, 0, 3, 2, 5};
        int result = solution.trap(height);
        assertEquals(9, result);
    }
}