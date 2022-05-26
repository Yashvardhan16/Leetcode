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
    int maxdepth=0,ans=0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,1);
        return ans;
    }
    void dfs(TreeNode root,int depth){
        if(root==null) return;
        
        if(root.left==null && root.right==null && depth>maxdepth){
            ans = root.val;
            maxdepth = depth;
        }
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
}