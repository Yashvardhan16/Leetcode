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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        int[] nums = new int[2];
        inorder(root, nums,k);
        return nums[1];
    }
    void inorder(TreeNode root,int[] nums,int k){
        if(root==null) return;
        inorder(root.left,nums,k);
        if(++nums[0]==k){
            nums[1] = root.val;
        }
        inorder(root.right,nums,k);
    }
}