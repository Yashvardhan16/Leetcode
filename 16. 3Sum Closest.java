class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int result =0;
        int d = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j =i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(d)>Math.abs(sum-target)){
                    d = sum-target;
                result =sum;
                }
                if(sum<target){
                    
                    j++;
                }else{k--;}
            }
        }
        return result;
    }
}
