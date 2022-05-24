class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo=0;
        int hi = n-1;
        
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>nums[hi]){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }
        int start =lo;
        hi=n-1;
        lo=0;
        if(target>=nums[start] && target<=nums[hi]){
            lo = start;
        }else{
            hi = start;
        }
        
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target){
                lo = mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    }
}