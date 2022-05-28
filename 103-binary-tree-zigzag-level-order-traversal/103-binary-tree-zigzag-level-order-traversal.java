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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList();
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse=false;
    
    while(!q.isEmpty()){
        int size = q.size();
        List<Integer> res = new ArrayList();
        while(size -->0){
            root = q.poll();
            res.add(root.val);
            if(root.left!=null) q.add(root.left);
            if(root.right!=null) q.add(root.right);
            }
            if(reverse)
                Collections.reverse(res);
                list.add(res);
                reverse = !reverse;
    }
        return list;
        
    }
}