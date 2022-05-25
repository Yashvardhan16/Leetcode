class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums);
        return list;
    }
 void backtrack(List<List<Integer>> list,List<Integer> res,int[] nums){
        if(res.size()==nums.length){
            list.add(new ArrayList<>(res));
        }
     for(int i=0;i<nums.length;i++){
         if(res.contains(nums[i])) continue;
         res.add(nums[i]);
         backtrack(list,res,nums);
         res.remove(res.size()-1);
     }
    }
}