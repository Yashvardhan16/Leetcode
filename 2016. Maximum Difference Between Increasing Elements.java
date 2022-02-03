class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int continous=0;
        int max=0;
        for(int i=0;i<n;i++){
            min = Math.min(nums[i],min);
            continous = nums[i]-min;
            max = Math.max(max,continous);
        }
        return max==0 ? -1 : max;
    }
}
