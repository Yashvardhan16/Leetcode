class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int running_sum =0;
        int ans = Integer.MAX_VALUE;
       for(int right=0;right<nums.length;right++){
           running_sum += nums[right];
            
            while(running_sum>=target){
                ans = Math.min(ans,right-left+1);
                running_sum -= nums[left];
                left++;
            }
        }
        return ans!=Integer.MAX_VALUE ? ans: 0;
    }
}