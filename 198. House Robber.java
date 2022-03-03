// DP

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int[] dp = new int[n+1];
        dp[0] =0;
        dp[1] = nums[0];
        
        for(int i=1;i<n;i++){
            dp[i+1] = Math.max(dp[i],dp[i-1]+nums[i]);
        }
        return dp[n];
    }
}

// Brute-Force
class Solution {
    public int rob(int[] nums) {
       int ans = 0; 
       int skip = 0; 
    for(int i=0; i<nums.length; i++) {
        int currob = skip + nums[i];
        skip = Math.max(skip, ans); 
        ans = currob;
    }
    return Math.max(ans, skip);
}}
