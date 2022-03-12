class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int initial_sum = nums[0]+nums[1]+nums[nums.length-1]; 
        for(int i=0;i<nums.length-2;i++){
        int j = i+1;
        int k = nums.length-1;
            while(j<k){
        int sum = nums[i] + nums[j] + nums[k];
                if(sum<target){
                    j++;
                }
                else {
                    k--;
                }
    
            if(Math.abs(sum-target)<Math.abs(initial_sum-target)){
                initial_sum = sum;
            }
            }
    }
        return initial_sum;
    }
}