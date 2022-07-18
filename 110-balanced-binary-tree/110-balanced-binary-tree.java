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
    public boolean isBalanced(TreeNode n) {
        if(n == null)
            return true;
        int lh = height(n.left), rh = height(n.right);
        return 
            Math.abs(lh - rh) <= 1 && isBalanced(n.left) && isBalanced(n.right);
            
        
    }
    private int height(TreeNode n){
        if(n == null){
            return 0;
        }
        
        return 1 + Math.max(height(n.left), height(n.right));
    }
}