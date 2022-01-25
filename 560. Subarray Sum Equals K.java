class Solution {
    public int subarraySum(int[] nums, int k) {
       int currsum =0;
        int result =0;
        Map<Integer,Integer> sum = new HashMap<>();
        sum.put(0,1);
        for(int i=0;i<nums.length;i++){
            currsum += nums[i];
            if(sum.containsKey(currsum-k)){
                result += sum.get(currsum-k);
            }
            sum.put(currsum,sum.getOrDefault(currsum,0)+1);
        }
        return result;
    }
}
