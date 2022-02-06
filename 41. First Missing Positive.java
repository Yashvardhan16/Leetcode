//Main Solution

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i] = n+1;
            }
        }
        
        for(int i=0;i<n;i++){
            int index = Math.abs(nums[i]);
            if(index>n){
                continue;
            }
            else{
                index--;
            }if(nums[index]>0){
            nums[index] = -nums[index];
        }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}

//Naive Approach
class Solution {
    public int firstMissingPositive(int[] nums) {
       Set<Integer> set = new HashSet();
        for(int i:nums){
            set.add(i);
        }
        int i=1;
        
            while(set.contains(i)){
                i++;
            }
        
        return i;
    }
}
