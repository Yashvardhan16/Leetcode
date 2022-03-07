class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null) return result;
        
        helper(nums,0,new ArrayList<>(),result);
        return result;
    } 
        void helper(int[] nums,int start , List<Integer> ans ,List<List<Integer>> result ){
        
        result.add(new ArrayList<>(ans));
        
        for(int i=start;i<nums.length;i++){
            ans.add(nums[i]);
            helper(nums,i+1,ans,result);
            ans.remove(ans.size()-1);
        }
    }
}
