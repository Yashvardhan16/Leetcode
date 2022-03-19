class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while(j>=0 && nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    
    void swap(int[] nums,int i,int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i]= temp;
    }
    
    void reverse(int[] nums,int start){
        int end = nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}