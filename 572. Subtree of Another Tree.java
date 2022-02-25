class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if (isSame(root,subRoot)) return true;
        
 return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        }
    
    private boolean isSame(TreeNode r,TreeNode s){
        if(r==null && s==null) return true;
        if(r==null||s==null) return false;
      if(s.val!=r.val) return false;
        
        return isSame(r.left,s.left)&& isSame(r.right,s.right);
        
    }
    
}
