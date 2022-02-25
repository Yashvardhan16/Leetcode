// Recursion

class Solution {
    public boolean isSymmetric(TreeNode root) {
      return root==null || issame(root.left,root.right);
    }
        boolean issame(TreeNode left , TreeNode right){
            if(left==null|| right ==null){
                return left==right;
            }
            if(left.val!=right.val) return false;
            
            return issame(left.left,right.right) && issame(left.right,right.left);
        }
        
        
    
}
