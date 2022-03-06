class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int lo=0;
        int hi = n-1;
        
        if(nums[hi]>nums[lo]) return nums[lo];
        
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]>nums[lo]){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }//2,3,4,5,1
        return nums[lo];
    }
}