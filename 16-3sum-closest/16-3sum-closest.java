class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==0) return 0;
        int n = nums.length;
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[n-1];
        for(int i=0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int currsum = nums[i]+nums[j]+nums[k];
                if(currsum>target) k--;           
                else j++;
                      
                if(Math.abs(sum-target)>Math.abs(currsum-target)){
                    sum=currsum;
                }
            }
        }
        return sum;
    }
}