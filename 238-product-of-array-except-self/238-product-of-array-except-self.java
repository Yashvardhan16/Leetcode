class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] =1;
        for(int i=1;i<nums.length;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        //1,1,2,6
        int right_prod =1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i] = ans[i] * right_prod;
            //4*3*2*1=24 , 4*3*1=12, 4*2=8,6*1=6
            right_prod = right_prod* nums[i];
        }
        
        return ans;
    }
}