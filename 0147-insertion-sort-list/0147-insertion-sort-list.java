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
    public int getSize(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public ListNode insertionSortList(ListNode head) {
        int size = getSize(head);
        int[] list = new int[size];
        ListNode temp = head;
        int idx = 0;
        while(temp != null) {
            list[idx] = temp.val;
            temp = temp.next;
            idx++;
        }
        Arrays.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        for(int i = 0; i < size; i++) {
            result.next = new ListNode(list[i]);
            result = result.next;
        }
        return dummy.next;
    }
}