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
    int answer = 0;
    public void dfs(TreeNode root, int max) {
        boolean check = false;
        if(root == null) return;
        if(root.val >= max) {
            answer++;
            max = root.val;
            check = true;
        }
        dfs(root.left, max);
        if(check)
            max = root.val;
        dfs(root.right, max);
    }
    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return answer;
    }
}