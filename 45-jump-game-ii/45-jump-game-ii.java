class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int last=0;
        int curr=0;
        int count =0;
        for(int i=0;i<n-1;i++){
            curr = Math.max(curr,nums[i]+i);
            
            if(i==last){
                count++;
                
                last=curr;
            }
        }
        return count;
    }
}