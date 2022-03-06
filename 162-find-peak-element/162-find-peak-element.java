class Solution {
    public int findPeakElement(int[] nums) {
        // using lo and hi pointer find the mid element
        //compare mid element to mid-1 & mid+1
        //if mid element bigger return mid
        
        int n = nums.length;
        int lo=0;int hi = n-1;
        while(lo<hi){
            int mid = lo +(hi-lo)/2;
           if(nums[mid]<nums[mid+1]){
                lo =mid+1;
           }
            else{
                hi=mid;
            }
        }
        return lo;
    }
}