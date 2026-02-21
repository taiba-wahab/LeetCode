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
    int maxSum = Integer.MIN_VALUE;
    public int dfs(TreeNode root) {
        if(root == null) return 0;
        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);
        int currSum = Math.max(root.val, Math.max((leftSum + rightSum + root.val),Math.max((leftSum + root.val), (rightSum + root.val))));
        maxSum = Math.max(maxSum, currSum);
        return Math.max(root.val, (Math.max(leftSum, rightSum) + root.val));
    }
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
}