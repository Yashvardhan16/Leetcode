class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if(nums==null) return list;
        helper(nums,0,new ArrayList<>(),list);
        return list;
    }
    void helper(int[] nums,int start,List<Integer> ans, List<List<Integer>> list){
        list.add(new ArrayList<>(ans));
        
        for(int i=start;i<nums.length;i++){
             if(i>start&&nums[i]==nums[i-1]) continue;
            ans.add(nums[i]);
            helper(nums,i+1,ans,list);
            ans.remove(ans.size()-1);
            
        }
    }
}