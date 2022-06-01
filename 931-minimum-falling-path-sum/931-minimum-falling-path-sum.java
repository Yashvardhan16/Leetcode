class Solution {
    public int minFallingPathSum(int[][] matrix) {
          int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0){
                    dp[i][j] = matrix[i][j];
                }else if(j==0){
     dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j+1]);
                }else if(j==m-1){
                  dp[i][j] = matrix[i][j] +  Math.min(dp[i-1][j],dp[i-1][j-1]); 
                }else{
                     dp[i][j] = matrix[i][j] +  Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i-1][j+1]); 
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            min = Math.min(min,dp[n-1][j]);
        }
        return min;
    }
}