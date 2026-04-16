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
    public int dfs(TreeNode root) {
        if(root == null) return 0;
        int leftCount = dfs(root.left);
        int rightCount = dfs(root.right);
        return (leftCount + rightCount + 1);
    }
    public int countNodes(TreeNode root) {
        int answer = dfs(root);
        return answer;
    }
}