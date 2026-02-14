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
    public int dfs(TreeNode root, long current, int target, HashMap<Long, Integer> map) {
        if(root == null) return 0;
        current += root.val;
        int pathsEndingHere = map.getOrDefault(current - target, 0);
        map.put(current, map.getOrDefault(current, 0) + 1);
        int total = pathsEndingHere + dfs(root.left, current, target, map) + dfs(root.right, current, target, map);
        map.put(current, map.getOrDefault(current, 0) - 1);
        return total;
    }
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        return dfs(root, 0L, targetSum, map);
    }
}