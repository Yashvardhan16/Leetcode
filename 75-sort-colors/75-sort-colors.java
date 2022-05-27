class Solution {
    public void sortColors(int[] nums) {
        int x=0;
        int y=nums.length-1;
        int k=0;
        while(k<=y){
            if(nums[k]==0){
                nums[k] = nums[x];
                nums[x] =0;
                x++;
                
            }else if(nums[k]==2){
                nums[k] = nums[y];
                nums[y] =2;
                y--;
                k--;
            }
            k++;
        }
    }
}