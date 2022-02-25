class Solution {
    public int findMin(int[] nums) {
         if (nums.length == 1) {
      return nums[0];
    }
       int lo =0;
        int hi= nums.length-1;
        if(nums[hi]>nums[0]) return nums[0];
        //Run the while loop for left<high exclude equal case!
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
             if (nums[mid] > nums[mid + 1]) {
        return nums[mid + 1];
      }
      if(nums[mid]<nums[mid-1]){
                return nums[mid];
          // use lo(left value) here instead of zero 
            } if(nums[mid]>nums[lo]){
                lo=mid+1;
            }else{
          hi = mid-1;
      }
        }
        return lo;
    }
}
