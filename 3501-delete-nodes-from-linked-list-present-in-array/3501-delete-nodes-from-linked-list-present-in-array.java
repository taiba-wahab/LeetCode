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
    public boolean binarySearch(int[] nums, int key, int low, int high) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == key) return true;
            else if(nums[mid] > key) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        Arrays.sort(nums);
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode prev = result;
        ListNode temp = head;
        while(temp != null) {
            if(binarySearch(nums, temp.val, 0, nums.length - 1)) {
                prev.next = temp.next;
                temp = temp.next;
            }
            else {
                prev = prev.next;
                temp = temp.next;
            }
        }
        return result.next;
    }
}