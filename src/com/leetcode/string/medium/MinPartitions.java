package com.leetcode.string.medium;

/**
 * No.1689 Partitioning Into Minimum Number Of Deci-Binary Numbers
 * @see <a href="https://leetcode.cn/problems/partitioning-into-minimum-number-of-deci-binary-numbers/">LeetCode No.1689</a>
 */
public class MinPartitions {

    public int minPartitions(String n) {
        int mx = 0;
        for (int i = 0; i < n.length(); i++) {
            mx = Math.max(mx, n.charAt(i) - '0');
        }
        return mx;
    }
}
