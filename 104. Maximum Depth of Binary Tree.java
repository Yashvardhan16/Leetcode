//Recursive
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left,right)+1;
    }
}

//Iterative

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Stack<TreeNode> stack = new Stack();
         Stack<Integer> depths = new Stack();
        stack.push(root);
        depths.push(1);
        int max=0;
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            int temp = depths.pop();
            max = Math.max(temp,max);
            if(node.left!=null){
                stack.push(node.left);
                depths.push(temp+1);
            }
             if(node.right!=null){
                stack.push(node.right);
                depths.push(temp+1);
            }
            
        }
        return max;
    }
}
