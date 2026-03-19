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
    int moves = 0;
    public int dfs(TreeNode root) {
        if(root == null) return 0;
        int lc = dfs(root.left); //extra coins from left
        int rc = dfs(root.right); // extra coins from right
        moves += Math.abs(lc) + Math.abs(rc); // moves at the node
        return (lc + rc + root.val) - 1; // extra coins
    }
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
}