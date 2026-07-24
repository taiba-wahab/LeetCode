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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode curr = root;
        if(root == null) {
            TreeNode node = new TreeNode(val);
            return node;
        }
        int flag = 0;
        TreeNode prev = null;
        while(root != null) {
            if(root.val < val) {
                flag = 0;
                prev = root;
                root = root.right;
            }
            else {
                flag = 1;
                prev = root;
                root = root.left;
            }
        }
        if(flag == 0) {
            TreeNode node = new TreeNode(val);
            prev.right = node;
        }
        else {
            TreeNode node = new TreeNode(val);
            prev.left = node;
        }
        return curr;
    }
}