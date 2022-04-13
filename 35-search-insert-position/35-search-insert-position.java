class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int lo =0;
        int hi = n-1;
        if(target>nums[hi]) return n;
        while(lo<hi){
            int mid= (hi-lo)/2+ lo;
            if(nums[mid]==target) {return mid;}
                                   
            
            if(nums[mid]<target){
                lo=mid+1;
            }
            if(nums[mid]>target){
                hi=mid;
            }
        }
        return lo;
    }
}