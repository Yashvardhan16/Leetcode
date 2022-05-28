class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list  = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,list,new ArrayList());
        return list;
    }
    void helper(int[] nums,int start, List<List<Integer>> list ,List<Integer> res){
        list.add(new ArrayList(res));
        
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            res.add(nums[i]);
            helper(nums,i+1,list,res);
            res.remove(res.size()-1);
        }
    }
}