class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        helper(n,k,0,list,new ArrayList());
        return list;
    }
    void helper(int n, int k, int start , List<List<Integer>> list,List<Integer> res){
        if(k==0){
            list.add(new ArrayList<>(res));
        }
        for(int i=start;i<n;i++){
            res.add(i+1);
            helper(n,k-1,i+1,list,res);
            res.remove(res.size()-1);
        }
    }
}