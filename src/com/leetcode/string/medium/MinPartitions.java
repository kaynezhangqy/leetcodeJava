package com.leetcode.string.medium;

public class MinPartitions {

    public int minPartitions(String n) {
        int mx = 0;
        for (int i = 0; i < n.length(); i++) {
            mx = Math.max(mx, n.charAt(i) - '0');
        }
        return mx;
    }
}
