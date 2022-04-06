class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(int i=0;i<nums.length;i++){
        //     if( map.get(nums[i])>1){
        //        return true;
        //     }
        // }
        // return false;
       Set<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}