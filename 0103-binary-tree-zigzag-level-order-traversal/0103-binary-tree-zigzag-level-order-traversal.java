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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean leftToRight = true;
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>(Collections.nCopies(size, 0));
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                int index = leftToRight ? i : size - i - 1;
                level.set(index, node.val);
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            ans.add(level);
            leftToRight = !leftToRight;
        }
        return ans;
    }
}