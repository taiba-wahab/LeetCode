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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
    public ListNode separator(int s, int e, ListNode[] lists) {
        if(s > e) return null;
        if(s == e) return lists[s];
        int mid = s + ( e - s) / 2;
        ListNode l1 = separator(s, mid, lists);
        ListNode l2 = separator(mid + 1, e, lists);
        return mergeTwoLists(l1, l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n == 0) return null;
        return separator(0, n - 1, lists);
    }
}