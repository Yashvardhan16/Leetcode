class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==1 && nums[0]==0) return 1;
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,1);
        int len =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                dp[i] = Math.max(dp[i],1+dp[j]);
            }
                len = Math.max(len,dp[i]);
            }
        }
        return len;
    }
}