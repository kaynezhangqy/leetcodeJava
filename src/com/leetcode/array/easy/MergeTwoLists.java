package com.leetcode.array.easy;

import com.leetcode.common.ListNode;

/**
 * No.21 Merge Two Sorted Lists
 * @see <a href="https://leetcode.cn/problems/merge-two-sorted-lists/">LeetCode No.21</a>
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1; // 把 list1 加到新链表中
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2; // 拼接剩余链表
        return dummy.next;
    }
}
