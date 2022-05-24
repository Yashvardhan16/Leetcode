class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,1);
        int len =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i])
                dp[i] = Math.max(dp[i],dp[j]+1);
            }
            len = Math.max(dp[i],len);
        }
        return len;
    }
}