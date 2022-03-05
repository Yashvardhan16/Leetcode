class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lo=0;
        int hi = n-1;
        int ans =Integer.MIN_VALUE;
        while(lo<hi){
     ans = Math.max((hi-lo)*(Math.min(height[lo],height[hi])),ans);
  if(height[lo]<height[hi]){
                  lo++;
              }
              else if(height[lo]>height[hi]){
                  hi--;
              }else{
              lo++;hi--;
        }
        }
            
              return ans;
    }
}