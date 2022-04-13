class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList(), k,1 , n);
        return list;
    }
   void backtrack(List<List<Integer>> list, List<Integer> ans,int k,int start ,int n){
        if(ans.size()==k && n==0){
            list.add(new ArrayList<>(ans));
            return;
        }
       
       for(int i=start;i<=9;i++){
           ans.add(i);
          backtrack(list,ans,k,i+1,n-i);
           ans.remove(ans.size()-1);
       }
    }
}