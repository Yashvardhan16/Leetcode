class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        int temp = nums[0];
        for(int i = 1;i<n;i++){
            if(nums[i] > nums[i-1])
                temp+=nums[i];
            else
                temp = nums[i];
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}
