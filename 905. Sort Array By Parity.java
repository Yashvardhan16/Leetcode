class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
                int[] ans = new int[n];
        int k = n-1;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                  ans[j]=nums[i];
                j++;
            }else{
                ans[k]=nums[i];
                k--;
            }
        }
        return ans;
    }
}
