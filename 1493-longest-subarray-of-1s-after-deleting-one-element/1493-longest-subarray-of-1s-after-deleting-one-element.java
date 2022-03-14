class Solution {
    public int longestSubarray(int[] nums) {
        int k=1;
        int count =0;int left=0;int right=0;
        for(right=0;right<nums.length;right++){
            if(nums[right]==0) k--;
            
            while(k<0){
                if(nums[left]==0){
                    k++;
                }
                left++;
            }
            count = Math.max(count,right-left);
        }
        return count;
    }
}