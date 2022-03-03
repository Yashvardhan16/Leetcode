class Solution {
    public int trap(int[] a) {
        int n = a.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = a[0];
         right[n-1] = a[n-1];
        for(int i=1;i<n;i++){
            left[i] =Math.max(left[i-1],a[i]);
            right[n-i-1] = Math.max(right[n-i],a[n-i-1]);
        }
       
        int ans =0;
        for(int i=0;i<n;i++){
            ans += (Math.min(left[i],right[i])) - a[i];
        }
        return ans;
    }
    
}
