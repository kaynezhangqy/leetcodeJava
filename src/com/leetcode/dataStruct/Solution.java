package com.leetcode.dataStruct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    //1512
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            Integer value = mp.getOrDefault(num, 0);
            count += value;
            mp.put(num, value + 1);
        }
        return count;
    }

    //    2016
    public int maximumDifference(int[] nums) {
        int ans = 0;
        int preMin = Integer.MAX_VALUE;
        for (int v : nums) {
            ans = Math.max(ans, v - preMin);
            preMin = Math.min(preMin, v);

        }
        if (ans == 0) {
            return -1;
        }
        return ans;
    }

    //  121
    public int maxProfit(int[] prices) {
        int ans = 0;
        int preMin = Integer.MAX_VALUE;
        for (int v : prices) {
            ans = Math.max(ans, v - preMin);
            preMin = Math.min(preMin, v);

        }

        return ans;
    }

    //624
    public int maxDistance(List<List<Integer>> arrays) {
        int curMin = Integer.MAX_VALUE / 2;
        int curMax = Integer.MIN_VALUE / 2;
        int ans = 0;
        for (List<Integer> array : arrays) {
            ans = Math.max(ans,
                    Math.max(curMax - array.get(0), array.get(array.size() - 1) - curMin));
            curMax = Math.max(curMax, array.get(array.size() - 1));
            curMin = Math.min(curMin, array.get(0));
        }
        return ans;
    }
}

