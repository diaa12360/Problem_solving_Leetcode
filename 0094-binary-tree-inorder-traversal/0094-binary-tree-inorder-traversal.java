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
        List<Integer> sol = new ArrayList<>();
        traversal(root, sol);
        return sol;
    }
    
    void traversal(TreeNode n, List<Integer> l){
        if(n == null)
            return;
        traversal(n.left, l);
        l.add(n.val);
        traversal(n.right, l);
    }
    
    
    
}