class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList();
        if(rowIndex<0) return ans;
        
        ans.add(1);
        for(int i=1;i<rowIndex+1;i++){
            for(int j= ans.size()-1;j>0;j--){
                ans.set(j,ans.get(j-1)+ans.get(j));
            }
            ans.add(1);
        }
  return ans;
    }
}
