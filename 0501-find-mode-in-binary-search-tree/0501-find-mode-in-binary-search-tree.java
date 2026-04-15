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
    public void dfs(TreeNode root, HashMap<Integer, Integer> map) {
        if(root == null) return;
        dfs(root.left, map);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        dfs(root.right, map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        dfs(root, map);
        int count = 0;
        int maxFreq = 0;
        for(int key : map.keySet()) {
            if(map.get(key) >= maxFreq) {
                maxFreq = map.get(key);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) == maxFreq) {
                ans.add(key);
            }
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}