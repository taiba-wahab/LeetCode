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
    public void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
        arr[j + 1] = key;
        }
    }
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
        insertionSort(list);
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        for(int i = 0; i < size; i++) {
            result.next = new ListNode(list[i]);
            result = result.next;
        }
        return dummy.next;
    }
}