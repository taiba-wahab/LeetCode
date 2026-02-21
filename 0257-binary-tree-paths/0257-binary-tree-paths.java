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
    public void dfs(TreeNode root, StringBuilder currPath, List<String> ans) {
        if(root != null) {
            currPath.append(root.val);
            if(root.left != null || root.right != null)currPath.append("->");
            int len = currPath.length();
            if(root.left == null && root.right == null) ans.add(currPath.toString());
            else {
                // currPath.append("->");
                dfs(root.left, currPath, ans);
                currPath.setLength(len);
                dfs(root.right, currPath, ans);
            }
        }
        return;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder currPath = new StringBuilder();
        if(root == null) return ans;
        dfs(root, currPath, ans);
        return ans;
    }
}