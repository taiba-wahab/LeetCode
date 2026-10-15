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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        map.put(0, dummy);
        int runningSum = 0;
        ListNode curr = dummy.next;
        ListNode prev = dummy;
        while(curr != null) {
            runningSum += curr.val;
            if(map.containsKey(runningSum)) {
                prev = map.get(runningSum);
                ListNode temp = prev.next;
                int sum = runningSum;
                while(temp != curr) {
                    sum += temp.val;
                    map.remove(sum);
                    temp = temp.next;
                }
                prev.next = curr.next;
            }
            else {
                map.put(runningSum, curr);
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}