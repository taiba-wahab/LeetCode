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
        while(temp != null && temp.next != null) {
            if(temp.next.val == val) {
                ListNode ptr = temp.next.next;
                temp.next = ptr;
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