class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> list1 = new ArrayList();
        for(int i =0; i< numRows;i++){
            List<Integer> list2 = new ArrayList();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i){
                    list2.add(1);
                }else{
                    list2.add(list1.get(i-1).get(j-1) + list1.get(i-1).get(j));
                }
            }
            list1.add(list2);
        }
        return list1;
    }
}
