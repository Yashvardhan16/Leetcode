class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0||nums[i]>nums.length){
                nums[i] = nums.length+1;
            }
        }
         for(int i=0;i<nums.length;i++){
             int id = Math.abs(nums[i]);
             if(id>nums.length) continue;
             id--;
             if(nums[id]>0) nums[id] = -nums[id];
             
         }
         for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
         }
        return nums.length+1;
    }
}