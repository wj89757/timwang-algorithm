package com.timwang.algorithm.warmup.node;

/**
 * @author wangjun
 * @date 2019-12-10
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListNode{");
        sb.append("val=").append(val);
        sb.append(", next=").append(next);
        sb.append('}');
        return sb.toString();
    }

    public static ListNode of() {
        ListNode one = new ListNode(1);
        one.next = new ListNode(2);
        one.next.next = new ListNode(3);
        one.next.next.next = new ListNode(4);
        one.next.next.next.next = new ListNode(5);
        return one;
    }
}
