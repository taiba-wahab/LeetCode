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
    public TreeNode searchNode(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        if(root.left != null && root.val > val) {
            return searchNode(root.left, val);
        }
        else {
            return searchNode(root.right, val);
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        return searchNode(root, val);
    }
}