/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode start = head;
        while(start != null) {
            int count = 0;
            for(ListNode end = start.next; end != null; end = end.next) {
                if(count == 10001) {
                    break;
                }
                if(start == end) {
                    return true;
                }
                count++;
            }
            start = start.next;
        }
        return false;
    }
}