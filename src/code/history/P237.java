package code.history;

public class P237 {
    public static void main(String[] args) {

    }

    /**
     * Definition for singly-linked list.
     */

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}