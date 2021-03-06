class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
     while(low<high){
            int mid =low+ (high-low)/2;
            if(nums[mid]>nums[high]){
                low =  mid +1;
            }else{
                high=mid;
            }}
         int start = low;
         low=0;
          high = nums.length-1;
         
        if(target>=nums[start] && target<=nums[high]){
            low = start;
        } else{
            high = start;
        }
           //Just a regular Binary Search Problem now
        
         while(low<=high){
             int mid =low+(high-low)/2;
             if(nums[mid]==target){
                 return mid;
             }else if(nums[mid]<target){
                 low = mid+1;
             }else{
                 high = mid-1;
             }
         }
         
        
        return -1;
    }
}
