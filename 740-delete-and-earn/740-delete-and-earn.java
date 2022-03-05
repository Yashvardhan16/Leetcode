class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
      Map<Integer,Integer> map = new HashMap<>();
        int max=0;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+i);
            max = Math.max(max,i);
        }
        int[] dp = new int[max+1];
        dp[1] = map.getOrDefault(1,0);
        
        for(int i=2;i<dp.length;i++){
            int gain = map.getOrDefault(i,0);
            dp[i] = Math.max(dp[i-1],dp[i-2]+gain);
        }
        return dp[max];
    }
}