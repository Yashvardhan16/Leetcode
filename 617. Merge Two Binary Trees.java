//Recursion
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }
        root1.val += root2.val;
        root1.left = mergeTrees( root1.left,  root2.left);
        root1.right = mergeTrees( root1.right,  root2.right);
        return root1;
    }
}

//Iterative 

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> stack = new Stack();
        stack.push(root1);
        stack.push(root2);
        if(root1==null) return root2;
        while(!stack.isEmpty()){
            TreeNode two = stack.pop();
            TreeNode one = stack.pop();
            
             if (one != null && two != null)
            {
                one.val += two.val;
                if (one.left == null){
                    one.left = two.left;
                }
                else
                {
                    stack.push(one.left);
                    stack.push(two.left);
                }
                      
                if (one.right == null){
                    one.right = two.right;
                }
                else
                {
                    stack.push(one.right);
                    stack.push(two.right);
                }  
            }     
        }
        return root1;  
        }
    }
    
