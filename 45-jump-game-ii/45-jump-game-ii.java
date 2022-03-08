class Solution {
    public int jump(int[] nums) {
         int n = nums.length;
        int count=0;
        int curr=0;
        int last =0;
        for(int i=0;i<nums.length-1;i++){
            curr = Math.max(nums[i]+i,curr);

            if(i==last){
               count++;
          
               last = curr;

            }
        }
        return count;

    }
}
   