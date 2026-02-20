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
    int maxDia = 0;
    public int dfs(TreeNode root) {
        if(root == null) return 0;
        int leftPath = dfs(root.left);
        int rightPath = dfs(root.right);
        int currDia = leftPath + rightPath;
        maxDia = Math.max(maxDia, currDia);
        return (Math.max(leftPath, rightPath) + 1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDia;
    }
}