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
    int count = 0;
    public int[] countSum(TreeNode root) {
        if(root == null) return new int []{0, 0};
        int [] leftSum = countSum(root.left);
        int [] rightSum = countSum(root.right);
        int sum = leftSum[0] + rightSum[0] + root.val;
        int size = leftSum[1] + rightSum[1] + 1;
        int avg = sum / size;
        if(avg == root.val) count++;
        return new int[]{sum, size};
    }
    public int averageOfSubtree(TreeNode root) {
        countSum(root);
        return count;
    }
}