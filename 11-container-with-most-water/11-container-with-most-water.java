class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lo=0;
        int hi = n-1;
        int ans =0;
        while(lo<hi){
          int  area = (hi-lo)* Math.min(height[lo],height[hi]);
                
            
              if(area>ans){
                 ans=area;
              }
              else if(height[lo]>height[hi]){
                  hi--;
              }else
              lo++;
        }
              return ans;
    }
}