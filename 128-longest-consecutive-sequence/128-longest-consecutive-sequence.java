class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max_len=0;
        for(int i=0;i<n;i++){
            int currnums =nums[i];
            int curr_length=1;
            if(!set.contains(currnums-1)){
                while(set.contains(currnums+1)){
                    currnums+=1;
                    curr_length +=1;
                }
            }
            max_len = Math.max(max_len,curr_length);
        }
        return max_len;
    }
}