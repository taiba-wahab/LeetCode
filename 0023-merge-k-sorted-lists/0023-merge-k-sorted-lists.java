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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < lists.length; i++) {
            ListNode curr = lists[i];
            while(curr != null) {
                list.add(curr.val);
                curr = curr.next;
            }
        }
        int [] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        Arrays.sort(array);
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        for(int i = 0; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);
            result.next = node;
            result = result.next;
        }
        return dummy.next;
    }
}