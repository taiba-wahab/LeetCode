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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        stack.push(root);
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
                ans.add(curr.val);
                stack.pop();
            }
            prev = curr;
        }
        return ans;
    }
}