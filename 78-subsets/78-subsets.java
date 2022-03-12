class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums==null) return list;
        helper(nums,0,new ArrayList<>(),list);
        return list;
    }
    void helper(int[] nums, int start , List<Integer> res , List<List<Integer>> list ){
        list.add(new ArrayList<>(res));
        
        for(int i=start;i<nums.length;i++){
            res.add(nums[i]);
            helper(nums,i+1,res,list);
            res.remove(res.size()-1);
        }
    }
}