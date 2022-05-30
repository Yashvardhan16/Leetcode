class Solution {
    public int jump(int[] nums) {
        int steps =0;
        int count =0;
        int last=0;
        for(int i=0;i<nums.length-1;i++){
            steps = Math.max(steps,nums[i]+i);
            
            if(last==i){
               count++;
                last=steps;
            }
        }
        return count;
    }
}