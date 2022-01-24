class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
      ans[0] = Start(nums,target);
        ans[1] = End(nums,target);
        return ans;
    }
        public int Start(int[] nums, int target){
            int index = -1;
            int lo=0;
            int hi=nums.length-1;
            while(lo<=hi){
                int mid = lo +(hi-lo)/2;
                if(nums[mid]>=target){
                      hi = mid-1;
                }
                else {
                    lo = mid+1;
                }
                 if(nums[mid]==target){
                    index=mid;
                }
            }
            return index;
        }
         public int  End(int[] nums, int target){
            int index = -1;
            int lo=0;
             int hi=nums.length-1;
            while(lo<=hi){
                int mid = lo +(hi-lo)/2;
                if(nums[mid]<=target){
                   lo = mid+1;
                }else{
                   hi = mid-1;
                }
                 if(nums[mid]==target){
                    index=mid;
                }
            }
            return index;
        }
    }
