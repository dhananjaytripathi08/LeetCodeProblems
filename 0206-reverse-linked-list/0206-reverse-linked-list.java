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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode slow = null;
        ListNode fast = null;
        if(head == null || head.next == null) {
            return head;
        }
        while(current != null) {
            fast = current.next;
            current.next = slow;
            slow = current;
            current = fast;
        }
        head = slow;
        return head;
    }
}