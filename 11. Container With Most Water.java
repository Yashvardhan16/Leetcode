class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left=0;
        int right = n-1;
        int maxarea =Integer.MIN_VALUE;
        while(left<=right){
            maxarea = Math.max((right-left)*(Math.min(height[left],height[right])),maxarea);
            if(height[left]<height[right]){
                left++;
            }else if (height[left]>height[right]){
                right--;
            }else{
                left++;right--;
            }
        }
        return maxarea;
    }
}
