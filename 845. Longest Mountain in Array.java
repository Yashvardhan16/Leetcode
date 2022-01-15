class Solution {
    public int longestMountain(int[] arr) {
        int ans =0;
        int n = arr.length;
        for(int i=1;i<n;i++){
            int count =1;
            boolean flag =false;
            int j=i;
            while(j<n && arr[j]>arr[j-1]){
                j++;
                count++;
            }
            while(i!=j && j<n && arr[j]<arr[j-1]){
                j++;
                count++;
                flag=true;
            }
            if(i!=j && flag && count>2){
                ans =Math.max(ans,count);
                j--;
            }
            i=j;
        }
        return ans;
    }
}
