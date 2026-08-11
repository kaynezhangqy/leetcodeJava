package com.leetcode.top100;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    // No.448 Find All Numbers Disappeared in an Array - https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % nums.length;
            if (nums[x] <= n) {
                nums[x] += n;
            }
        }
        List<Integer> res = new ArrayList<>();

        for (int i : nums) {
            if (nums[i] <= nums.length) {
                res.add(i + 1);
            }
        }
        return res;
    }

    // No.5 Longest Palindromic Substring - https://leetcode.cn/problems/longest-palindromic-substring/
    public String longestPalindrome(String s) {
        if (s == null) {
            return "";
        }
        String res = "";
        if (s.length() <= 1) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            String t1 = expander(s, i, i);
            if (t1.length() > res.length()) {
                res = t1;
            }
            String t2 = expander(s, i, i + 1);
            if (t2.length() > res.length()) {
                res = t2;
            }
        }
        return res;
    }

    private String expander(String s, int l, int r) {
        if (s == null) {
            return "";
        }
        int sSize = s.length();
        while (l >= 0 && r < sSize && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }


}