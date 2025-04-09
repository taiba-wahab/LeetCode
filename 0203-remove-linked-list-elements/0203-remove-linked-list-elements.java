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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        if(head == null) return head;
        while(temp.next != null) {
            if(temp.next.val == val) {
                ListNode ptr = temp.next;
                temp.next = ptr.next;
                ptr.next = null;
            }
            else {
                temp = temp.next;
            }
        }
        while(head != null && head.val == val) {
            head = head.next;
        }
        return head;
    }
}