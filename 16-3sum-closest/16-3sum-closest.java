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
                if(currsum>target){ 
                while(j<k && nums[k] == nums[k-1]){
                        k--;
                    }
                       k--;           }
                else  { while(j<k && nums[j+1] == nums[j]){
                        j++;
                    } j++;
                      }
                if(Math.abs(sum-target)>Math.abs(currsum-target)){
                    sum=currsum;
                }
            }
        }
        return sum;
    }
}