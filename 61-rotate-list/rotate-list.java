/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and tail
        int length = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Reduce unnecessary rotations
        k = k % length;

        if (k == 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move fast k steps ahead
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        // Move both until fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Rotate
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }
}