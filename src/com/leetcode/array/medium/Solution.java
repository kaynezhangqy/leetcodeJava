package com.leetcode.array.medium;

public class Solution {

    // 1423. 可获得的最大点数
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int m = n - k;
        int s = 0;
        for (int i = 0; i < m; i++) {
            s += cardPoints[i];
        }
        int total = s;
        int minS = s;
        for (int i = m; i < n; i++) {
            total += cardPoints[i];
            s += cardPoints[i] - cardPoints[i - m];
            minS = Math.min(s, minS);
        }
        return total - minS;
    }


    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int mx = 0;
        int n = arrivals.length;
        for (int i = 0; i < n; i++) {
            mx = Math.max(arrivals[i], mx);
        }
        int[] cnt = new int[mx + 1];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (cnt[arrivals[i]] == m) {
                count++;
                arrivals[i] = 0;
            } else {
                cnt[arrivals[i]]++;
            }
            //左端点元素离开窗口
            int left = i + 1 - w;
            if (left >= 0) {
                cnt[arrivals[left]]--;
            }
        }
        return count;
    }
}
