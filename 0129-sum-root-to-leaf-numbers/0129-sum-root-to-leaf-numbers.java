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
    int sum = 0;
    StringBuilder sb = new StringBuilder();
    public void dfs(TreeNode root) {
        if(root != null) {
            sb.append(root.val);
            int len = sb.length();
            if(root.left == null && root.right == null) {
                String str = sb.toString();
                sum += Integer.valueOf(str);
            }
            else {
                dfs(root.left);
                sb.setLength(len);
                dfs(root.right);
            }
        }
        return;
    }
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        dfs(root);
        return sum;
    }
}