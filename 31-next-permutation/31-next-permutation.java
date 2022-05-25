class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
        int j = nums.length-1;
        while(j>=0 && nums[i]>=nums[j]){
            j--;
        }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    void reverse(int[] nums,int start){
        int end = nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    void swap(int[] nums,int start,int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
    }
}