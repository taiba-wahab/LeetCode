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
    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public void dfs(TreeNode root, long x, long y, int count) {
        if(root != null) {
            if(root.val == x || root.val == y) {
                root.val = root.val == x ? (int)y : (int)x;
                if(--count == 0) return;
            }
            dfs(root.left, x, y, count);
            dfs(root.right, x, y, count);
        }
    }
    
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        boolean flag = false;
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) > list.get(i + 1)) {
                y = list.get(i + 1);
                if(!flag) {
                    x = list.get(i);
                    flag = true;
                }
                else {
                    break;
                }
            }
        }
        dfs(root, x, y, 2);
    }
}