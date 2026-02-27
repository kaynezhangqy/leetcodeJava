package com.leetcode.string.medium;

/**
 * Maximum Number of Vowels in a Substring of Given Length - LeetCode Problem 1456
 * 
 * Given a string s and an integer k, return the maximum number of vowel letters 
 * in any substring of s with length k.
 * 
 * This implementation uses a sliding window approach with O(n) time complexity.
 */
public class MaxVowels {
  
  /**
   * Finds the maximum number of vowels in any substring of length k.
   * 
   * @param s the input string
   * @param k the length of the substring
   * @return the maximum number of vowels in any substring of length k
   */
  public int maxVowels(String s, int k) {
    char[] chars = s.toCharArray();
    int res = 0;
    int curVowels = 0;
    
    // Use sliding window to count vowels
    for (int i = 0; i < chars.length; i++) {
      // Add current character if it's a vowel
      if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
        curVowels++;
      }
      
      // Skip until window reaches size k
      if (i < k - 1) {
        continue;
      }
      
      // Update result with current window's vowel count
      res = Math.max(res, curVowels);
      
      // Remove the character that's sliding out of the window
      char out = chars[i - k + 1];
      if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u') {
        curVowels--;
      }
    }
    
    return res;
  }
}