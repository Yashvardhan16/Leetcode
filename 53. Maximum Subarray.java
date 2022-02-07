//Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum=0;
        int max=nums[0];
        for(int i=0;i<n;i++){
            sum +=nums[i];
             if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
           
        }
        return max;
    }
}

//Dynamic Programming

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max=nums[0];
        for(int i=1;i<n;i++){
            nums[i] =Math.max(nums[i],nums[i]+nums[i-1]);
           max=Math.max(max,nums[i]);
           
        }
        return max;
    }
}
