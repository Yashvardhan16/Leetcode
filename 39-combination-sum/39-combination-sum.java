class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(candidates,0,new ArrayList<>(),target,list);
        return list;
    }
    
    void helper(int[] candidates,int start,List<Integer> res,int target,List<List<Integer>> list){
        if(target<0) return;
        if(target==0) list.add(new ArrayList<>(res));
        for(int i=start;i<candidates.length;i++){
            res.add(candidates[i]);
            helper(candidates,i,res,target-candidates[i],list);
            res.remove(res.size()-1);
        }
    }
}