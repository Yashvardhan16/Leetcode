class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])>1){
               return true;
            }
        }
        return false;
    }
}