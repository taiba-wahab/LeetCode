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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public TreeNode makeBST(ArrayList<Integer> list, int start, int end) {
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = makeBST(list, start, mid - 1);
        node.right = makeBST(list, mid + 1, end);
        return node;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        return makeBST(list, 0, list.size() - 1);
    }
}