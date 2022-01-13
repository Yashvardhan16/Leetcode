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
