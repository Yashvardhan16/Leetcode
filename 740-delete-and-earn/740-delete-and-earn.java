class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int[] count = new int[10001];
        for(int i:nums){
            count[i]++;
        }
        int include=0;
        int exclude =0;
        
        for(int i=0;i<count.length;i++){
            int ni = exclude+count[i]*i;
            int ne= Math.max(include,exclude);
            
            include = ni;exclude=ne;
        }
        return Math.max(include,exclude);
    }
}