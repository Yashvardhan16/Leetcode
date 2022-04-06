class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
return Math.max(help(nums,0,nums.length-1),help(nums,1,nums.length));
    } 
    int help(int[] nums ,int start , int end){
         int prevOne =0;
        int prevTwo =0;
        int max =0;
        
        for(int i=start;i<end;i++){
           max = Math.max(prevOne,prevTwo+nums[i]);
            prevTwo = prevOne;
            prevOne = max;
        }
        return max;
     }   
        
    }