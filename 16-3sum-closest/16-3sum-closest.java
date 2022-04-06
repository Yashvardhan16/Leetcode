class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int closest_sum = nums[0]+nums[1]+nums[n-1];
        
        for(int i=0;i<n-2;i++){
            int j =i+1;
            int k = n-1;
            int curr_sum=0;
            while(j<k){
                int sum = nums[i]+ nums[j]+nums[k];
                if(sum>target){
                    k--;
                }
                else{
                    j++;
                }
                if(Math.abs(closest_sum-target)>Math.abs(sum-target)){
                    closest_sum = sum;
                }
            }
        }
        return closest_sum;
    }
}