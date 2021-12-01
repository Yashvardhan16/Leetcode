class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
      
        for(int i: nums){
            set.add(i);
            }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                list.add(i);
            }
       
    } return list;
}}
