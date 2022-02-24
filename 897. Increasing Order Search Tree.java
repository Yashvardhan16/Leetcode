// In-Order Traversal

class Solution {
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
    }
        private void inorder(TreeNode node){
            if(node==null) return ;
            inorder(node.left);
            node.left=null;
            cur.right =node;
            cur =node;
            inorder(node.right);
        
    }
}
