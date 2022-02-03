class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows==0){
            return ans;
        }
        List<Integer> firstrow = new ArrayList();
        firstrow.add(1);
        ans.add(firstrow);
        
        for(int i=1;i<numRows;i++){
             List<Integer> prevRow = ans.get(i-1);
              List<Integer> Row = new ArrayList();
            
            Row.add(1);
            
            for(int j=1;j<i;j++){
                Row.add(prevRow.get(j-1)+ prevRow.get(j));
            }
            Row.add(1);
            ans.add(Row);
        }
       return ans;
    }
}
