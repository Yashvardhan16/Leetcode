class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      int count =0;
        int target = threshold*k;
        int runningsum=0;
        for(int i=0;i<arr.length;i++){
            runningsum +=arr[i];
            if(i<k-1) continue;
            if(i>k-1){
                runningsum -= arr[i-k];
            }
            if(runningsum>=target){
                count++;
            }
        }
        return count;
    }
}