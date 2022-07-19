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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(heightSide(root.left) + heightSide(root.right), Math.max(diameterOfBinaryTree(root.right), diameterOfBinaryTree(root.left)));
    }
    private int heightSide(TreeNode n){
        if(n == null){
            return 0;
        }
        return 1 + Math.max(heightSide(n.left), heightSide(n.right));
    }
}