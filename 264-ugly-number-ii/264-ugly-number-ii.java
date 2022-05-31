class Solution {
    public int nthUglyNumber(int n) {
       int count_2=0;
        int count_3=0;
        int count_5=0;
        
        int[] dp = new int[n+1];
        dp[0] =1;
        
        for(int i=1;i<=n;i++){
    dp[i] = Math.min(2*dp[count_2],Math.min(3*dp[count_3],5*dp[count_5]));
            
            if(dp[i]==2*dp[count_2]){
                count_2++;
            }
              if(dp[i]==3*dp[count_3]){
                count_3++;
            }
             if(dp[i]==5*dp[count_5]){
                count_5++;
            }
        }
        return dp[n-1];
    }
}