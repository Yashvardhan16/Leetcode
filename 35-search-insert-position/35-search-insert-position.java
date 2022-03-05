class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int lo =0;
        int hi = n-1;
        
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                lo++;
            }else{
                hi--;
            }
        }
        return lo;
    }
}