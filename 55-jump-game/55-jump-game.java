class Solution {
    public boolean canJump(int[] nums) {
        //compare i & i+1 jumps to see if we can get to and index
        //from where we can reach final target
        
        int n = nums.length;
       int reach =0;
       for(int i=0;i<=reach;i++){
           reach = Math.max(reach,nums[i]+i);
           if(reach>=n-1){
               return true;
           }
       }
        return false;
    }
}