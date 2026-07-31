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
    ArrayList<Integer> inorder = new ArrayList<>();
    public TreeNode makeBST(ArrayList<Integer> inorder, int start, int end) {
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(inorder.get(mid));
        node.left = makeBST(inorder, start, mid - 1);
        node.right = makeBST(inorder, mid + 1, end);
        return node;
    }
    public void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.left);
        inorder.add(root.val);
        dfs(root.right);
    }
    public TreeNode balanceBST(TreeNode root) {
        dfs(root);
        return makeBST(inorder, 0, inorder.size() - 1);
    }
}