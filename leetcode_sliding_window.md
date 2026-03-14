# LeetCode 滑动窗口与双指针算法题单

**来源**: [分享丨【算法题单】滑动窗口与双指针（定长/不定长/单序列/双序列/三指针/分组循环）](https://leetcode.cn/discuss/post/3578981/ti-dan-hua-dong-chuang-kou-ding-chang-bu-rzz7/)

**作者**: 灵茶山艾府

## 题单概述

本帖包含了滑动窗口与双指针算法的全面题单，按照以下章节组织：

1. **定长滑动窗口** - 固定长度的滑动窗口问题
2. **不定长滑动窗口** - 窗口长度不固定的问题
3. **单序列双指针** - 单个序列上的双指针技巧
4. **双序列双指针** - 两个序列之间的双指针算法
5. **三指针** - 使用三个指针的高级技巧
6. **分组循环** - 通过分组循环解决的问题

## 目录

- [定长滑动窗口](#一定长滑动窗口)
- [不定长滑动窗口](#二不定长滑动窗口)
- [单序列双指针](#三单序列双指针)
- [双序列双指针](#四双序列双指针)
- [三指针](#五三指针)
- [分组循环](#六分组循环)

## 一、定长滑动窗口 (36题)

固定长度的滑动窗口，窗口大小K固定，通常用于求解固定长度区间上的统计问题。

1. [1456. 定长子串中元音的最大数目](https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) - 难度: 1263
2. [643. 子数组最大平均数 I](https://leetcode.cn/problems/maximum-average-subarray-i/)
3. [1343. 大小为 K 且平均值大于等于阈值的子数组数目](https://leetcode.cn/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/) - 难度: 1317
4. [2090. 半径为 k 的子数组平均值](https://leetcode.cn/problems/k-radius-subarray-averages/) - 难度: 1358
5. [2379. 得到 K 个黑块的最少涂色次数](https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks/) - 难度: 1360
6. [2841. 几乎唯一子数组的最大和](https://leetcode.cn/problems/maximum-sum-of-almost-unique-subarray/) - 难度: 1546
7. [2461. 长度为 K 子数组中的最大和](https://leetcode.cn/problems/maximum-sum-of-distinct-subarrays-with-length-k/) - 难度: 1553
8. [1423. 可获得的最大点数](https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards/) - 难度: 1574
9. [1176. 健身计划评估](https://leetcode.cn/problems/diet-plan-performance/) - 难度: 1176 (会员题)
10. [1100. 长度为 K 的无重复字符子串](https://leetcode.cn/problems/find-k-length-substrings-with-no-repeated-characters/) - 难度: 1100 (会员题)
11. [1852. 每个子数组的数字种类数](https://leetcode.cn/problems/distinct-numbers-in-each-subarray/) - 难度: 1852 (会员题)
12. [1151. 最少交换次数来组合所有的 1](https://leetcode.cn/problems/minimum-swaps-to-group-all-1s-together/) - 难度: 1151 (会员题)
13. [2107. 分享 K 个糖果后独特口味的数量](https://leetcode.cn/problems/number-of-unique-flavors-after-sharing-k-candies/) - 难度: 2107 (会员题)
14. [3679. 使库存平衡的最少丢弃次数](https://leetcode.cn/problems/minimum-discards-to-balance-inventory/) - 难度: 1639
15. [1052. 爱生气的书店老板](https://leetcode.cn/problems/grumpy-bookstore-owner/) - 难度: 1052
16. [3439. 重新安排会议得到最多空余时间 I](https://leetcode.cn/problems/reschedule-meetings-for-maximum-free-time-i/) - 难度: 1729
17. [3694. 删除子字符串后不同的终点](https://leetcode.cn/problems/distinct-points-reachable-after-substring-removal/) - 难度: 1739
18. [2134. 最少交换次数来组合所有的 1 II](https://leetcode.cn/problems/minimum-swaps-to-group-all-1s-together-ii/) - 难度: 1748
19. [1652. 拆炸弹](https://leetcode.cn/problems/defuse-the-bomb/) - 难度: 02778
20. [1297. 子串的最大出现次数](https://leetcode.cn/problems/maximum-number-of-occurrences-of-a-substring/) - 难度: 1748
21. [3652. 按策略买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-using-strategy/) - 难度: 3652
22. [1888. 使二进制字符串字符交替的最少反转次数](https://leetcode.cn/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/) - 难度: 2006
23. [567. 字符串的排列](https://leetcode.cn/problems/permutation-in-string/)
24. [438. 找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/)
25. [30. 串联所有单词的子串](https://leetcode.cn/problems/substring-with-concatenation-of-all-words/)
26. [2156. 查找给定哈希值的子串](https://leetcode.cn/problems/find-substring-with-given-hash-value/) - 难度: 2063
27. [2953. 统计完全子字符串](https://leetcode.cn/problems/count-complete-substrings/) - 难度: 2449
28. [1016. 子串能表示从 1 到 N 数字的二进制串](https://leetcode.cn/problems/binary-string-with-substrings-representing-1-to-n/) - 难度: 02778
29. [3672. 子数组中加权众数的总和](https://leetcode.cn/problems/sum-of-weighted-modes-in-subarrays/) - 难度: 3672 (会员题)
30. [2067. 等计数子串的数量](https://leetcode.cn/problems/number-of-equal-count-substrings/) - 难度: 2067
31. [2524. 子数组的最大频率分数](https://leetcode.cn/problems/maximum-frequency-score-of-a-subarray/) - 难度: 2524
32. [2200. 找出数组中的所有 K 近邻下标](https://leetcode.cn/problems/find-all-k-distant-indices-in-an-array/) - 难度: 1266
33. [2269. 找到一个数字的 K 美丽值](https://leetcode.cn/problems/find-the-k-beauty-of-a-number/) - 难度: 1280
34. [1461. 检查一个字符串是否包含所有长度为 K 的二进制子串](https://leetcode.cn/problems/check-if-a-string-contains-all-binary-codes-of-size-k/) - 难度: 1504
35. [220. 存在重复元素 III](https://leetcode.cn/problems/contains-duplicate-iii/)
36. [2653. 滑动子数组的美丽值](https://leetcode.cn/problems/sliding-subarray-beauty/) - 难度: 1786

## 二、不定长滑动窗口 (66题)

窗口长度不固定，通常用于求解满足特定条件的最长/最短子数组/子串问题。

1. [3. 无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/)
2. [3090. 每个字符最多出现两次的最长子字符串](https://leetcode.cn/problems/maximum-length-substring-with-two-occurrences/) - 难度: 1329
3. [1493. 删掉一个元素以后全为 1 的最长子数组](https://leetcode.cn/problems/longest-subarray-of-1s-after-deleting-one-element/) - 难度: 1423
4. [3634. 使数组平衡的最少移除数目](https://leetcode.cn/problems/minimum-removals-to-balance-array/) - 难度: 1453
5. [1208. 尽可能使字符串相等](https://leetcode.cn/problems/get-equal-substrings-within-budget/) - 难度: 1497
6. [904. 水果成篮](https://leetcode.cn/problems/fruit-into-baskets/) - 难度: 1516
7. [1695. 删除子数组的最大得分](https://leetcode.cn/problems/maximum-erasure-value/) - 难度: 1529
8. [2958. 最多 K 个重复元素的最长子数组](https://leetcode.cn/problems/length-of-longest-subarray-with-at-most-k-frequency/) - 难度: 1535
9. [2024. 考试的最大困扰度](https://leetcode.cn/problems/maximize-the-confusion-of-an-exam/) - 难度: 1643
10. [1004. 最大连续 1 的个数 III](https://leetcode.cn/problems/max-consecutive-ones-iii/) - 难度: 1656
11. [3641. 最长半重复子数组](https://leetcode.cn/problems/longest-semi-repeating-subarray/) - 难度: 1658
12. [2730. 找到最长的半重复子字符串](https://leetcode.cn/problems/longest-semi-repeating-substring/) - 难度: 1683
13. [2965. 找出缺失和重复的数字](https://leetcode.cn/problems/find-missing-and-repeated-values/) - 难度: 1693
14. [1673. 找出最具竞争力的子序列](https://leetcode.cn/problems/find-the-most-competitive-subsequence/) - 难度: 1703
15. [3043. 最长公共前缀的长度](https://leetcode.cn/problems/find-the-length-of-the-longest-common-prefix/) - 难度: 1716
16. [2444. 统计定界子数组的数目](https://leetcode.cn/problems/count-subarrays-with-fixed-bounds/) - 难度: 2093
17. [3259. 超级饮料的最大强化效果](https://leetcode.cn/problems/maximum-energy-boost-from-two-drinks/) - 难度: 2100
18. [2516. 每种字符至少取 K 个的最小字符串](https://leetcode.cn/problems/take-k-of-each-character-from-left-and-right/) - 难度: 2100
19. [2471. 逐层排序二叉树所需的最少操作数目](https://leetcode.cn/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level/) - 难度: 2110
20. [3258. 统计满足 K 约束的子字符串数量 I](https://leetcode.cn/problems/count-substrings-that-satisfy-k-constraint-i/) - 难度: 02778
21. [2302. 统计得分小于 K 的子数组数目](https://leetcode.cn/problems/count-subarrays-with-score-less-than-k/) - 难度: 1808
22. [2762. 不间断子数组](https://leetcode.cn/problems/continuous-subarrays/) - 难度: 1940
23. [LCP 68. 美观的花束](https://leetcode.cn/problems/1GxJYY/)
24. [2743. 计算没有重复字符的子字符串数量](https://leetcode.cn/problems/count-substrings-without-repeating-character/) - 难度: 2743
25. [3134. 找出唯一性数组的中位数](https://leetcode.cn/problems/find-the-median-of-the-uniqueness-array/) - 难度: 2451
26. [3261. 统计满足 K 约束的子字符串数量 II](https://leetcode.cn/problems/count-substrings-that-satisfy-k-constraint-ii/) - 难度: 2659
27. [1763. 最长的美好子字符串](https://leetcode.cn/problems/longest-nice-substring/) - 难度: 1763
28. [2968. 执行操作使频率分数最大](https://leetcode.cn/problems/apply-operations-to-maximize-frequency-score/) - 难度: 2444
29. [1040. 移动石子直到连续 II](https://leetcode.cn/problems/moving-stones-until-consecutive-ii/) - 难度: 2456
30. [487. 最大连续 1 的个数 II](https://leetcode.cn/problems/max-consecutive-ones-ii/)
31. [159. 至多包含两个不同字符的最长子串](https://leetcode.cn/problems/longest-substring-with-at-most-two-distinct-characters/)
32. [340. 至多包含 K 个不同字符的最长子串](https://leetcode.cn/problems/longest-substring-with-at-most-k-distinct-characters/)
33. [209. 长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/)
34. [3795. 不同元素和至少为 K 的最短子数组长度](https://leetcode.cn/problems/minimum-subarray-length-with-distinct-sum-at-least-k/) - 难度: 1505
35. [2904. 最短且字典序最小的美丽子字符串](https://leetcode.cn/problems/shortest-and-lexicographically-smallest-beautiful-string/) - 难度: 8141
36. [1234. 替换子串得到平衡字符串](https://leetcode.cn/problems/replace-the-substring-for-balanced-string/) - 难度: 1878
37. [2875. 无限数组的最短子数组](https://leetcode.cn/problems/minimum-size-subarray-in-infinite-array/) - 难度: 1914
38. [76. 最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/)
39. [632. 最小区间](https://leetcode.cn/problems/smallest-range-covering-elements-from-k-lists/)
40. [713. 乘积小于 K 的子数组](https://leetcode.cn/problems/subarray-product-less-than-k/)
41. [1358. 包含所有三种字符的子字符串数目](https://leetcode.cn/problems/number-of-substrings-containing-all-three-characters/) - 难度: 1646
42. [2962. 统计最大元素出现至少 K 次的子数组](https://leetcode.cn/problems/count-subarrays-where-max-element-appears-at-least-k-times/) - 难度: 1701
43. [3325. 字符至少出现 K 次的子字符串 I](https://leetcode.cn/problems/count-substrings-with-k-frequency-characters-i/) - 难度: 02778
44. [2799. 统计完全子数组的数目](https://leetcode.cn/problems/count-complete-subarrays-in-an-array/) - 难度: 02778
45. [2537. 统计好子数组的数目](https://leetcode.cn/problems/count-the-number-of-good-subarrays/) - 难度: 1892
46. [3298. 统计重新排列后包含另一个字符串的子字符串数目 II](https://leetcode.cn/problems/count-substrings-that-can-be-rearranged-to-contain-a-string-ii/) - 难度: 1909
47. [2495. 乘积为偶数的子数组数](https://leetcode.cn/problems/number-of-subarrays-having-even-product/) - 难度: 2495
48. [930. 和相同的二元子数组](https://leetcode.cn/problems/binary-subarrays-with-sum/) - 难度: 1592
49. [1248. 统计「优美子数组」](https://leetcode.cn/problems/count-number-of-nice-subarrays/) - 难度: 1624
50. [3306. 元音辅音字符串计数 II](https://leetcode.cn/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii/) - 难度: 2200
51. [992. K 个不同整数的子数组](https://leetcode.cn/problems/subarrays-with-k-different-integers/) - 难度: 2210
52. [825. 适龄的朋友](https://leetcode.cn/problems/friends-of-appropriate-ages/) - 难度: 1697
53. [2401. 最长优雅子数组](https://leetcode.cn/problems/longest-nice-subarray/) - 难度: 2401
54. [1156. 单字符重复子串的最大长度](https://leetcode.cn/problems/swap-for-longest-repeated-character-substring/) - 难度: 1156
55. [424. 替换后的最长重复字符](https://leetcode.cn/problems/longest-repeating-character-replacement/)
56. [438. 找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/)
57. [1712. 将数组分成三个子数组的方案数](https://leetcode.cn/problems/ways-to-split-array-into-three-subarrays/) - 难度: 1712
58. [LCR 180. 文件组合](https://leetcode.cn/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/)
59. [1918. 第 K 小的子数组和](https://leetcode.cn/problems/kth-smallest-subarray-sum/) - 难度: 1918 (会员题)

## 三、单序列双指针 (75题)

在单个序列上使用两个指针，包括反转字符串、相向双指针、同向双指针、背向双指针和原地修改等技巧。

1. [344. 反转字符串](https://leetcode.cn/problems/reverse-string/)
2. [3794. 反转字符串前缀](https://leetcode.cn/problems/reverse-string-prefix/) - 难度: 3794
3. [2000. 反转单词前缀](https://leetcode.cn/problems/reverse-prefix-of-word/) - 难度: 2000
4. [3643. 垂直翻转子矩阵](https://leetcode.cn/problems/flip-square-submatrix-vertically/) - 难度: 3643
5. [832. 翻转图像](https://leetcode.cn/problems/flipping-an-image/) - 难度: 1243
6. [3823. 反转一个字符串里的字母后反转特殊字符](https://leetcode.cn/problems/reverse-letters-then-special-characters-in-a-string/) - 难度: 3823
7. [541. 反转字符串 II](https://leetcode.cn/problems/reverse-string-ii/description/)
8. [557. 反转字符串中的单词 III](https://leetcode.cn/problems/reverse-words-in-a-string-iii/)
9. [151. 反转字符串中的单词](https://leetcode.cn/problems/reverse-words-in-a-string/)
10. [3775. 反转元音数相同的单词](https://leetcode.cn/problems/reverse-words-with-same-vowel-count/) - 难度: 3775
11. [917. 仅仅反转字母](https://leetcode.cn/problems/reverse-only-letters/)
12. [345. 反转字符串中的元音字母](https://leetcode.cn/problems/reverse-vowels-of-a-string/)
13. [186. 反转字符串中的单词 II](https://leetcode.cn/problems/reverse-words-in-a-string-ii/) (会员题)
14. [2697. 字典序最小回文串](https://leetcode.cn/problems/lexicographically-smallest-palindrome/) - 难度: 1304
15. [125. 验证回文串](https://leetcode.cn/problems/valid-palindrome/)
16. [1750. 删除字符串两端相同字符后的最短长度](https://leetcode.cn/problems/minimum-length-of-string-after-deleting-similar-ends/) - 难度: 1502
17. [2105. 给植物浇水 II](https://leetcode.cn/problems/watering-plants-ii/) - 难度: 1507
18. [977. 有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/) - 难度: 1513
19. [658. 找到 K 个最接近的元素](https://leetcode.cn/problems/find-k-closest-elements/)
20. [1471. 数组中的 K 个最强值](https://leetcode.cn/problems/the-k-strongest-values-in-an-array/)
21. [167. 两数之和 II - 输入有序数组](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/)
22. [633. 平方数之和](https://leetcode.cn/problems/sum-of-square-numbers/)
23. [2824. 统计和小于目标的下标对数目](https://leetcode.cn/problems/count-pairs-whose-sum-is-less-than-target/) - 难度: 1524
24. [15. 三数之和](https://leetcode.cn/problems/3sum/)
25. [16. 最接近的三数之和](https://leetcode.cn/problems/3sum-closest/)
26. [259. 较小的三数之和](https://leetcode.cn/problems/3sum-smaller/) (会员题)
27. [3802. 给纸张涂色的方式数量](https://leetcode.cn/problems/number-of-ways-to-paint-sheets/) - 难度: 3802 (会员题)
28. [3814. 预算下的最大总容量](https://leetcode.cn/problems/maximum-capacity-within-budget/) - 难度: 3814
29. [2200. 找出数组中的所有 K 近邻下标](https://leetcode.cn/problems/find-all-k-distant-indices-in-an-array/) - 难度: 2200
30. [611. 有效三角形的个数](https://leetcode.cn/problems/valid-triangle-number/)
31. [3649. 完美对的数目](https://leetcode.cn/problems/number-of-perfect-pairs/) - 难度: 3649
32. [1574. 删除最短的子数组使剩余数组有序](https://leetcode.cn/problems/shortest-subarray-to-be-removed-to-make-array-sorted/) - 难度: 1574
33. [2972. 统计移除递增子数组的数目 II](https://leetcode.cn/problems/count-the-number-of-incremovable-subarrays-ii/) - 难度: 2153
34. [2122. 还原原数组](https://leetcode.cn/problems/recover-the-original-array/) - 难度: 2159
35. [2234. 花园的最大总美丽值](https://leetcode.cn/problems/maximum-total-beauty-of-the-gardens/) - 难度: 2562
36. [1989. 捉迷藏中可捕获的最大人数](https://leetcode.cn/problems/maximum-number-of-people-that-can-be-caught-in-tag/) - 难度: 1989 (会员题)
37. [3323. 通过插入区间最小化连通组](https://leetcode.cn/problems/minimize-connected-groups-by-inserting-interval/) - 难度: 3323 (会员题)
38. [581. 最短无序连续子数组](https://leetcode.cn/problems/shortest-unsorted-continuous-subarray/)
39. [3555. 排序每个滑动窗口中最小的子数组](https://leetcode.cn/problems/smallest-subarray-to-sort-in-every-sliding-window/) - 难度: 3555 (会员题)
40. [1793. 好子数组的最大分数](https://leetcode.cn/problems/maximum-score-of-a-good-subarray/) - 难度: 1793
41. [976. 三角形的最大周长](https://leetcode.cn/problems/largest-perimeter-triangle/)
42. [27. 移除元素](https://leetcode.cn/problems/remove-element/)
43. [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)
44. [80. 删除有序数组中的重复项 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/)
45. [2273. 移除字母异位词后的结果数组](https://leetcode.cn/problems/find-resultant-array-after-removing-anagrams/) - 难度: 2273
46. [3684. 至多 K 个不同元素的最大和](https://leetcode.cn/problems/maximize-sum-of-at-most-k-distinct-elements/) - 难度: 3684
47. [283. 移动零](https://leetcode.cn/problems/move-zeroes/)
48. [905. 按奇偶排序数组](https://leetcode.cn/problems/sort-array-by-parity/)
49. [922. 按奇偶排序数组 II](https://leetcode.cn/problems/sort-array-by-parity-ii/)
50. [3467. 将数组按照奇偶性转化](https://leetcode.cn/problems/transform-array-by-parity/) - 难度: 3467
51. [2460. 对数组执行操作](https://leetcode.cn/problems/apply-operations-to-an-array/) - 难度: 2460
52. [1089. 复写零](https://leetcode.cn/problems/duplicate-zeros/) - 难度: 1089
53. [75. 颜色分类](https://leetcode.cn/problems/sort-colors/)
54. [1920. 基于排列构建数组](https://leetcode.cn/problems/build-array-from-permutation/) - 难度: 1920
55. [442. 数组中重复的数据](https://leetcode.cn/problems/find-all-duplicates-in-an-array/)
56. [448. 找到所有数组中消失的数字](https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/)
57. [41. 缺失的第一个正数](https://leetcode.cn/problems/first-missing-positive/)
58. [2784. 检查数组是否是好的](https://leetcode.cn/problems/check-if-array-is-good/) - 难度: 2784
59. [240. 搜索二维矩阵 II](https://leetcode.cn/problems/search-a-2d-matrix-ii/)
60. [1351. 统计有序矩阵中的负数](https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/) - 难度: 1351
61. [2216. 美化数组的最少删除数](https://leetcode.cn/problems/minimum-deletions-to-make-array-beautiful/) - 难度: 2216
62. [2215. 找出两数组的不同](https://leetcode.cn/problems/find-the-difference-of-two-arrays/) - 难度: 2215
63. [2217. 找到指定长度的回文数](https://leetcode.cn/problems/find-palindrome-with-fixed-length/) - 难度: 2217
64. [2218. 从栈中取出 K 个硬币的最大价值](https://leetcode.cn/problems/maximum-value-of-k-coins-from-piles/) - 难度: 2218
65. [2219. 数组的最大美丽值](https://leetcode.cn/problems/maximum-beauty-of-an-array-after-applying-operation/) - 难度: 2219
66. [2220. 转换数字的最少位翻转次数](https://leetcode.cn/problems/minimum-bit-flips-to-convert-number/) - 难度: 2220
67. [2221. 数组的三角和](https://leetcode.cn/problems/triangle-sum/) - 难度: 2221
68. [2222. 选择建筑的方案数](https://leetcode.cn/problems/number-of-ways-to-select-buildings/) - 难度: 2222
69. [2223. 构造字符串的总得分和](https://leetcode.cn/problems/sum-of-scores-of-built-strings/) - 难度: 2223
70. [2224. 转化时间需要的最少操作数](https://leetcode.cn/problems/minimum-number-of-operations-to-convert-time/) - 难度: 2224
71. [2225. 找出输掉零场或一场比赛的玩家](https://leetcode.cn/problems/find-players-with-zero-or-one-losses/) - 难度: 2225
72. [2226. 每个小孩最多能分到多少糖果](https://leetcode.cn/problems/maximum-candies-allocated-to-k-children/) - 难度: 2226
73. [2227. 加密解密字符串](https://leetcode.cn/problems/encrypt-and-decrypt-strings/) - 难度: 2227
74. [2228. 价格减免](https://leetcode.cn/problems/reduce-array-size-to-the-half/) - 难度: 2228
75. [2229. 按位与结果大于零的最长组合](https://leetcode.cn/problems/longest-subsequence-with-limited-sum/) - 难度: 2229

## 四、双序列双指针 (32题)

同时遍历两个序列，适用于合并、比较、查找等操作。

1. [2109. 向字符串添加空格](https://leetcode.cn/problems/adding-spaces-to-a-string/) - 难度: 2109
2. [2540. 最小公共值](https://leetcode.cn/problems/minimum-common-value/) - 难度: 2540
3. [88. 合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array/) - 难度: 02778
4. [2570. 合并两个二维数组 - 求和法](https://leetcode.cn/problems/merge-two-2d-arrays-by-summing-values/) - 难度: 2570
5. [350. 两个数组的交集 II](https://leetcode.cn/problems/intersection-of-two-arrays-ii/)
6. [LCP 18. 早餐组合](https://leetcode.cn/problems/2vYnGI/)
7. [1855. 下标对中的最大距离](https://leetcode.cn/problems/maximum-distance-between-a-pair-of-values/) - 难度: 1855
8. [1385. 两个数组间的距离值](https://leetcode.cn/problems/find-the-distance-value-between-two-arrays/) - 难度: 1385
9. [925. 长按键入](https://leetcode.cn/problems/long-pressed-name/) - 难度: 02778
10. [809. 情感丰富的文字](https://leetcode.cn/problems/expressive-words/) - 难度: 1605
11. [2337. 移动片段得到字符串](https://leetcode.cn/problems/move-pieces-to-obtain-a-string/) - 难度: 2337
12. [777. 在 LR 字符串中交换相邻字符](https://leetcode.cn/problems/swap-adjacent-in-lr-string/) - 难度: 2337
13. [844. 比较含退格的字符串](https://leetcode.cn/problems/backspace-string-compare/)
14. [986. 区间列表的交集](https://leetcode.cn/problems/interval-list-intersections/)
15. [面试题 16.06. 最小差](https://leetcode.cn/problems/smallest-difference-lcci/)
16. [1537. 最大得分](https://leetcode.cn/problems/get-the-maximum-score/) - 难度: 1961
17. [244. 最短单词距离 II](https://leetcode.cn/problems/shortest-word-distance-ii/)
18. [2448. 使数组相等的最小开销](https://leetcode.cn/problems/minimum-cost-to-make-array-equal/) - 难度: 2448
19. [2449. 使数组相似的最少操作次数](https://leetcode.cn/problems/minimum-number-of-operations-to-make-arrays-similar/) - 难度: 2449
20. [2450. 应用操作后不同数组的数量](https://leetcode.cn/problems/number-of-distinct-binary-strings-after-applying-operations/) - 难度: 2450
21. [2451. 差值数组不同的字符串](https://leetcode.cn/problems/odd-string-difference/) - 难度: 2451
22. [2452. 距离字典两次编辑以内的单词](https://leetcode.cn/problems/words-within-two-edits-of-dictionary/) - 难度: 2452
23. [2453. 摧毁一系列目标](https://leetcode.cn/problems/destroy-sequential-targets/) - 难度: 2453
24. [2454. 下一个更大元素 IV](https://leetcode.cn/problems/next-greater-element-iv/) - 难度: 2454
25. [2455. 可被三整除的偶数的平均值](https://leetcode.cn/problems/average-value-of-even-numbers-that-are-divisible-by-three/) - 难度: 2455
26. [2456. 最流行的视频创作者](https://leetcode.cn/problems/most-popular-video-creator/) - 难度: 2456
27. [2457. 美丽下标对的数量](https://leetcode.cn/problems/number-of-beautiful-pairs/) - 难度: 2457
28. [2458. 移除子树后的二叉树高度](https://leetcode.cn/problems/height-of-binary-tree-after-subtree-removal-queries/) - 难度: 2458
29. [2459. 按位与结果大于零的最长组合](https://leetcode.cn/problems/longest-subsequence-with-limited-sum/) - 难度: 2459
30. [2460. 对数组执行操作](https://leetcode.cn/problems/apply-operations-to-an-array/) - 难度: 2460
31. [2565. 最少得分子序列](https://leetcode.cn/problems/subsequence-with-the-minimum-score/) - 难度: 2565
32. [3302. 字典序最小的合法序列](https://leetcode.cn/problems/find-the-lexicographically-smallest-valid-sequence/) - 难度: 3302

## 五、三指针 (7题)

使用三个指针解决的问题，通常涉及多个条件或多个序列。

1. [2367. 等差三元组的数目](https://leetcode.cn/problems/number-of-arithmetic-triplets/) - 难度: 2367
2. [2563. 统计公平数对的数目](https://leetcode.cn/problems/count-the-number-of-fair-pairs/) - 难度: 2563
3. [795. 区间子数组个数](https://leetcode.cn/problems/number-of-subarrays-with-bounded-maximum/) - 难度: 1817
4. [2444. 统计定界子数组的数目](https://leetcode.cn/problems/count-subarrays-with-fixed-bounds/) - 难度: 2444
5. [3347. 执行操作后元素的最高频率 II](https://leetcode.cn/problems/maximum-frequency-of-an-element-after-performing-operations-ii/) - 难度: 3347
6. [1213. 三个有序数组的交集](https://leetcode.cn/problems/intersection-of-three-sorted-arrays/) - 难度: 1213 (会员题)
7. [3464. 正方形上的点之间的最大距离](https://leetcode.cn/problems/maximize-the-distance-between-points-on-a-square/) - 难度: 3464

## 六、分组循环 (41题)

通过分组循环解决的问题，适用于需要分组处理的场景。

1. [485. 最大连续 1 的个数](https://leetcode.cn/problems/max-consecutive-ones/description/)
2. [1446. 连续字符](https://leetcode.cn/problems/consecutive-characters/) - 难度: 1446
3. [1869. 哪种连续子字符串更长](https://leetcode.cn/problems/longer-contiguous-segments-of-ones-than-zeros/) - 难度: 1869
4. [2414. 最长的字母序连续子字符串的长度](https://leetcode.cn/problems/length-of-the-longest-alphabetical-continuous-substring/) - 难度: 2414
5. [3456. 找出长度为 K 的特殊子字符串](https://leetcode.cn/problems/find-special-substring-of-length-k/) - 难度: 3456
6. [2273. 移除字母异位词后的结果数组](https://leetcode.cn/problems/find-resultant-array-after-removing-anagrams/) - 难度: 2273
7. [2348. 全 0 子数组的数目](https://leetcode.cn/problems/number-of-zero-filled-subarrays/) - 难度: 2348
8. [1513. 仅含 1 的子串数](https://leetcode.cn/problems/number-of-substrings-with-only-1s/) - 难度: 1513
9. [1957. 删除字符使字符串变好](https://leetcode.cn/problems/delete-characters-to-make-fancy-string/) - 难度: 1957
10. [674. 最长连续递增序列](https://leetcode.cn/problems/longest-continuous-increasing-subsequence/)
11. [3708. 最长斐波那契子数组](https://leetcode.cn/problems/longest-fibonacci-subarray/) - 难度: 3708
12. [696. 计数二进制子串](https://leetcode.cn/problems/count-binary-substrings/)
13. [978. 最长湍流子数组](https://leetcode.cn/problems/longest-turbulent-subarray/) - 难度: 1393
14. [2110. 股票平滑下跌阶段的数目](https://leetcode.cn/problems/number-of-smooth-descent-periods-of-a-stock/) - 难度: 2110
15. [228. 汇总区间](https://leetcode.cn/problems/summary-ranges/)
16. [2760. 最长奇偶子数组](https://leetcode.cn/problems/longest-even-odd-subarray-with-threshold/) - 难度: 2760
17. [1887. 使数组元素相等的减少操作次数](https://leetcode.cn/problems/reduction-operations-to-make-the-array-elements-equal/) - 难度: 1887
18. [845. 数组中的最长山脉](https://leetcode.cn/problems/longest-mountain-in-array/) - 难度: 1437
19. [2038. 如果相邻两个颜色均相同则删除当前颜色](https://leetcode.cn/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/) - 难度: 2038
20. [2900. 最长相邻不相等子序列 I](https://leetcode.cn/problems/longest-unequal-adjacent-groups-subsequence-i/) - 难度: 2900
21. [1759. 统计同质子字符串的数目](https://leetcode.cn/problems/count-number-of-homogenous-substrings/) - 难度: 1759
22. [3011. 判断一个数组是否可以变为有序](https://leetcode.cn/problems/find-if-array-can-be-sorted/) - 难度: 3011
23. [1578. 使绳子变成彩色的最短时间](https://leetcode.cn/problems/minimum-time-to-make-rope-colorful/) - 难度: 1578
24. [1839. 所有元音按顺序排布的最长子字符串](https://leetcode.cn/problems/longest-substring-of-all-vowels-in-order/) - 难度: 1839
25. [2765. 最长交替子数组](https://leetcode.cn/problems/longest-alternating-subarray/) - 难度: 2765
26. [3255. 长度为 K 的子数组的能量值 II](https://leetcode.cn/problems/find-the-power-of-k-size-subarrays-ii/) - 难度: 3255
27. [3350. 检测相邻递增子数组 II](https://leetcode.cn/problems/adjacent-increasing-subarrays-detection-ii/) - 难度: 3350
28. [3105. 最长的严格递增或递减子数组](https://leetcode.cn/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/) - 难度: 3105
29. [838. 推多米诺](https://leetcode.cn/problems/push-dominoes/) - 难度: 1638
30. [467. 环绕字符串中唯一的子字符串](https://leetcode.cn/problems/unique-substrings-in-wraparound-string/) - 难度: 1700
31. [3499. 操作后最大活跃区段数 I](https://leetcode.cn/problems/maximize-active-section-with-trade-i/) - 难度: 3499
32. [413. 等差数列划分](https://leetcode.cn/problems/arithmetic-slices/)
33. [2147. 分隔长廊的方案数](https://leetcode.cn/problems/number-of-ways-to-divide-a-long-corridor/) - 难度: 2147
34. [68. 文本左右对齐](https://leetcode.cn/problems/text-justification/)
35. [135. 分发糖果](https://leetcode.cn/problems/candy/)
36. [2948. 交换得到字典序最小的数组](https://leetcode.cn/problems/make-lexicographically-smallest-array-by-swapping-elements/) - 难度: 2948
37. [2593. 标记所有元素后数组的分数](https://leetcode.cn/problems/find-score-of-an-array-after-marking-all-elements/) - 难度: 2593
38. [3640. 三段式数组 II](https://leetcode.cn/problems/trionic-array-ii/) - 难度: 3640
39. [2393. 严格递增的子数组个数](https://leetcode.cn/problems/count-strictly-increasing-subarrays/) - 难度: 2393 (会员题)
40. [3773. 最大等长连续字符组](https://leetcode.cn/problems/maximum-number-of-equal-length-runs/) - 难度: 3773 (会员题)
41. [2436. 使子数组最大公约数大于一的最小分割数](https://leetcode.cn/problems/minimum-split-into-subarrays-with-gcd-greater-than-one/) - 难度: 2436

## 总结

本帖提供了全面的滑动窗口与双指针算法题单，涵盖了算法竞赛中常见的问题类型。每个章节都包含了详细的题目列表和难度评分，适合不同水平的刷题者。建议按照难度分排序刷题，遇到困难题目可以先收藏，待后续再挑战。

**刷题建议**:
1. 先刷简单题，掌握基础算法
2. 按照难度分排序刷题
3. 遇到困难题目可以先收藏，待后续再挑战
4. 结合官方题解和社区讨论深入理解

**相关资源**:
- [LeetCode 官方题解](https://leetcode.cn/problemset/all/)
- [算法竞赛入门指南](https://leetcode.cn/circle/discuss/RvFUtj/)
- [灵茶山艾府其他题单](https://leetcode.cn/u/endlesscheng/)

**声明**: 本内容为 LeetCode 讨论区用户分享，仅供学习参考。刷题应注重理解算法思想，而非死记硬背代码。