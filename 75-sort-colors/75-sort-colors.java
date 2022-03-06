class Solution {
    public void sortColors(int[] nums) {
        int n = 0;
        int m = nums.length-1;
        int index=0;
        while(index<=m){
            if(nums[index]==0){
                nums[index] = nums[n];
                nums[n]=0;
                n++;
                
            }
            if(nums[index]==2){
                nums[index] = nums[m];
                nums[m] =2;
                m--;
                index--;
            }
            index++;
        }
    }
}