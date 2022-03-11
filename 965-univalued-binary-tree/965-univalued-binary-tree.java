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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        boolean res = helper(root,root.val);
        return res;
    }
    boolean helper(TreeNode root ,int val){
        if(root==null){
            return true;
        }
        boolean res = helper(root.left,root.val) && helper(root.right,root.val) && (val==root.val);
        return res;
    }
}
    
