class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = nums.length-1;
        while(lo<=hi){
            if(nums[lo]==target || nums[hi]==target){
                return true;
            }
            else if(nums[lo]<target){
                while(lo<hi && nums[lo+1]==nums[lo]){
                    lo++;
                }
                lo++;
            }else if(nums[hi]>target){
                while(lo<hi && nums[hi-1]==nums[hi]){
                    hi--;
                }
                hi--;
            }
            else{
                break;
            }
        
        }
       return false;
        
    }
}
