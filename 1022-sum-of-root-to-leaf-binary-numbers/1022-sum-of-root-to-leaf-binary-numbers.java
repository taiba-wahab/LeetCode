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
    public void getPaths(TreeNode root, StringBuilder currPath, List<String> ans) {
        if(root != null) {
            currPath.append(root.val);
            int len = currPath.length();
            if(root.left == null && root.right == null) ans.add(currPath.toString());
            else {
                getPaths(root.left, currPath, ans);
                currPath.setLength(len);
                getPaths(root.right, currPath, ans);
            }
        }
        return;
    }
    public int sumRootToLeaf(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder currPath = new StringBuilder();
        getPaths(root, currPath, ans);
        int result = 0;
        for(int i = 0; i < ans.size(); i++) {
            String num = ans.get(i);
            result += Integer.parseInt(num, 2);
        }
        return result;
    }
}