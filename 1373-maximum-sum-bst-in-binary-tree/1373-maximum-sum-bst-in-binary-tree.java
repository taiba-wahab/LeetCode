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
class NodeValue {
    public int maxNode, minNode, sum;
    NodeValue(int maxNode, int minNode, int sum) {
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.sum = sum;
    }
};
class Solution {
    int ans = 0;
    public NodeValue maxSumBSTHelper(TreeNode root) {
        if(root == null) return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        NodeValue left = maxSumBSTHelper(root.left);
        NodeValue right = maxSumBSTHelper(root.right);
        if(left.maxNode < root.val && right.minNode > root.val) {
            int currentSum = left.sum + right.sum + root.val;
            ans = Math.max(ans, currentSum);
            return new NodeValue(Math.max(right.maxNode, root.val), Math.min(left.minNode, root.val), currentSum);
        }
        return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }
    public int maxSumBST(TreeNode root) {
        maxSumBSTHelper(root);
        return ans;
    }
}