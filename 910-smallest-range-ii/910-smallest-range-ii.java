class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
       int res = nums[n-1] - nums[0]; 
        int min = nums[0] + k;   
        int max = nums[n-1] - k;
        
        for(int i=0;i<nums.length-1;i++){
            int mx = Math.max(max,nums[i]+k);
            int mi = Math.min(min,nums[i+1]-k);
            res = Math.min(res,mx-mi);
        }
        return res;
    }
}