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
    public boolean dfsPostorder(TreeNode root) {
        if(root == null) return false; // base case
        // recursive case
        boolean leftStatus = dfsPostorder(root.left);
        boolean rightStatus = dfsPostorder(root.right);
        if(leftStatus == false){
            //prune left side 
            root.left = null;
        } 
        if(rightStatus == false){
            //prune right side 
            root.right = null;
        } 
        return leftStatus || rightStatus || (root.val == 1);

    }
    public TreeNode pruneTree(TreeNode root) {
        if(dfsPostorder(root)) {
            return root;
        }
        return null;
    }
}