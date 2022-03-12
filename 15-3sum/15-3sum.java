class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
          Arrays.sort(nums);
      
        for(int i=0;i<nums.length-2;i++){
              int j = i+1;
        int k = nums.length-1;
            while(j<k){
            int sum = nums[j]+nums[k];
            if(sum==-nums[i]){
                list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }else if(sum>-nums[i]){
                k--;
            }else {
                j++;
            }
            }
        }
        return new ArrayList<>(list);
    }
}