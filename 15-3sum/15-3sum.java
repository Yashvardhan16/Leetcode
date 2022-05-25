class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum =  nums[j] + nums[k];
                if(sum==-nums[i]){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                       while (j < k && nums[j] == nums[j - 1]) j++; 
                while (j < k && nums[k] == nums[k + 1]) k--;  
                }
                else if(sum>-nums[i]){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}