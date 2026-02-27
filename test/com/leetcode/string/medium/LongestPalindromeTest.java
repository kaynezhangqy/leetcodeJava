package com.leetcode.string.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {
    
    @Test
    public void testLongestPalindrome_BasicCase() {
        LongestPalindrome solution = new LongestPalindrome();
        String result = solution.longestPalindrome("babad");
        assertEquals("bab", result); // or "aba" is also valid
    }
    
    @Test
    public void testLongestPalindrome_EvenLength() {
        LongestPalindrome solution = new LongestPalindrome();
        String result = solution.longestPalindrome("cbbd");
        assertEquals("bb", result);
    }
    
    @Test
    public void testLongestPalindrome_SingleCharacter() {
        LongestPalindrome solution = new LongestPalindrome();
        String result = solution.longestPalindrome("a");
        assertEquals("a", result);
    }
    
    @Test
    public void testLongestPalindrome_AllSame() {
        LongestPalindrome solution = new LongestPalindrome();
        String result = solution.longestPalindrome("aaaa");
        assertEquals("aaaa", result);
    }
    
    @Test
    public void testLongestPalindrome_EmptyString() {
        LongestPalindrome solution = new LongestPalindrome();
        String result = solution.longestPalindrome("");
        assertEquals("", result);
    }
}