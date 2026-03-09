package com.leetcode.string.medium;


public class MaxVowels {


    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int res = 0;
        int curVowels = 0;

        // Use sliding window to count vowels
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o'
                    || chars[i] == 'u') {
                curVowels++;
            }

            if (i < k - 1) {
                continue;
            }

            res = Math.max(res, curVowels);

            char out = chars[i - k + 1];
            if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u') {
                curVowels--;
            }
        }

        return res;
    }
}