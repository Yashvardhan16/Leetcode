// Moore's Voting Algorithm for least time and space complexity.
class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int count =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ans) count++;
            else count--;
            
            if(count==0){
                ans = nums[i];
                count=1;
            }
        }
        return ans;
    }
}
