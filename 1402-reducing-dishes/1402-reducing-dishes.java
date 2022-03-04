class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int total =0;
        int ans =0;
        int n = satisfaction.length;
     for(int i=n-1;i>=0 &&satisfaction[i]+total>0;i--){
            
            total+= satisfaction[i];
        ans+= total;
    }
    return ans;
    }
}