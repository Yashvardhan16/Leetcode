class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            for(int j = 1; j <= i/2; j++){
 dp[i] = Math.max(dp[i], (Math.max(dp[j],j)*Math.max(dp[i-j],i-j)));
            }
        }
        return dp[n];
    }
}
////Inner loop will break i and give the max product. We are using (j <= i / 2) instead of (j < i) as it 
			//removes duplicate checks and increases efficiency.
            //Example : For i = 4, 1)If we use (j < i), then the checks will be (1,3), (2,2) and (3,1). If we have 
			//calculated for (1,3), we don't need (3,1) check. 2)If we use (j <= i / 2), then checks will be 
			//(1,3) and (2,2).