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
    public void bfs(TreeNode root, List<Integer> sums) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int sum = 0;
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            sums.add(sum);
        }
    }
    public int maxLevelSum(TreeNode root) {
        List<Integer> sums = new ArrayList<>();
        bfs(root, sums);
        int maxSum = Integer.MIN_VALUE;
        int answer = 0;
        for(int i = 0; i < sums.size(); i++) {
            if(sums.get(i) > maxSum) {
                maxSum = sums.get(i);
                answer = i + 1;
            }
        }
        return answer;
    }
}