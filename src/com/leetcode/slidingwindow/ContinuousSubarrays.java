package com.leetcode.slidingwindow;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class ContinuousSubarrays {

    // No.2762 Continuous Subarrays - https://leetcode.cn/problems/continuous-subarrays/
    public long continuousSubarraysV2(int[] nums) {
        long ans = 0;
        Deque<Integer> minQ = new LinkedList<>();
        Deque<Integer> maxQ = new LinkedList<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            int v = nums[right];

            while (!minQ.isEmpty() && nums[minQ.peekLast()] > v) {
                minQ.pollLast();
            }
            minQ.addLast(right);
            // 维护递减队列（最大值在队首）
            while (!maxQ.isEmpty() && nums[maxQ.peekLast()] < v) {
                maxQ.pollLast();
            }
            maxQ.addLast(right);

            // 先移除已过期元素（索引小于left），再检查窗口是否满足条件
            while (!minQ.isEmpty() && minQ.peekFirst() < left) {
                minQ.pollFirst();
            }
            while (!maxQ.isEmpty() && maxQ.peekFirst() < left) {
                maxQ.pollFirst();
            }
            while (!minQ.isEmpty() && !maxQ.isEmpty()
                    && nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > 2) {
                // 移动左边界
                left++;
                // 移除因left移动而过期的元素
                while (!minQ.isEmpty() && minQ.peekFirst() < left) {
                    minQ.pollFirst();
                }
                while (!maxQ.isEmpty() && maxQ.peekFirst() < left) {
                    maxQ.pollFirst();
                }
            }
            ans += (right - left + 1);
        }

        return ans;

    }

    // No.2762 Continuous Subarrays - https://leetcode.cn/problems/continuous-subarrays/
    public long continuousSubarrays(int[] nums) {
        long ans = 0;
        int left = 0;
        Map<Integer, Integer> cnt = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int v = nums[right];
            cnt.put(v, cnt.getOrDefault(v, 0) + 1);
            while (true) {
                int mx = Integer.MIN_VALUE;
                int mn = Integer.MAX_VALUE;
                for (int key : cnt.keySet()) {
                    mn = Math.min(mn, key);
                    mx = Math.max(mx, key);

                }
                if (mx - mn <= 2) {
                    break;
                }
                int out = nums[left];
                cnt.put(out, cnt.get(out) - 1);
                if (cnt.get(out) == 0) {
                    cnt.remove(out);
                }
                left++;
            }
            ans += (right - left + 1);

        }
        return ans;
    }

    // No.2134 Minimum Swaps to Group All 1's Together II - https://leetcode.cn/problems/minimum-swaps-to-group-all-1s-together-ii/
    public int minSwaps(int[] nums) {
        int k = 0;
        for (int num : nums) {
            k += num;
        }
        //如果没有1 直接返回0
        if (k == 0) {
            return 0;
        }
        int n = nums.length;
        int max1 = 0;
        int cnt1 = 0;
        for (int i = 0; i < n + k - 1; i++) {
            cnt1 += nums[i % n];
            //没到窗口的长度 一直加
            if (i >= k - 1) {
                max1 = Math.max(max1, cnt1);
                cnt1 -= nums[i - k + 1];
            }
        }
        return k - max1;

    }

    // No.3 Longest Substring Without Repeating Characters - https://leetcode.cn/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int[] mp = new int[128];

        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            mp[s.charAt(i) - '0']++;
            while (mp[s.charAt(i) - '0'] > 1) {
                mp[s.charAt(l) - '0']--;
                l += 1;
            }
            res = Math.max(res, i - l + 1);
        }
        return res;
    }

    // No.3325 Count Substrings With K-Frequency Characters I - https://leetcode.cn/problems/count-substrings-with-k-frequency-characters-i/
    public long countSubarrays(int[] nums, long k) {

        int left = 0;
        long sum = 0;
        int count = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            left++;

            while (sum * (r - left + 1) >= k && left <= r) {
                sum -= nums[left];
                left++;

            }
            count += (r - left + 1);
        }
        return count;

    }
}