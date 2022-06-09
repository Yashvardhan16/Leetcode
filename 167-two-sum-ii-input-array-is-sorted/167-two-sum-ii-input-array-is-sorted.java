class Solution {
    public int[] twoSum(int[] a, int t) {
        int start=0;
        int end = a.length-1;
        int[] ans = new int[2];
        while(start<end){
            if(a[start]+a[end]==t){
                ans[0] = start+1;
                ans[1] = end+1;
                return ans;
            }else if(a[start]+a[end]>t){
                end--;
            }else if(a[start]+a[end]<t){
                start++;
            }
        }
        return ans;
    }
}