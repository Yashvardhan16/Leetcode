class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans=0;
            if(n==0){
                return ans;
            }
     int max=prices[0]; 
        for (int i=0;i<n;i++){
            if(prices[i]>max){
              if(ans<(prices[i]-max))
                    {
                        ans=prices[i]-max;
                    }
                }
                else
                {
                    max=prices[i];
                }}
        return ans;
    }
}
