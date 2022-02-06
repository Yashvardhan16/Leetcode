class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] ans = new int[1001];
        for(int[] i: trips){
            ans[i[1]] += i[0];
            ans[i[2]] -= i[0];
        }
        for(int i: ans){
            capacity -= i;
            if(capacity<0) {
                return false;
            }
        }
        return true;
    }
}
