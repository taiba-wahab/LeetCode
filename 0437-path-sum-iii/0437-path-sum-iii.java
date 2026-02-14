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
    int count = 0;
    public void dfs(TreeNode root, int target, HashMap<Long, Integer> map, long current) {
        if(root == null) return;
        current += root.val;
        long needed = current - target;
        if(map.containsKey(needed)) {
            count += map.get(needed);
        }
        map.put(current, map.getOrDefault(current, 0) + 1);
        dfs(root.left, target, map, current);
        dfs(root.right, target, map, current);
        map.put(current, map.getOrDefault(current, 0) - 1);
    }
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        long current = 0;
        dfs(root, targetSum, map, current);
        return count;
    }
}