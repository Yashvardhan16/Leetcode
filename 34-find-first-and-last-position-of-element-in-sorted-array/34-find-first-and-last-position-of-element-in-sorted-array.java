class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        ans[0] = start(nums,target);
        ans[1] = end(nums,target);
        return ans;
         }
        int start(int[] nums, int target){
            int lo =0;
            int hi = nums.length-1;
            int index =-1;
            while(lo<=hi){
                int mid = (hi-lo)/2+lo;
                if(nums[mid]>=target){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }if(nums[mid]==target){
                    index = mid;
                }
            }
                return index;
        }
    int end(int[] nums ,  int target){
            int lo =0;
            int hi = nums.length-1;
            int index =-1;
            while(lo<=hi){
                int mid = (hi-lo)/2+lo;
                if(nums[mid]<=target){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }if(nums[mid]==target){
                    index = mid;
                }
            }
        return index;
        }
   
}