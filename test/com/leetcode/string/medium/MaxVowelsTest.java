package com.leetcode.string.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxVowelsTest {
    
    @Test
    public void testMaxVowels_BasicCase() {
        MaxVowels solution = new MaxVowels();
        int result = solution.maxVowels("abciiidef", 3);
        assertEquals(3, result);
    }
    
    @Test
    public void testMaxVowels_AllVowels() {
        MaxVowels solution = new MaxVowels();
        int result = solution.maxVowels("aeiou", 2);
        assertEquals(2, result);
    }
    
    @Test
    public void testMaxVowels_NoVowels() {
        MaxVowels solution = new MaxVowels();
        int result = solution.maxVowels("bcdfg", 3);
        assertEquals(0, result);
    }
    
    @Test
    public void testMaxVowels_MixedCase() {
        MaxVowels solution = new MaxVowels();
        int result = solution.maxVowels("leetcode", 3);
        assertEquals(2, result);
    }
    
    @Test
    public void testMaxVowels_LongerWindow() {
        MaxVowels solution = new MaxVowels();
        int result = solution.maxVowels("tryhard", 4);
        assertEquals(1, result);
    }
}