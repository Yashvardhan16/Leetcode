class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int ans = 0;
        for(int i=0;i<height.length;i++){
 ans = Math.max(ans,(right-left)*Math.min(height[left],height[right]));
                
                if(height[left]<height[right]) left++;
                else right--;
        }
        return ans;
    }
}