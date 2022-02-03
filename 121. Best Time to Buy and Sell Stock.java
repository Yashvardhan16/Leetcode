class Solution {
    public int maxProfit(int[] prices) {
         int n = prices.length;
        int min=prices[0];
        int max=0;
        int profit=0;
        for(int i=0;i<n;i++){
             min = Math.min(prices[i],min);
            profit = prices[i] - min;
            max = Math.max(max,profit);
        }
        return max;
    }
}
