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
    public void dfs(TreeNode root, long x, long y) {
        if(root == null) return;
        if(root.val == x) {
            root.val = (int)y;
        }
        else if(root.val == y) {
            root.val = (int)x;
        }
        dfs(root.left, x, y);
        dfs(root.right, x, y);
    }
    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        int flag = 0;
        for(int i = 0; i < list.size() - 1; i++) {
            // if(flag == 2) break;
            if((list.get(i) > list.get(i + 1)) && flag != 1) {
                x = list.get(i);
                y = list.get(i + 1);
                flag++;
            }
            else if(list.get(i) > list.get(i + 1)) {
                y = list.get(i + 1); 
            }
        }
        dfs(root, x, y);
    }
}