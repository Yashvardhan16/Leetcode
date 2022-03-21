class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
          List<List<Integer>> list = new LinkedList<>();
        helper(candidates,0,new ArrayList<>(),target,list);
        return list;
    }
   void helper(int[] candidates,int start,List<Integer> ans,int target,List<List<Integer>> list){
         if(target<0) return;
       if(target==0)  list.add(new ArrayList<>(ans));
      
        for(int i=start;i<candidates.length;i++){
            if(i > start && candidates[i] == candidates[i-1]) continue;
            if(target-candidates[i] < 0) continue;
            ans.add(candidates[i]);
            helper(candidates,i+1,ans,target-candidates[i],list);
            ans.remove(ans.size()-1);
        }
    }
}