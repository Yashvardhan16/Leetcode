class Solution {
    public boolean isValidBST(TreeNode root) {
       return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
        
    }
    boolean dfs(TreeNode root,long minval,long maxval){
        if(root ==null) return true;
        if(root.val>=maxval||root.val<=minval){
            return false;
        }
        return dfs(root.left,minval,root.val) && dfs(root.right,root.val,maxval);
    }
}
