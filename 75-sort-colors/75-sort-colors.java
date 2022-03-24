class Solution {
    public void sortColors(int[] nums) {
        int y = nums.length-1;
        int x = 0;
        int index=0;
        while(index<=y){
            if(nums[index]==0){
                nums[index] = nums[x];
                nums[x]=0;
                x++;
            } if(nums[index]==2){
                nums[index] = nums[y];
                nums[y] = 2;
                y--;
                index--;
            }
            index++;
        }
    }
}