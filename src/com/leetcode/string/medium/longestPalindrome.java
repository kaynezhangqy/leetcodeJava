package com.leetcode.string.medium;


public class LongestPalindrome {

    /**
     * Finds the longest palindromic substring in the given string.
     *
     * @param s the input string
     * @return the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        String res = "";

        // Handle edge cases
        if (s.length() <= 1) {
            return s;
        }

        // Check every possible center
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (center at i)
            String t1 = expander(s, i, i);
            if (t1.length() > res.length()) {
                res = t1;
            }

            // Check for even-length palindromes (center between i and i+1)
            String t2 = expander(s, i, i + 1);
            if (t2.length() > res.length()) {
                res = t2;
            }
        }

        return res;
    }

    private String expander(String s, int l, int r) {
        int sSize = s.length();

        // Expand while characters match and indices are within bounds
        while (l >= 0 && r < sSize && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        // Return the palindrome substring
        return s.substring(l + 1, r);
    }
}