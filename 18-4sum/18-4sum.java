class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
        
        for(int j=i+1;j<n;j++){
            if(j>i+1 && nums[j]==nums[j-1]) continue;
            
            int left = j+1;
            int right = n-1;
            while(left<right){
            int sum = nums[i]+nums[j]+nums[left]+nums[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }
            
          else{
              List<Integer> res = new ArrayList();
              res.add(nums[i]);
               res.add(nums[j]);
               res.add(nums[left]);
               res.add(nums[right]);
              list.add(res);
              left++;
              right--;
              
              while(left<right && nums[left] ==nums[left-1]){
                  left++;
              }
              while(left<right && nums[right] ==nums[right+1]){
                  right--;
              }
          }
        }
        }
        }
        return list;
    }
}