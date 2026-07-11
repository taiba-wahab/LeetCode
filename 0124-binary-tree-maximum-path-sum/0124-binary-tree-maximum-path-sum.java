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
    int max = Integer.MIN_VALUE;
    public int maxPath(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftPath = Math.max(0, maxPath(root.left)); //ignoring negative path sums
        int rightPath = Math.max(0, maxPath(root.right)); //ignoring negative path sums
        max = Math.max(leftPath + rightPath + root.val, max);
        return root.val + Math.max(leftPath, rightPath);
    }
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return max;
    }
}