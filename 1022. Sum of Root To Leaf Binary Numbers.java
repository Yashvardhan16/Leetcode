class Solution {
    private int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        if(root==null) return 0;
        sumcount(root,0);
        return sum;
    }
        private void sumcount(TreeNode node,int currsum){
            if(node==null) {return ;}
            
             currsum =currsum+node.val;
            //Check for Leaf Node
            if(node.left==null && node.right==null){
                sum += currsum;
                return;
            }
            sumcount( node.left, currsum*2);
            sumcount( node.right, currsum*2);
        }
    
}
