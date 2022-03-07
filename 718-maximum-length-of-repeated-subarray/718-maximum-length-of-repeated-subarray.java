class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        // make dp array for num1 and nums2 fill it with 1's
        //     if nums i > nums i-1 add to count
        //         return max count
                int ans =0;
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        
        for(int i=nums1.length-1;i>=0;i--){
             for(int j=nums2.length-1;j>=0;j--){
                 if(nums1[i]==nums2[j]){
                     dp[i][j] += 1 + dp[i+1][j+1];
                 }
                 if(ans<dp[i][j]){
                     ans = dp[i][j];
                 }
        }
        }
        return ans;
    }
}