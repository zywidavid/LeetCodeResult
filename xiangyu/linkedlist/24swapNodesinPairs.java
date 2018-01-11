Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode cur = head;
        ListNode next = head;
        ListNode nNext = head;
        while (cur != null && cur.next != null) {
            next = cur.next;
            nNext = cur.next.next;

            next.next = cur;
            cur.next = nNext;
            prev.next = next;

            prev = cur;
            cur = nNext;
        }
        return dummy.next;
    }
}
