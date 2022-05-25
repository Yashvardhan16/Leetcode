class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
     backtrack(set,new ArrayList<>(), nums,new boolean[nums.length]);
        for(List<Integer> i:set){
            list.add(i);
        }
        return list;
    }
    
    void backtrack(Set<List<Integer>> set, List<Integer> res,int[] nums,boolean[] used){
        if(res.size()==nums.length){
            set.add(new ArrayList<>(res));
        }
        for(int i=0;i<nums.length;i++){
        if(!used[i]){
            res.add(nums[i]);
            used[i] = true;
            backtrack(set,res,nums,used);
            used[i] = false;
            res.remove(res.size()-1);
        }
        }
    }
}