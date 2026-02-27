package com.leetcode.array.easy;

/**
 * Two Sum - LeetCode Problem 1 (Alternative Solution)
 * 
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * This implementation also uses a brute force approach with O(n²) time complexity.
 */
public class Solution1_twoSum {

  /**
   * Finds two numbers in the array that add up to the target using brute force.
   * 
   * @param nums the input array of integers
   * @param target the target sum
   * @return an array containing the indices of the two numbers, or empty array if no solution
   */
  public int[] twoSum(int[] nums, int target) {
    // Brute force approach: check all possible pairs
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    
    // Return empty array if no solution found
    return new int[]{};
  }

}