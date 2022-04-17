class Solution {
    public int longestSubsequence(int[] nums, int diff) {
        Map<Integer,Integer> dp = new HashMap<>();
        int max =0;
        for(int i=0;i<nums.length;i++){
            dp.put(nums[i],dp.getOrDefault(nums[i]-diff,0)+1);
            max = Math.max(max,dp.get(nums[i]));
        }
        return max;
    }
}