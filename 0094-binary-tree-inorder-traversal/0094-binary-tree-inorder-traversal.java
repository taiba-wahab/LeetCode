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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        TreeNode curr = root;
        TreeNode pred = null;
        while(curr != null) {
            if(curr.left == null) {
                ans.add(curr.val);
                curr = curr.right;
            }
            else {
                pred = curr.left;
                while(pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }
                if(pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                }
                else {
                    ans.add(curr.val);
                    pred.right = null;
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
}