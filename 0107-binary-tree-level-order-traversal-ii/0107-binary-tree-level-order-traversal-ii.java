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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        q.offer(root);
        q.offer(null);
        List<Integer> curr = new ArrayList<>();
        while(!q.isEmpty()) {
            TreeNode temp = q.poll();
            if(temp != null) {
                curr.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            else {
                List<Integer> copyCurr = new ArrayList<>(curr);
                stack.push(copyCurr);
                curr.clear();
                if(!q.isEmpty()) q.offer(null);
            }
        }
        while(!stack.isEmpty()) {
            ans.add(stack.pop());
        }
        return ans;
    }
}