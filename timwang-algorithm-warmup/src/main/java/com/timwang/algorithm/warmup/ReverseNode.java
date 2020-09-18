package com.timwang.algorithm.warmup;

/**
 * @author wangjun
 * @date 2020-09-16
 */
public class ReverseNode {

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        reverse(ListNode.of());
    }
}
