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
    public void inorder(TreeNode root, ArrayList<Integer> ans) {
        if(root == null) return;
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> answer = new ArrayList<>();
        inorder(root, answer);
        for(int i = 0; i < answer.size() - 1; i++) {
            if(answer.get(i) >= answer.get(i + 1)) return false;
        }
        return true;
    }
}