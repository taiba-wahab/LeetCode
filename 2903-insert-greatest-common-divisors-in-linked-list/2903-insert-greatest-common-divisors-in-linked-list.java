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
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head, nextPtr = null;
        while(temp.next != null) {
            int val = gcd(temp.val, temp.next.val);
            ListNode node = new ListNode(val);
            nextPtr = temp.next;
            temp.next = node;
            node.next = nextPtr;
            temp = temp.next.next;
        }
        return head;
    }
}