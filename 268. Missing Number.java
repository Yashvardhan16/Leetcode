class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int sumofarray=0;
        int actualsumofarray=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
           sumofarray+=nums[i];
        }
        return actualsumofarray-sumofarray ;
    }
}
