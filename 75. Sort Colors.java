//1-pass
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


//2-pass

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
           else   if(nums[i]==1){
                one++;
            }else if(nums[i]==2){
                 two++;
             }
        }
            for(int i=0;i<n;i++){
                if (i < zero) {
                nums[i] = 0;
                }
        else if (i < zero + one) {
            nums[i] = 1;
        }
        else {
            nums[i] = 2;
        }
            }
        
    }
}


