class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0) return 0;
        int ans =nums[0],max=nums[0],min=nums[0];
        for(int i=1;i<nums.length;i++){
            int prev_max = max;
    max = Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
    min = Math.min(nums[i],Math.min(prev_max*nums[i],min*nums[i]));
            ans = Math.max(ans,max);

        }
        return ans;
    }
}