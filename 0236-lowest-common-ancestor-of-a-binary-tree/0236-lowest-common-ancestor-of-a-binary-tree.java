/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode lca = null;
    public boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return false;
        boolean leftStatus = dfs(root.left, p, q);
        boolean rightStatus = dfs(root.right, p, q);
        boolean currStatus = (root.val == p.val || root.val == q.val) ? true : false;
        if((leftStatus && rightStatus) || (leftStatus && currStatus) || (currStatus && rightStatus)) {
            lca = root;
            // return true;
        }
        return leftStatus || rightStatus ||  currStatus;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return lca;
    }
}