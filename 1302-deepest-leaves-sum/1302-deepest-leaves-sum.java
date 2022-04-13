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
    private int sum =0;
    private int maxlevel =0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        helper(root,0);
        return sum;
    }
    void helper(TreeNode root,int level){
        if(root == null) return;
        if(level>maxlevel){
            sum=0;
            maxlevel=level;
        }
        if(level==maxlevel){
            sum+=root.val;
        }
        helper(root.left,level+1);
          helper(root.right,level+1);
    }
}