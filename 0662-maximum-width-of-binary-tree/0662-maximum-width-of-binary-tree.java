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
 class Pair {
    long index;
    TreeNode node;
    Pair(TreeNode node, long index) {
        this.node = node;
        this.index = index;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        long maxWidth = 0L;
        Pair temp = new Pair(root, 1);
        q.offer(temp);
        while(!q.isEmpty()) {
            long first = 0, last = 0;
            int size = q.size();
            for(int i = 0; i < size; i++) {
                Pair p = q.poll();
                if(i == 0) {
                    first = p.index;
                }
                if(i == size - 1) {
                    last = p.index;
                }
                if(p.node != null) {
                    if(p.node.left != null) {
                        Pair newPair = new Pair(p.node.left, 2 * p.index + 1);
                        q.offer(newPair);
                    }
                    if(p.node.right != null) {
                        Pair newPair = new Pair(p.node.right, 2 * p.index + 2);
                        q.offer(newPair);
                    }
                }
            }
            long width = last - first + 1;
            maxWidth = Math.max(width, maxWidth);
        }
        return (int)maxWidth;
    }
}