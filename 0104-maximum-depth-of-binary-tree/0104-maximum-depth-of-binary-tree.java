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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int max = 0;
        TreeNode prev = null;
        while(!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if(prev == null || prev.left == curr || prev.right == curr) {
                if(curr.left != null) stack.push(curr.left); 
                else if(curr.right != null) stack.push(curr.right);
            } 
            else if(curr.left == prev) {
                if(curr.right != null) stack.push(curr.right);
            }
            else {
                stack.pop();
            }
            prev = curr;
            max = Math.max(max, stack.size());
        }
        return max;
    }
}