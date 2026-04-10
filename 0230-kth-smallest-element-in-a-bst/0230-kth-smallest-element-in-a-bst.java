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
    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public int getKthSmallest(TreeNode root, int k) {
        ArrayList<Integer> inList = new ArrayList<>();
        inorder(root, inList);
        return inList.get(k - 1);
    }
    public int kthSmallest(TreeNode root, int k) {
        int ans = getKthSmallest(root, k);
        return ans;
    }
}