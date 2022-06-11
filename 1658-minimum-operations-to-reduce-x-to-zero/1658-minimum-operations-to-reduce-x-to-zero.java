class Solution {
    public int minOperations(int[] nums, int x) {
        int ans =-1;
        int left=0;
        int right =0;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        sum-=x;
        int sub_sum = 0;
        while(right<nums.length){
            sub_sum += nums[right];
            if(sub_sum>sum){
            while(sub_sum> sum &&left<=right){
                sub_sum -= nums[left];
                left++;
            }
            }
            if(sub_sum==sum){
                ans = Math.max(ans,right-left+1);
            }
            right++;
        }
        return ans==-1?ans:nums.length-ans;
    }
}