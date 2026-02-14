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
    public int validPaths(TreeNode root, long target) {
        int count = 0;
        if(root == null) return 0;
        if(root.val == target) count++;
        target -= root.val;
        count += validPaths(root.left, target);
        count += validPaths(root.right, target);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        int total = 0;
        if(root == null) return 0;
        total += validPaths(root, targetSum);
        total += pathSum(root.left, targetSum);
        total += pathSum(root.right, targetSum);
        return total;
    }
}