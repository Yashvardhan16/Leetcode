class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(candidates,0,new ArrayList<>(),target,list);
        return list;
    }
   void helper(int[] candidates,int start,List<Integer> ans,int target,List<List<Integer>> list){
         if(target<0) return;
       if(target==0)  list.add(new ArrayList<>(ans));
      
        for(int i=start;i<candidates.length;i++){
            ans.add(candidates[i]);
            helper(candidates,i,ans,target-candidates[i],list);
            ans.remove(ans.size()-1);
        }
    }
}