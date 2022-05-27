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
    int max =0;
      Map<Integer,Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        List<Integer> list = new ArrayList();
        for(int i:map.keySet()){
            if(max==map.get(i)){
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
    int dfs(TreeNode root){
       
        if(root==null) return 0;
         int sum=root.val +dfs(root.left)+dfs(root.right);
        map.put(sum,map.getOrDefault(sum,0)+1);
        max =Math.max(max,map.get(sum));
        return sum;
    }
}