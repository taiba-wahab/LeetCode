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
        int currSum = 0;
        if(leftSum > 0 && rightSum > 0) {
            currSum = leftSum + rightSum + root.val;
        }
        else if(leftSum > 0 || rightSum > 0) {
            currSum = leftSum > 0 ? root.val + leftSum : root.val + rightSum;
        } 
        else {
            currSum = root.val;
        }
        maxSum = Math.max(maxSum, currSum);
        return root.val + (Math.max(0, Math.max(leftSum, rightSum)));
    }
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
}