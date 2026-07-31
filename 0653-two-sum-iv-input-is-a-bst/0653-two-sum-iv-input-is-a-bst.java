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
    public void dfs(ArrayList<Integer> inorder, TreeNode root) {
        if(root == null) return;
        dfs(inorder, root.left);
        inorder.add(root.val);
        dfs(inorder, root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        dfs(inorder, root);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.size(); i++) {
            map.put(inorder.get(i), i);
        }
        for(int i = 0; i < inorder.size(); i++) {
            int target = k - inorder.get(i);
            if(map.containsKey(target) && i != map.get(target)) return true;
        }
        return false;
    }
}