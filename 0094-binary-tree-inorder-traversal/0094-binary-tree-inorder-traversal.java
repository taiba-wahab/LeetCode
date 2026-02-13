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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        TreeNode curr = root;
        TreeNode pred = null;
        while(curr != null) {
            // if no left
            if(curr.left == null) {
                ans.add(curr.val);
                curr = curr.right;
            }
            // if left exists --> find predecessor and make threads to curr
            else {
                // find predecessor
                pred = curr.left; // intially make curr.left as pred of curr
                while(pred.right != null && pred.right != curr) {
                    // pred.right != null is for
                    //checking for the situation that its the first time we are visitng the node not second time       
                    pred = pred.right;
                } 
                if(pred.right == null) {// left has not been visited before
                    pred.right = curr;
                    curr = curr.left;
                }
                else {
                    // left has been visited 
                    ans.add(curr.val); // so visit current node
                    pred.right = null; // dissolve thread
                    curr = curr.right; // move right
                }
            }
        }
        return ans;
    }
}