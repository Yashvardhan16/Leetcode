class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(candidates,list,0,new ArrayList<>(),target);
        return list;
    }
    void backtrack(int[] candidates,List<List<Integer>> list ,int start,List<Integer> res,int target){
        if(target<0) return;
        if(target==0){
            list.add(new ArrayList<>(res));
        }
        for(int i=start;i<candidates.length;i++){
            res.add(candidates[i]);
            backtrack(candidates,list,i,res,target-candidates[i]);
            res.remove(res.size()-1);
        }
    }
}