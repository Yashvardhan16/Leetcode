class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<3){
            return n;
        }
        int slow = 2;
        int fast = 2;
       while(fast<n){
           if(nums[fast]!=nums[slow-2])
               nums[slow++] = nums[fast];
               fast++;
           
       }
        return slow;
        
    }
}
