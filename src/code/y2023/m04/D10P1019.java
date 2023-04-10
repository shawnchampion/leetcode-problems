package code.y2023.m04;

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class D10P1019 {
    public int[] nextLargerNodes(ListNode head) {
        // 翻转链表
        ListNode n1 = head, n2 = n1.next;
        n1.next = null;
        while (n2 != null) {
            ListNode temp = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = temp;
        }
        head = n1;
        ListNode node = head;
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        // 维护单调栈
        while (node != null) {
            while (!deque.isEmpty() && deque.peek() <= node.val) {
                deque.pop();
            }
            if (deque.isEmpty()) {
                deque.push(node.val);
                result.add(0);
            } else {
                result.add(deque.peek());
                deque.push(node.val);
            }
            node = node.next;
        }
        Collections.reverse(result);
        return result.stream().mapToInt(i -> i).toArray();
    }

    static class ListNode {
        int val;
        ListNode next;
    }
}
