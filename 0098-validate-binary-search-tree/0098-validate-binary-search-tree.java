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
    long prev = Long.MIN_VALUE;
    public boolean dfs(TreeNode root) {
        if(root == null) return true;
        if(!dfs(root.left)) return false;
        if(prev >= root.val) return false;
        prev = root.val;
        return dfs(root.right);
        
    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }
}