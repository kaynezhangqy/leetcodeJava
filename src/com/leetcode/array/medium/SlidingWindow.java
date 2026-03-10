package com.leetcode.array.medium;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {

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
        for (int arrival : arrivals) {
            mx = Math.max(arrival, mx);
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

    //3694. 删除子字符串后不同的终点
    public int distinctPoints(String s, int k) {

        final int[][] DIRS = new int[128][];
        DIRS['L'] = new int[]{-1, 0};
        DIRS['R'] = new int[]{1, 0};
        DIRS['U'] = new int[]{0, 1};
        DIRS['D'] = new int[]{0, -1};
        int n = s.length();
        int x = 0, y = 0;

        Set<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            x += DIRS[c][0];
            y += DIRS[c][1];
            int left = i - k + 1;
            if (left < 0) {
                continue;
            }
            set.add((long) (x + n) << 20 | (y + n));
            char out = s.charAt(left);
            x -= DIRS[out][0];
            y -= DIRS[out][1];
        }
        return set.size();

    }

}
